package com.example.demo.mathutils;

public class MathUtils {
    VerifyiAnswer verifyiAnswer=new VerifyiAnswer();
    public int add(int a,int b){
        int ans=a+b;
        return verifyiAnswer.verifyi(a,b,ans);
    }
}
