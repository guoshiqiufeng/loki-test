package io.github.guoshiqiufeng.lokitest.controller;

import io.github.guoshiqiufeng.lokitest.entity.TestEntity;
import io.github.guoshiqiufeng.lokitest.mapper.TestMapper;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Slf4j
@RestController
public class TestController {

    @Resource
    private TestMapper testMapper;

    @GetMapping("send")
    public String send() {
        TestEntity entity = new TestEntity();
        entity.setId("9521");
        entity.setMessage("test");
        String messageId = testMapper.send(entity);
        log.debug("send messageId:{}", messageId);
        return "success";
    }

    @GetMapping("sendAsync")
    public String sendAsync() {
        TestEntity entity = new TestEntity();
        entity.setId("9521");
        entity.setMessage("sendAsync");
        testMapper.sendAsync(entity);
        return "success";
    }

    @GetMapping("customSend")
    public String customSend() {
        TestEntity entity = new TestEntity();
        entity.setId("9521");
        entity.setMessage("test");
        testMapper.customSend(entity);
        return "success";
    }

    @GetMapping("deliverySend")
    public String deliverySend() {
        TestEntity entity = new TestEntity();
        entity.setId("9521");
        entity.setMessage("test");
        testMapper.deliverySend(entity);
        return "success";
    }

    @GetMapping("customSend2")
    public String customSend2() {
        TestEntity entity = new TestEntity();
        entity.setId("9521");
        entity.setMessage("test");
        String messageId = testMapper.customSend2(entity);
        log.debug("send messageId:{}", messageId);
        return "success";
    }

    @GetMapping("customAsyncSend")
    public String customAsyncSend() throws ExecutionException, InterruptedException {
        TestEntity entity = new TestEntity();
        entity.setId("9521");
        entity.setMessage("test");
        CompletableFuture<String> stringCompletableFuture = testMapper.customAsyncSend(entity);
        String messageId = stringCompletableFuture.get();
        log.debug("send messageId:{}", messageId);
        return "success";
    }
}
