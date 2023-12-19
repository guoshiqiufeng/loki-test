package io.github.guoshiqiufeng.lokitest;

import io.github.guoshiqiufeng.loki.autoconfigure.register.LokiMapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@LokiMapperScan
@SpringBootApplication
public class KafkaTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaTestApplication.class, args);
    }

}
