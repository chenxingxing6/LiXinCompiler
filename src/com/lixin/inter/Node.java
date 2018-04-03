package com.lixin.inter;

import com.lixin.lexer.Lexer;

/**
 * @author lixin
 */
public class Node {
    int lexLine = 0;

    Node() {
        lexLine = Lexer.line;
    }

    void error(String message) {
        throw new Error("near line " + lexLine + ": " + message);
    }

    static int labels = 0;

    public int newLabel() {
        return ++labels;
    }

    public void emitLabel(int i) {
        System.out.print("L" + i + ":");
    }

    public void emit(String string) {
        System.out.println("\t" + string);
    }
}
