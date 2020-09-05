package br.com.lanhellas.springkafkaschemaregistry;

import br.com.lanhellas.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @KafkaListener(topics = "${app.topic}")
    public void consumeCustomer(Customer customer, Acknowledgment acknowledgment){
        logger.info("Reading customer {}-{}", customer.getId(), customer.getName());
        acknowledgment.acknowledge();
    }

}
