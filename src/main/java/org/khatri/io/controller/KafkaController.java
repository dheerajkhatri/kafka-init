package org.khatri.io.controller;

import org.khatri.io.service.Consumer;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KafkaController {
    private KafkaTemplate<String, String> template;
    private Consumer consumer;

    public KafkaController(KafkaTemplate<String, String> template, Consumer consumer) {
        this.template = template;
        this.consumer = consumer;
    }

    @GetMapping("/kafka/produce")
    public void produce(@RequestParam String message) {
        template.send("testTopic", message);
    }

    @GetMapping("/kafka/messages")
    public List<String> getMessages() {
        return consumer.getMessages();
    }
}
