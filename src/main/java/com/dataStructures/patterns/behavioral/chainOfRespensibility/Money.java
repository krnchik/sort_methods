package com.dataStructures.patterns.behavioral.chainOfRespensibility;

public class Money {

    private int amt;

    public Money(int amt) {
        setAmt(amt);
    }

    public int getAmt() {
        return amt;
    }

    public void setAmt(int amt) {
        if (amt % Bill.R100 == 0 && amt > 0 && amt <= 200_000 ) {
            this.amt = amt;
        } else {
            throw new IllegalArgumentException("Некорректный ввод денег");
        }
    }
}
