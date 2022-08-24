package com.tribble.tribbleflinkcore.study;

import org.apache.flink.api.common.RuntimeExecutionMode;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/**
 * @author lifan
 * @since 2022/7/19 5:43 PM
 */
public class PrintSinkDemo {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setRuntimeMode(RuntimeExecutionMode.AUTOMATIC);
        env.setParallelism(1);
        DataStreamSource<Long> dataStreamSource = env.fromSequence(1L, 10L);

        dataStreamSource.print("普通打印:");
        //---------------
        //控制台显示为红色
        dataStreamSource.printToErr("错误打印:");
        env.execute();
    }
}
