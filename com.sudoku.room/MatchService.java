package com.sudoku.room;

import java.util.LinkedList;
import java.util.Queue;

import org.springframework.stereotype.Service;

@Service
public class MatchService {

    private Queue<String> waitingPlayers = new LinkedList<>();

    public GameRoom findMatch(String player){

        if(waitingPlayers.isEmpty()){

            waitingPlayers.add(player);

            return null;

        }

        String opponent = waitingPlayers.poll();

        return new GameRoom(opponent,player);

    }

}