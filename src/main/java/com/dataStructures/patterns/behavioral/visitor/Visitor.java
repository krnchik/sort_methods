package com.dataStructures.patterns.behavioral.visitor;



public interface Visitor {
    String visit(Dot dot);
    String visit(Circle circle);
    String visit(Rectangle rectangle);
    String visit(CompoundShape cg);
}
