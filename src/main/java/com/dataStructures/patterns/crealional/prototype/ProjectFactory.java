package com.dataStructures.patterns.crealional.prototype;

public class ProjectFactory {

    private Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public Project makeCopy() {
        return (Project) project.copy();
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
