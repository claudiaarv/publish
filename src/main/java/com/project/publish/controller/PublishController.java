package com.project.publish.controller;

import com.project.db.entity.Message;
import com.project.publish.service.PublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ThreadLocalRandom;

@RestController
public class PublishController {

    @Autowired
    private PublishService service;

    @PostMapping("publish/msg")
    public void recibePublish(@RequestBody Message message){
        service.sendMessage(message);
    }

    @GetMapping("publish/test")
    public void sendMessage(){
        Message message = new Message();
        message.setAuthor("Claudia");
        message.setMsg("Prueba");
        service.sendMessage(message);
    }
}
