package com.dataStructures.patterns.behavioral.iterator;

public class PhpDeveloper implements Developer{

    private String name;
    private String[] skills;

    public PhpDeveloper(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    @Override
    public void writeCode() {
        System.out.println("Write php code...");
    }

    @Override
    public Iterator iterator() {
        return new SkillsIterator();
    }

    @Override
    public String getName() {
        return name;
    }

    public String[] getSkills() {
        return skills;
    }

    public class SkillsIterator implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < skills.length;
        }

        @Override
        public Object next() {
            return skills[index++];
        }
    }
}
