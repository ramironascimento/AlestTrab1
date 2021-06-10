package com.company;

public enum Book {
    JAVA("java.txt"),
    ALICE("alice.txt"),
    COCOA_AND_CHOCOLATE("cocoaandchocolate.txt"),
    FIVE_WEEKS_IN_A_BALLOON("fiveweeksinaballoon.txt");

    private final String description;

    Book(String description) {
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
}
