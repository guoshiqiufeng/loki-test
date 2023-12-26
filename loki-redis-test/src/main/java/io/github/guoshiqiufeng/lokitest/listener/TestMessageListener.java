package io.github.guoshiqiufeng.lokitest.listener;

import io.github.guoshiqiufeng.loki.Listener;
import io.github.guoshiqiufeng.loki.MessageContent;
import io.github.guoshiqiufeng.loki.annotation.MessageListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@MessageListener(topic = "loki")
@Component
public class TestMessageListener implements Listener<String> {
    @Override
    public void onMessage(MessageContent<String> entity) {
        log.info("entity:{}", entity);
    }
}