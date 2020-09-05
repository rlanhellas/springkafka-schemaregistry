package br.com.lanhellas.springkafkaschemaregistry;

import br.com.lanhellas.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produce")
public class Producer {

    @Value("${app.topic}")
    private String topic;

    private final KafkaTemplate<String, Customer> customerKafkaTemplate;

    public Producer(KafkaTemplate<String, Customer> customerKafkaTemplate) {
        this.customerKafkaTemplate = customerKafkaTemplate;
    }

    @GetMapping("/{id}")
    public void produce(@PathVariable int id){
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName("RONALDO");

        customerKafkaTemplate.send(topic, String.valueOf(customer.getId()), customer);
    }

}
