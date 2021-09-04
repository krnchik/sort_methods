package com.dataStructures.patterns.crealional.factory.oldVersion;

public class RubyDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new RubyDeveloper();
    }
}
