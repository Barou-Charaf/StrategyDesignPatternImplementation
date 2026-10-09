package org.example.context;

import org.example.strategy.Strategy;

public class Context {

    Strategy strategy;
    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
    public void doOperation(){
        strategy.saySomething();
    }

}
