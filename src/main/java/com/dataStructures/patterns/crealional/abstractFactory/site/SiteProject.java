package com.dataStructures.patterns.crealional.abstractFactory.site;

import com.dataStructures.patterns.crealional.abstractFactory.Developer;
import com.dataStructures.patterns.crealional.abstractFactory.ProjectTeamFactory;
import com.dataStructures.patterns.crealional.abstractFactory.TeamLead;
import com.dataStructures.patterns.crealional.abstractFactory.Tester;

public class SiteProject implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public TeamLead getTeamLead() {
        return new SiteTL();
    }
}
