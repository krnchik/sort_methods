package com.dataStructures.patterns.behavioral.command.complex;

public abstract class Command {

    protected Editor editor;
    private String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    public void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}


