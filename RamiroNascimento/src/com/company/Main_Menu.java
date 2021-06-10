package com.company;

import java.util.Scanner;

public class Main_Menu {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //load to a static array, so it's faster to read.
        StopWords.loadList();

        int book_option;


        //region Books Instance's
        IndexList aliceList = new IndexList(Book.ALICE);
        IndexList javaList = new IndexList(Book.JAVA);
        IndexList cocoaAndChocolateList = new IndexList(Book.COCOA_AND_CHOCOLATE);
        IndexList fiveWeeksInABalloonList = new IndexList(Book.FIVE_WEEKS_IN_A_BALLOON);
        //endregion


        //region Greeting
        System.out.println("Class: Algorithm and Data Structure 1");
        System.out.println("Project Owner: Ramiro Nascimento");
        System.out.println(" ");

        System.out.println("### Index List Algorithm ### ");
        System.out.println("\nHi, welcome to the index list generator. Here you'll be able to see in which page(s) the relevant words, chosen by out algorithm, from \n" +
                           "the books in our library are available to be found. \n" +
                           "At the menu below, you will be able to choose a book and in each one, you can print the hole Index List or search for an specific word\n\n");
        //endregion


        //region Main Menu
        do {
            System.out.println("-  Type the number corresponding to the book");
            System.out.println("[ 0 ] - Exit program (not a book, lol)");
            System.out.println("[ 1 ] - THE JAVA PROGRAMMING LANGUAGE");
            System.out.println("[ 2 ] - ALICE'S ADVENTURES IN WONDERLAND");
            System.out.println("[ 3 ] - COCOA AND CHOCOLATE - Their History from Plantation to Consumer");
            System.out.println("[ 4 ] - FIVE WEEKS IN A BALLOON");
            book_option = scanner.nextInt();
            switch (book_option) {
                case 0:
                    break;
                case 1:
                    bookMenu(javaList);
                    break;
                case 2:
                    bookMenu(aliceList);
                    break;
                case 3:
                    bookMenu(cocoaAndChocolateList);
                    break;
                case 4:
                    bookMenu(fiveWeeksInABalloonList);
                    break;
                default:
                    System.out.println("!Error: Invalid Option");
                    break;
            }
        }while(book_option!=0);
        //endregion
    }

    public static void bookMenu(IndexList bookList){
        int menu_option;
        do {
            System.out.println("\n");
            System.out.println("[ 0 ] - Exit");
            System.out.println("[ 1 ] - Get full Index List");
            System.out.println("[ 2 ] - Search for an specific word");
            menu_option = scanner.nextInt();
            scanner.nextLine();
            switch(menu_option) {
                case 0:
                    break;
                case 1:
                    if (!bookList.isListCreated()) {
                        if (bookList.createIndexList()) {
                            bookList.getWordsCollection().printLinkedCollection("word");
                        } else {
                            System.out.println("!Error: Could not create " + bookList.getBook() + "'s Index List");
                        }
                    }
                    else{
                        bookList.getWordsCollection().printLinkedCollection("word");
                    }
                    break;
                case 2:
                    if(!bookList.isListCreated()){
                        if (!bookList.createIndexList()) {
                            System.out.println("!Error: Could not create " + bookList.getBook() + "'s List");
                        }
                    }
                    System.out.print("Which word are you looking for? ");
                    String word = scanner.nextLine();
                    if(!(bookList.getWordsCollection().getWord(word) == null)) { // search for the word
                        if(!(bookList.getWordsCollection().getWord(word).getPages() == null)) { // search for any pages
                            System.out.print("\n The word "+ word + " can be found at the following pages: ");
                            bookList.getWordsCollection().getWord(word).getPages().printLinkedCollection("page");
                        }
                        else{
                            System.out.println("    The word \""+word+" \" is not in any page" );
                        }
                    }
                    else{
                        System.out.println("    The word \""+word+" \" is not in the Index List" );
                    }
                    break;
                default:
                    System.out.println("!Error: Invalid Option!");
                    menu_option = 0;
                    break;
            }
        }while(menu_option!=0);
    }
}
