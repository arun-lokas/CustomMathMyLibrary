package com.lokas.myutils;

/**
 * Created by Lokas Android on 12/14/2017.
 */

public class MyMath {

    public static int Plus(int a,int b){
        return a+b;
    }

    public static int Minus(int a,int b){
        return a-b;
    }

    public static int Times(int a,int b){
        return a*b;
    }

    public static int Div(int a,int b){
        if (b == 0){
            throw new IllegalArgumentException("Div by Zero error");
        }else {
            return a/b;
        }
    }
}
