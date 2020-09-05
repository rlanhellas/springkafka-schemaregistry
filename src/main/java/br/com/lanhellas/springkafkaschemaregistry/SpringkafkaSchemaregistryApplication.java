package br.com.lanhellas.springkafkaschemaregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SpringkafkaSchemaregistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringkafkaSchemaregistryApplication.class, args);
    }

}
