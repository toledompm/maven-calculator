package br.gov.sp.fatec.mavencalculator;

public class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.setNum1(num1);
        this.setNum2(num2);
    }

    public Calculator() {
        this(1, 1);
    }

    public void setNum1(int num) {
        this.num1 = num;
    }

    public void setNum2(int num) {
        this.num2 = num;
    }

    public int getNum1() {
        return this.num1;
    }

    public int getNum2() {
        return this.num2;
    }

    public int mul() {
        return this.getNum1() * this.getNum2();
    }

    public double div() {
        return this.getNum1() / this.getNum2();
    }

    public int sum() {
        return this.getNum1() + this.getNum2();
    }

    public int dif() {
        return this.getNum1() - this.getNum2();
    }
}
