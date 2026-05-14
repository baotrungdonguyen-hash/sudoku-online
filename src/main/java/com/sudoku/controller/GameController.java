package com.sudoku.controller;

import com.sudoku.RoomManager;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

import org.springframework.stereotype.Controller;

import java.util.*;

@Controller
public class GameController {

    @MessageMapping("/move")
    @SendTo("/topic/game")
    public Map<String,Object> move(
            Map<String,Object> data
    ){
        return data;
    }

    @MessageMapping("/create-room")
    @SendTo("/topic/room")
    public Map<String,String> createRoom(
            Map<String,String> data
    ){

        String roomId =
                UUID.randomUUID()
                .toString()
                .substring(0,6);

        RoomManager.rooms.put(
                roomId,
                new ArrayList<>()
        );

        Map<String,String> result =
                new HashMap<>();

        result.put("roomId",roomId);

        return result;
    }

}