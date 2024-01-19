package io.github.guoshiqiufeng.lokitest.entity;

import io.github.guoshiqiufeng.loki.annotation.MessageKey;
import io.github.guoshiqiufeng.loki.annotation.MessageName;
import lombok.Data;

/**
 * @author yanghq
 * @version 1.0
 * @since 2023/11/24 10:37
 */
@Data
@MessageName(topic = "loki", tag = "create")
public class TestEntity {

    @MessageKey
    private String id;

    private String message;
}

