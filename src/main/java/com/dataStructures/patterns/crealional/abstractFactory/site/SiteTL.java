package com.dataStructures.patterns.crealional.abstractFactory.site;

import com.dataStructures.patterns.crealional.abstractFactory.TeamLead;

public class SiteTL implements TeamLead {
    @Override
    public void leadProject() {
        System.out.println("Control site project");
    }
}
