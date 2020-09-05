package br.com.lanhellas.springkafkaschemaregistry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produce")
public class Producer {

    @GetMapping
    public void produce(){

    }

}
