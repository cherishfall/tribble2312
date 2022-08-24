package com.tribble.tribbleflinkcore.study.chapter4;

import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/**
 * @author lifan
 * @since 2022/7/19 5:28 PM
 */
public class MapDemo {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment senv = StreamExecutionEnvironment.getExecutionEnvironment();
        DataStream<Integer> dataStream = senv.fromElements(1, 2, -3, 0, 5, -9, 8);

        DataStream<String> lambdaStream = dataStream
                .map(input -> "lambda input : " + input + ", output : " + (input * 2));
        lambdaStream.print();

        DataStream<String> methodRefStream = dataStream.map(MapDemo::convert2String);
        methodRefStream.print("这是提示:");

        senv.execute();


    }

    static String convert2String(Integer input) {
        return " method reference input : " + input + ", output : " + (input * 2);
    }
}
