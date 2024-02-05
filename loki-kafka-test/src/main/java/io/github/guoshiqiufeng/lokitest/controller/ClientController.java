package io.github.guoshiqiufeng.lokitest.controller;

import cn.hutool.core.util.IdUtil;
import cn.hutool.json.JSONUtil;
import io.github.guoshiqiufeng.loki.support.core.producer.ProducerRecord;
import io.github.guoshiqiufeng.loki.support.core.producer.ProducerResult;
import io.github.guoshiqiufeng.loki.support.kafka.KafkaClient;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

/**
 * @author yanghq
 * @version 1.0
 * @since 2024/1/24 16:54
 */
@Slf4j
@RequestMapping("/client")
@RestController
public class ClientController {

    @Resource
    private KafkaClient kafkaClient;

    @GetMapping("send")
    public String send() throws ExecutionException, InterruptedException {
        ProducerRecord record = new ProducerRecord();
        record.setTopic("loki");
        record.setMessage(IdUtil.getSnowflakeNextIdStr());
        ProducerResult result = kafkaClient.sendAsync(record).get();
        log.debug("send result:{}", JSONUtil.toJsonStr(result));
        return "success";
    }
}
