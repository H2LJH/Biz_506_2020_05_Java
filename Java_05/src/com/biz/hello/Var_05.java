package com.biz.hello;

import java.util.Random;

public class Var_05 {
    // 임의숫자를 50~99 까지의 숫자를 출력
    public static void main(String[] args)
    {
        Random rnd = new Random();
        int a = rnd.nextInt(50)+50;
        int b = rnd.nextInt(51)+50; 
                
        System.out.println("a의 값 : " + a);
        System.out.println("b의 값 : " + b);
        
        // 375 = (X +(X*0.1))의 계산의 만들어진 값이다. X는 얼마인가
    }

}
