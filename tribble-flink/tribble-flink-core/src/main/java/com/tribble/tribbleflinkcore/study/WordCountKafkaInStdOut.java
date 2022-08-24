package com.tribble.tribbleflinkcore.study;

import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.api.common.typeinfo.Types;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.configuration.RestOptions;
import org.apache.flink.streaming.api.TimeCharacteristic;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.windowing.assigners.TumblingProcessingTimeWindows;
import org.apache.flink.streaming.api.windowing.time.Time;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;
import org.apache.flink.util.Collector;

import java.util.Properties;

/**
 * @author lifan
 * @since 2022/7/19 5:08 PM
 */
public class WordCountKafkaInStdOut {
    public static void main(String[] args) throws Exception {
        Configuration configuration = new Configuration();
        configuration.setInteger(RestOptions.PORT, 8082);

        // 设置Flink执行环境
        StreamExecutionEnvironment env =
                StreamExecutionEnvironment.createLocalEnvironment(configuration);

        // Kafka参数
        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", "192.168.20.107:9092");
        properties.setProperty("group.id", "flink-group7");
        String inputTopic = "Shakespeare";

        // Source
        FlinkKafkaConsumer<String> consumer =
                new FlinkKafkaConsumer<>(inputTopic, new SimpleStringSchema(), properties);
        DataStream<String> stream = env.addSource(consumer);

        DataStream<Tuple2<String, Integer>> wordCount = stream
                .flatMap((String line, Collector<Tuple2<String, Integer>> collector) -> {
                    String[] tokens = line.split("\\s");
                    // 输出结果 (word, 1)
                    for (String token : tokens) {
                        if (token.length() > 0) {
                            collector.collect(new Tuple2<>(token, 1));
                        }
                    }
                })
                .returns(Types.TUPLE(Types.STRING, Types.INT))
                .keyBy(tuple -> tuple.f0)
                .window(TumblingProcessingTimeWindows.of(Time.seconds(5L)))
                .sum(1);

        // Sink
        wordCount.printToErr();

        // execute
        env.execute("kafka streaming word count");
    }
}
