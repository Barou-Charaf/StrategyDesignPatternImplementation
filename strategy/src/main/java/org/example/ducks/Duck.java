package org.example.ducks;

import org.example.behaviors.Move;

import java.util.ArrayList;
import java.util.List;

public abstract class Duck {
    List<Move> moves=new ArrayList<>();
    public void addMove(Move move){
        if(move==null){
            return;
        }
        else{
            moves.add(move);
        }

    }

    public void iCanDo() {
        for (var move :moves) {
            move.move();
        }
    }
}
