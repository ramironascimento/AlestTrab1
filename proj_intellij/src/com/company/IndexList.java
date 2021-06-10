package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class IndexList {
    //region Attributes
    private boolean listCreated = false; // control if the object's list need to be created
    private final LinkedCollection<String> wordsCollection; //collection of all words that is found in the book
    private final Book book;
    //endregion

    //region Constructor
    public IndexList(Book book) {
        wordsCollection = new LinkedCollection<>();
        this.book = book;
    }
    //endregion

    //region Methods
    public boolean isListCreated() {
        return listCreated;
    }

    public LinkedCollection<String> getWordsCollection() {
        return wordsCollection;
    }

    public Book getBook() {
        return book;
    }

    public boolean createIndexList(){
        System.out.println("Generating a new Index List...");
        int lineCounter = 0;
        int pageCounter = 1;

        String bookFile = this.book.getDescription();
        String currDir = Paths.get("").toAbsolutePath().toString();
        String absolute_path = currDir + "\\src\\com\\company\\Data\\" + bookFile;
        Path path = Paths.get(absolute_path);

        try (BufferedReader reader = Files.newBufferedReader(path, Charset.defaultCharset())) {
            String line;
            while ((line = reader.readLine()) != null) {
                if(!line.equals("")) { // check if the line is not empty
                    ArrayList<String> relevantWordList;
                    relevantWordList = checkStopWord(line); // return an Array with all non StopWord words
                    for (String word : relevantWordList) {
                        if (!this.wordsCollection.existWord(word)) {
                            this.wordsCollection.add(this.wordsCollection.newNodePosition(word), word);
                        }
                        if (!this.wordsCollection.existPage(word, pageCounter)) {
                            this.wordsCollection.addPage(word, pageCounter);
                        }
                    }
                }
                lineCounter++;
                if (lineCounter % 40 == 0) {
                    pageCounter++;
                    if(pageCounter%80 == 0){
                        System.out.println("    "+pageCounter+ " pages already indexed...");
                    }
                }
            }
        } catch (IOException e) {
            System.err.format("! Error trying to read the file: ", e);
            return false;
        }
        this.listCreated = true;
        System.out.println(this.book + "'s list created with success!");
        return true;
    }

    private ArrayList<String> checkStopWord(String line) { // return an subarray with all non stop words from the parameter "line".
        String[] eachWord = line.split(" ");
        ArrayList<String> relevantWords = new ArrayList<>();
        for (String word : eachWord) {
            word = word.replaceAll("\\W|[_]|[0-9]|[\\n]"," ");
            word = word.trim();
            if(!StopWords.isAStopWord(word)){
                if(word.contains(" ")){
                    String [] split_word = word.split(" ");
                    for (String split : split_word) {
                        if(!StopWords.isAStopWord(split)){
                            relevantWords.add(split);
                        }
                    }
                }
                else {
                    relevantWords.add(word);
                }
            }
        }
        return relevantWords;
    }
    //endregion
}
