package com.company;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class StopWords {
    //region Attributes
    private static final ArrayList<String> stopWordsList = new ArrayList<>();
    //endregion

    //region Constructor

    //endregion

    //region Methods


    public static ArrayList<String> getStopWordsList() {
        return stopWordsList;
    }

    public static boolean loadList() {
        String fileName = "StopWords.txt";
        String currDir = Paths.get("").toAbsolutePath().toString();
        String absolute_path = currDir + "\\src\\com\\company\\Data\\" + fileName;
        Path path = Paths.get(absolute_path);

        try(BufferedReader reader = Files.newBufferedReader(path, Charset.defaultCharset())){
            String word;
            while((word = reader.readLine())!=null){
                stopWordsList.add(word);
            }
        }catch (Exception e){
            System.err.println(e);
            return false;
        }
        return true;
    }

    public static boolean isAStopWord(String word) {
        if (stopWordsList.isEmpty()){
            System.out.println("! Error: The StopWords list was not loaded");
            return false;
        }

        //Binary Search using lexicography in a ordered list
        int high = stopWordsList.size()-1;
        int low  = 0;
        int mid = low + ((high-low)/2);
        while(low <= high){
            if (word.compareToIgnoreCase(stopWordsList.get(mid))==0){
                return true;
            }
            else{
                if (word.compareToIgnoreCase(stopWordsList.get(mid))<0){ // word is after the stopWord searched
                    high = mid-1;
                }
                else
                {
                    low = mid +1;
                }
                mid = low + ((high-low)/2);
            }
        }
        return false;
    }

    //endregion
}
