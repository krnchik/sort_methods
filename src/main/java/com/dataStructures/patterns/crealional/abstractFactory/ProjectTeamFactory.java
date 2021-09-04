package com.dataStructures.patterns.crealional.abstractFactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    TeamLead getTeamLead();
}
