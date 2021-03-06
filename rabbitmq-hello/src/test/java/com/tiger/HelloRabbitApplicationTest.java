package com.tiger;

import com.tiger.produce.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HelloRabbitApplication.class)
public class HelloRabbitApplicationTest {

    @Autowired
    private Sender sender;

    @Test
    public void hello(){
        sender.send();
    }
}