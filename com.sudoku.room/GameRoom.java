package com.sudoku.room;

import java.util.UUID;

public class GameRoom {

    private String roomId;

    private String player1;

    private String player2;

    private long startTime;

    public GameRoom(String p1,String p2){

        this.roomId = UUID.randomUUID().toString();

        this.player1 = p1;

        this.player2 = p2;

        this.startTime = System.currentTimeMillis();

    }

    public String getRoomId() {
        return roomId;
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public long getStartTime() {
        return startTime;
    }

}