package org.example;

import org.example.context.Context;
import org.example.strategy.Strategy;
import org.example.strategy.StrategyImpl1;
import org.example.strategy.StrategyImpl2;
import org.example.strategy.StrategyImpl3;

import java.util.Scanner;


public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Context context = new Context();
        while (true) {
            System.out.println(" what is the strategy implementation you want to use (choose between 1and 3(included))");
            int wishStrategy= scanner.nextInt();
            scanner.nextLine();
            switch (wishStrategy) {
                case 1:{
                   context.setStrategy(new StrategyImpl1());
                   context.doOperation();
                    break;
                }
                case 2:{
                  context.setStrategy(new StrategyImpl2());
                  context.doOperation();
                    break;
                }
                case 3:{
                    context.setStrategy(new StrategyImpl3());
                    context.doOperation();
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