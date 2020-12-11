package com.felix.demo.producer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(Producer.class)
public class producerConfig {
}
