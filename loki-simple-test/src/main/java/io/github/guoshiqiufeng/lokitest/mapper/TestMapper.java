package io.github.guoshiqiufeng.lokitest.mapper;

import io.github.guoshiqiufeng.loki.annotation.SendMessage;
import io.github.guoshiqiufeng.loki.core.mapper.BaseMapper;
import io.github.guoshiqiufeng.lokitest.entity.TestEntity;

import java.util.concurrent.CompletableFuture;

/**
 * @author yanghq
 * @version 1.0
 * @since 2023/11/24 10:38
 */
public interface TestMapper extends BaseMapper<TestEntity> {

    @SendMessage(topic = "loki", tag = "custom", message = "#entity.message", messageKey = "#entity.id")
    void customSend(TestEntity entity);

    @SendMessage(topic = "loki", tag = "custom", message = "#entity.message", messageKey = "#entity.id")
    String customSend2(TestEntity entity);

    @SendMessage(topic = "loki", tag = "custom", async = true, message = "#entity.message", messageKey = "#entity.id")
    CompletableFuture<String> customAsyncSend(TestEntity entity);

}
