package com.czz.spring.mq;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

@Component
@RocketMQMessageListener(consumerGroup = "czz", topic = "czz")
public class RocketMqTest implements RocketMQListener<String> {

    @Override
    public void onMessage(String xq) {
        System.out.println(xq + "9999999");
    }
}
