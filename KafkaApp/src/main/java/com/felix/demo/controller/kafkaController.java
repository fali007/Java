package com.felix.demo.controller;

import com.felix.demo.database.personRepository;
import com.felix.demo.message.Message;
import com.felix.demo.producer.MessageProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class kafkaController {
    private static final Logger logger= LoggerFactory.getLogger(kafkaController.class);
    @GetMapping("/index")
    public String index(){
        logger.info("Index function called");
        return "Hello World";
    }

    public final MessageProducer messageProducer;
    public kafkaController(MessageProducer messageProducer){
        this.messageProducer=messageProducer;
    }
    @PostMapping("/greeting")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void greeting(@RequestBody Message message){
        Message mess=Message.builder().name(message.getName()).age(message.getAge()).city(message.getCity()).timeStamp(System.currentTimeMillis()).build();
        messageProducer.sendMessage(mess);
    }

    @Autowired
    private personRepository repository;
    @GetMapping("/find/{id}")
    public Message find(@PathVariable("id") int id){
        logger.info(String.format("Querying mongo for id - %d",id));
        Optional<Message> msg=repository.findById(id);
        if(msg.isPresent()) {
            messageProducer.sendMessage(msg.get());
            return msg.get();
        }
        else{
            Message mess=Message.builder().name("John").age(10).city("Delhi").timeStamp(System.currentTimeMillis()).build();
            messageProducer.sendMessage(mess);
            return mess;
        }
    }
    @GetMapping("/get/{name}")
    public Message getRating(@PathVariable String name) {
        Optional<Message> val=repository.findByName(name);
        if(val.isPresent()){
            return val.get();
        }
        else{
            Message mess=Message.builder().name("John").age(10).city("Delhi").timeStamp(System.currentTimeMillis()).build();
            messageProducer.sendMessage(mess);
            return mess;
        }
    }
}
