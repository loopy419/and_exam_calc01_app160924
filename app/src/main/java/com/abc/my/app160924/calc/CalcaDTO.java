package com.abc.my.app160924.calc;

/**
 * Created by 1027 on 2016-09-24.
 */

public class CalcaDTO {
    private int num1;
    private int num2;

    public void setResult(int result) {
        this.result = result;
    }

    public int getResult() {

        return result;
    }

    private int result;

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
