package io.github.guoshiqiufeng.lokitest.listener;

import io.github.guoshiqiufeng.loki.MessageContent;
import io.github.guoshiqiufeng.loki.MessageListener;
import io.github.guoshiqiufeng.lokitest.entity.TestEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TestListener implements MessageListener<TestEntity> {
    @Override
    public void onMessage(MessageContent<TestEntity> entity) {
        log.info("entity:{}", entity);
    }
}