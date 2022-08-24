package com.tribble.tribblemybatis.controller;

import com.alibaba.fastjson.JSON;
import com.tribble.tribblemybatis.constants.BusinessConstants;
import com.tribble.tribblemybatis.entity.vo.StandardResultVo;
import com.tribble.tribblemybatis.service.CardParkRelService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

/**
 * 卡券和可使用车场对应关系 controller
 * @author lifan
 * @since 2022/8/9 3:10 PM
 */
@RestController
@RequestMapping("/cardParkRel/v2")
@Slf4j
public class CardParkRelController {
    private static final String EMPTY_STR = "";

    //private static final Logger log = Logger.getLogger(CardParkRelController.class);
    private final CardParkRelService cardParkRelService;

    @Autowired
    public CardParkRelController(CardParkRelService cardParkRelService) {
        this.cardParkRelService = cardParkRelService;
    }

    /**
     * 根据车场id列表，查询可用卡劵编号id列表
     * @see <a href="http://192.168.10.114:5000/showdoc/index.php?s=/22&page_id=10147">根据车场查询可使用券种id列表</a>
     * */
    @RequestMapping(value = "/findByParkIds", method = RequestMethod.POST)
    @ResponseBody
    public void findRelByParkIds(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding(BusinessConstants.CONSTANTS_CHARACTER_ENCODING);
        PrintWriter pw = null;
        try {
            pw = response.getWriter();
            String requestParam = this.getRequestBody(request);
            log.info("CardParkRelController.findRelByParkIds 入参【" + requestParam + "】");
            if(StringUtils.isBlank(requestParam)){
                throw new IllegalArgumentException("入参不能为空");
            }
            List<String> parkIdList = extractParkIdList(requestParam);
            if(CollectionUtils.isEmpty(parkIdList)) {
                throw new IllegalArgumentException("车场id列表不能为空");
            }
            List<String> cardIdList = cardParkRelService.findCardIdsByParkIds(parkIdList);
            String cardIdsStr = CollectionUtils.isEmpty(cardIdList)
                    ? EMPTY_STR : StringUtils.join(cardIdList, ",");
            Map<String, String> resMap = Collections.singletonMap("card_ids", cardIdsStr);
            pw.write(JSON.toJSONString(StandardResultVo.successResult(resMap)));
        } catch (Exception e) {
            log.error("CardParkRelController.findRelByParkIds has exception : " + e.getMessage());
            e.printStackTrace();
            pw.write(JSON.toJSONString(StandardResultVo.errorResult(e.getMessage())));
        }
    }

    /**
     * 提取车场ID列表
     * */
    private List<String> extractParkIdList(String requestParam) {
        String parkIdsStr = JSON.parseObject(requestParam).getString("park_ids");
        if(StringUtils.isBlank(parkIdsStr)) {
            return Collections.emptyList();
        }

        String[] parkIdArr = parkIdsStr.split(",");
        Set<String> parkIdSet = new HashSet<>();
        for(String parkId : parkIdArr) {
            if(StringUtils.isNotBlank(parkId)) {
                parkIdSet.add(parkId.trim());
            }
        }
        return new ArrayList<>(parkIdSet);
    }

    public String getRequestBody(HttpServletRequest request) throws Exception {
        ServletInputStream input = request.getInputStream();
        StringBuffer buffer = new StringBuffer();
        InputStreamReader inputRead = new InputStreamReader(input, "utf-8");
        BufferedReader reder = new BufferedReader(inputRead);
        String requestBody = "";

        while((requestBody = reder.readLine()) != null) {
            buffer.append(requestBody);
        }

        return buffer.toString();
    }

}
