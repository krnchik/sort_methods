package com.dataStructures.patterns.behavioral.chainOfRespensibility;

public class BillAcceptor2000  extends BillAcceptor{

    @Override
    void takeMoney(Money money) {
        int countBill = money.getAmt() / Bill.R2000;
        int surplus = money.getAmt() % Bill.R2000;
        if(countBill > 0) {
            System.out.println("Выдано " + countBill + " купюр достоиством " + Bill.R2000);
        }
        if (surplus > 0 && next != null) {
            next.takeMoney(new Money(surplus));
        }
    }
}
