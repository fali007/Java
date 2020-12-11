package com.example.demo.controller;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class junitDemoControllerTest {
    junitDemoContoller controller=new junitDemoContoller();
    @Test
    void testController(){
        String var="Hello World";
        assertEquals(var,controller.home());
    }
}
