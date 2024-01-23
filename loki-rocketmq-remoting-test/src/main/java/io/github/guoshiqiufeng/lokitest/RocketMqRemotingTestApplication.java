package io.github.guoshiqiufeng.lokitest;

import io.github.guoshiqiufeng.loki.autoconfigure.register.LokiMapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@LokiMapperScan
@SpringBootApplication
public class RocketMqRemotingTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RocketMqRemotingTestApplication.class, args);
    }

}
