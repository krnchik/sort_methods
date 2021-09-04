package com.dataStructures.patterns.behavioral.iterator;

public class Client {
    public static void main(String[] args) {
        String[] javaSkills = {"Java core", "Maven", "Spring", "Lombok"};
        String[] phpSkills = {"Php", "Laravel", "HTML", "CSS", "WebDesign"};
        Developer javaDeveloper = Developer.getDeveloper("java",
                "Karen", javaSkills);
        Developer phpDeveloper = Developer.getDeveloper("php",
                "Anna", phpSkills);

        Iterator iterator = javaDeveloper.iterator();
        System.out.println(javaDeveloper.getName());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        javaDeveloper.writeCode();

        System.out.println();

        Iterator iterator1 = phpDeveloper.iterator();
        System.out.println(phpDeveloper.getName());
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        phpDeveloper.writeCode();
    }
}
