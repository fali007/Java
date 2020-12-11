package com.felix.demo.producer;

import com.felix.demo.database.personRepository;
import com.felix.demo.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class kafkaSchedulder {
    @Autowired
    private personRepository repository;
    @Autowired
    public final MessageProducer messageProducer;
    public kafkaSchedulder(MessageProducer messageProducer){
        this.messageProducer=messageProducer;
    }
    @Scheduled(fixedRate = 10003)
    public void kafkaPusher(){
        Optional<Message> msg=repository.findById((int) (System.currentTimeMillis()%128));
        if(msg.isPresent()){
            messageProducer.sendMessage(msg.get());
        }
        else{
            Message mess=Message.builder().name("John").age(10).city("Delhi").timeStamp(System.currentTimeMillis()).build();
            messageProducer.sendMessage(mess);
        }
    }
}
