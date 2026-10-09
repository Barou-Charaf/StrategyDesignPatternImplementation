package org.example;

import org.example.strategy.Strategy;
import org.example.strategy.StrategyImpl1;
import org.example.strategy.StrategyImpl2;
import org.example.strategy.StrategyImpl3;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // testing the ability to change behaviour during the excution .
        Strategy strategy = new StrategyImpl1();
        strategy.saySomething();
        strategy=new StrategyImpl2();
        strategy.saySomething();
        strategy=new StrategyImpl3();
        strategy.saySomething();

    }
}