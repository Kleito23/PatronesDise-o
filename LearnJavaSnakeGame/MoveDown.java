package com.github.karabosithole;


public class MoveDown implements MoveStrategy{
    @Override
    public void move(int[] x,int[] y, int dot_size){
        y[0]+=dot_size;
    }
}