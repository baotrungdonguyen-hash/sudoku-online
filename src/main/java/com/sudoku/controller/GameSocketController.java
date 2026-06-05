package com.sudoku.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;

import org.springframework.messaging.handler.annotation.Payload;

import org.springframework.messaging.simp.SimpMessagingTemplate;

import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller
public class GameSocketController {

    private final SimpMessagingTemplate template;

    public GameSocketController(
        SimpMessagingTemplate template
    ){

        this.template = template;
    }

    @MessageMapping("/game.move")
    public void move(

        @Payload
        Map<String,Object> data

    ){

        String room =
        data.get("room").toString();

        template.convertAndSend(

            "/topic/room/" + room,

            data

        );

    }

}