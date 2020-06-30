package com.sohan.note;


public class Homework1{
    public static void main(String args[]){
        int y = fun(-3);
        System.out.println("y="+y);
    }
    public static int fun(int x) {
        int y;
        if (x>0){
            y = x+ 3;
        }
        else if (x==0){
            y = 0;
        }else {
            y = x * x -1;
        }
        return y;
    }




}
