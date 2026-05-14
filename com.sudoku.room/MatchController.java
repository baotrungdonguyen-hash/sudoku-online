package com.sudoku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import com.sudoku.room.GameRoom;
import com.sudoku.room.MatchService;

@Controller
public class MatchController {

    @Autowired
    private MatchService matchService;

    @Autowired
    private SimpMessagingTemplate template;

    @MessageMapping("/findMatch")
    public void findMatch(String player){

        GameRoom room = matchService.findMatch(player);

        if(room != null){

            template.convertAndSend(

                "/topic/match/" + room.getRoomId(),

                room

            );

        }

    }

}