package com.tribble.tribblemysql.po;

import java.io.Serializable;

public class UserInfo implements Serializable {
    private Integer id;
    private String userName;
    private String userNickname;

    public UserInfo() {
    }

    public static UserInfo saas() {
        UserInfo userInfo = new UserInfo();
        userInfo.id = 1;
        userInfo.userName = "saas";
        userInfo.userNickname = "saas";
        return userInfo;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNickname() {
        return this.userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }
}
