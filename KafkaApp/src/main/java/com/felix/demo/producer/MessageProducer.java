package com.felix.demo.producer;

import com.felix.demo.message.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Service
@Slf4j
public class MessageProducer {
    private final Producer producer;
    public MessageProducer(Producer producer){
        this.producer=producer;
    }
    public void sendMessage(final Message message){
        log.info(String.format("Message - %s is being prepared to send to Kafka",message));
        MessageChannel messageChannel=producer.outgoing();
        messageChannel.send(MessageBuilder
            .withPayload(message)
            .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
            .build());
        log.info(String.format("Message - %s is send to Kafka",message));
    }
}
