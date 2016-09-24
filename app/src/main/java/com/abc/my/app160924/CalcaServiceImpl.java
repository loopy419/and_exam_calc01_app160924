package com.abc.my.app160924;

/**
 * Created by 1027 on 2016-09-24.
 */

public class CalcaServiceImpl implements  CalcaService{
    @Override
    public CalcaDTO plus(CalcaDTO cal) {
        int num1 = cal.getNum1();
        int num2 = cal.getNum2();
        int result = num1+num2;

        cal.setResult(result);
        return cal;
    }

    @Override
    public CalcaDTO minus(CalcaDTO cal) {
        return null;
    }

    @Override
    public CalcaDTO times(CalcaDTO cal) {
        return null;
    }

    @Override
    public CalcaDTO divide1(CalcaDTO cal) {
        return null;
    }

    @Override
    public CalcaDTO divide2(CalcaDTO cal) {
        return null;
    }
}
