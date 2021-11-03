package com.codecool;

import java.io.IOException;

public class Calculator {
    private int a;
    private int b;

    public int getSum() {
        return a + b;
    }

    // ne osszá nullával.
    public int getDivision() throws IOException {
        if(b==0){
            throw new ArithmeticException();
        }else{
            return a/b;
        }

    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
