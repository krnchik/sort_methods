package com.dataStructures.patterns.crealional.abstractFactory.bank;

import com.dataStructures.patterns.crealional.abstractFactory.TeamLead;

public class BankTL implements TeamLead {
    @Override
    public void leadProject() {
        System.out.println("Control bank project");
    }
}
