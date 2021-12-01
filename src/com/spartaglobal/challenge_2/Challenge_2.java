package com.spartaglobal.challenge_2;

import java.util.ArrayList;

public class Challenge_2 {
    public void sortByLength(String sentence){
        //Challenge 2
        String[] sortedSentence = sentence.split(" ");
        //System.out.println(sortedSentence.length);
        ArrayList<String> stringArray = new ArrayList<String>();

        for (String element : sortedSentence) {       //for each loop to check contents in the sentence as an array and add it to array list
            stringArray.add(element);
        }
        //System.out.println(stringArray);

        //bubble sort algorithm to order in order of length
        String temp = "";
        for (int i = 0; i < stringArray.size(); i++) {
            for (int j = 0; j < stringArray.size(); j++) {
                if (stringArray.get(i).length() < stringArray.get(j).length()) {
                    temp = stringArray.get(j);
                    stringArray.set(j, stringArray.get(i));
                    stringArray.set(i, temp);
                }
            }
        }
        System.out.println(stringArray);             //final sorted list
    }
}
