package com.store.notification.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl extends GenericServiceImpl{

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private static String mailFrom;

    public static String convertToObject(String message){
        return "";
    }

    public static String constructContent(){
        return "";
    }

    public static void sendEmail(String content, String email){

    }
}
