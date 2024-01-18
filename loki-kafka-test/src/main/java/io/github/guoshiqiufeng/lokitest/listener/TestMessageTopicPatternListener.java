package io.github.guoshiqiufeng.lokitest.listener;

import io.github.guoshiqiufeng.loki.Listener;
import io.github.guoshiqiufeng.loki.MessageContent;
import io.github.guoshiqiufeng.loki.annotation.MessageListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@MessageListener(topicPattern = "loki*", consumerGroup = "test-pattern-group")
@Component
public class TestMessageTopicPatternListener implements Listener<String> {
    @Override
    public void onMessage(MessageContent<String> entity) {
        log.info("TestMessageTopicPatternListener entity:{}", entity);
    }
}
