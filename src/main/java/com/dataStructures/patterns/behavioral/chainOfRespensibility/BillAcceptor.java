package com.dataStructures.patterns.behavioral.chainOfRespensibility;

public abstract class BillAcceptor {

    protected BillAcceptor next;

    abstract void takeMoney(Money money);

    public void setNext(BillAcceptor next) {
        this.next = next;
    }
}
