package com.felix.demo.producer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface Producer {
    String OUTPUT="output";
    @Output(OUTPUT)
    MessageChannel outgoing();
}
