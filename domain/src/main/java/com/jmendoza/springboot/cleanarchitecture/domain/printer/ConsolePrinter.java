package com.jmendoza.springboot.cleanarchitecture.domain.printer;

public class ConsolePrinter implements Printer {
    @Override
    public void printValue(String value) {
        System.out.println(value);
    }
}
