package com.project.publish.service;

import com.project.db.entity.Message;
import com.project.publish.remote.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublishService {

    @Autowired
    private Producer producer;

    public void sendMessage(Message message) {
        producer.send(message);
    }
}
