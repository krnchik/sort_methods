package com.dataStructures.patterns.crealional.abstractFactory;

import com.dataStructures.patterns.crealional.abstractFactory.bank.BankProject;
import com.dataStructures.patterns.crealional.abstractFactory.site.SiteProject;

public class Client {
    public static void main(String[] args) {
        System.out.println("Create Bank project:");
        ProjectTeamFactory bankTeam = new BankProject();
        Developer jDeveloper = bankTeam.getDeveloper();
        Tester jTester = bankTeam.getTester();
        TeamLead jTL = bankTeam.getTeamLead();
        jDeveloper.writeCode();
        jTester.testCode();
        jTL.leadProject();

        System.out.println();

        System.out.println("Create Site project:");
        ProjectTeamFactory siteTeam = new SiteProject();
        Developer pDeveloper = siteTeam.getDeveloper();
        Tester pTester = siteTeam.getTester();
        TeamLead pTL = siteTeam.getTeamLead();
        pDeveloper.writeCode();
        pTester.testCode();
        pTL.leadProject();
    }
}
