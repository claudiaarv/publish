package com.project.db.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Message implements Serializable {
    private int id;
    private String msg;
    private Date fecha;
    private  String author;

}
