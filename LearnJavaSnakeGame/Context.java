package com.github.karabosithole;

public class Context {
    private MoveStrategy strat;
    
    public void setStrategy(MoveStrategy strat){
        this.strat=strat;
    }
    
    public void move(int[] x, int[] y, int dot_size){
        strat.move(x,y,dot_size);
    }
}
