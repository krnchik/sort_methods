package com.dataStructures.patterns.behavioral.iterator;

public class JavaDeveloper implements Developer{

    private final String name;
    private final String[] skills;

    public JavaDeveloper(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    @Override
    public void writeCode() {
        System.out.println("Write java code...");
    }

    @Override
    public Iterator iterator() {
        return new SkillsIterator();
    }

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
