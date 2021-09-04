package com.dataStructures.patterns.crealional.abstractFactory.bank;

import com.dataStructures.patterns.crealional.abstractFactory.Developer;
import com.dataStructures.patterns.crealional.abstractFactory.ProjectTeamFactory;
import com.dataStructures.patterns.crealional.abstractFactory.TeamLead;
import com.dataStructures.patterns.crealional.abstractFactory.Tester;

public class BankProject implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public TeamLead getTeamLead() {
        return new BankTL();
    }
}
