package com.tribble.tribbleflinkcore.study.chapter4;

import org.apache.flink.api.common.typeinfo.Types;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;

import javax.xml.crypto.Data;

/**
 * @author lifan
 * @since 2022/7/19 7:27 PM
 */
public class FlatMapDemo {
    public static void main(String[] args) {
        StreamExecutionEnvironment senv = StreamExecutionEnvironment.getExecutionEnvironment();
        DataStream<String> dataStream = senv.fromElements("Hello World", "Hello this is Flink");
        DataStream<String> words = dataStream.flatMap((String input, Collector<String> collector) -> {
            for (String word : input.split(" ")) {
                collector.collect(word);
            }
        }).returns(Types.STRING);
        words.print();
    }
}
