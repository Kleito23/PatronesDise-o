package com.github.karabosithole;


public class MoveLeft implements MoveStrategy{
    @Override
    public void move(int[] x,int[] y, int dot_size){
        x[0]-=dot_size;
    }
}
