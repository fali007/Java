package com.felix.demo.consumer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(Consumer.class)
public class consumerConfig {
}
