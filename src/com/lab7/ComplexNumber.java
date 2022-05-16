package com.lab7;

public class ComplexNumber {
    public byte x;
    public byte y;
    private String complexNumber;

    public byte getX() {
        System.out.println(x);
        return x;
    }

    public void setX(byte x) {
        this.x = x;
    }

    public byte getY() {
        System.out.println(y);
        return y;
    }

    public void setY(byte y) {
        this.y = y;
    }
    public String getComplexNumber() {
        if (y < 0) {
            complexNumber = x + y + "i";
        } else {
            complexNumber = x + "+" + y + "i";
        }
        System.out.println(complexNumber);
        return complexNumber;
    }
}
