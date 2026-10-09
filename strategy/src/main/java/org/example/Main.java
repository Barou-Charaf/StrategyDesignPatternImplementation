package org.example;

import org.example.strategy.Strategy;
import org.example.strategy.StrategyImpl1;
import org.example.strategy.StrategyImpl2;
import org.example.strategy.StrategyImpl3;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // testing the strategy design pattern interacting with user ..
        Strategy strategy ;
        while (true) {
            System.out.println(" what is the strategy implementation you want to use (choose between 1and 3(included))");
            int wishStrategy= scanner.nextInt();
            scanner.nextLine();
            switch (wishStrategy) {
                case 1:{
                    strategy = new StrategyImpl1();
                    strategy.saySomething();
                    break;
                }
                case 2:{
                    strategy = new StrategyImpl2();
                    strategy.saySomething();
                    break;
                }
                case 3:{
                    strategy = new StrategyImpl3();
                    strategy.saySomething();
                    break;
                }
                default:{
                    continue;
                }
            }
            System.out.println("type yes to quite");
            if(scanner.nextLine().toUpperCase().startsWith("Y")){
                break;
            }
        }

    }
}