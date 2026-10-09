package org.example.ducks;

import org.example.behaviors.Fly;
import org.example.behaviors.Run;
import org.example.behaviors.Swim;

public class Main2 {
    public static void main(String[] args) {
        Duck duck1 =new DuckTypeA();
        Duck duck2 =new DuckTypeB();
        Duck duck3 =new DuckTypeC();
        System.out.println("duck one =============================");
        duck1.addMove(new Fly());
        duck1.addMove(new Swim());
        duck1.iCanDo();
        System.out.println("duck2 ==================================");
        duck2.addMove(new Run());
        duck2.addMove(new Swim());
        duck2.iCanDo();
        System.out.println("duck3 ================================");
        duck3.addMove(new Run());
        duck3.addMove(new Fly());
        duck3.addMove(new Swim());
        duck3.iCanDo();


    }
}
