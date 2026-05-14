package com.sudoku.websocket;

public class MoveResponse {

    private int row;
    private int col;
    private int value;
    private boolean valid;

    public MoveResponse() {
    }

    public MoveResponse(
            int row,
            int col,
            int value,
            boolean valid) {

        this.row = row;
        this.col = col;
        this.value = value;
        this.valid = valid;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
}