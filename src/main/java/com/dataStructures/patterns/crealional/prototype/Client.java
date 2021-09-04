package com.dataStructures.patterns.crealional.prototype;

public class Client {
    public static void main(String[] args) {
        Project project = new Project(1,
                "Patterns",
                "Prototype prototype = new Prototype();\n");
        ProjectFactory projectFactory = new ProjectFactory(project);
        Project copyProject = projectFactory.makeCopy();

        System.out.println(project + "  " + project.hashCode());
        System.out.println(copyProject + "  " + copyProject.hashCode());
        System.out.println(copyProject.hashCode() == project.hashCode());
    }
}
