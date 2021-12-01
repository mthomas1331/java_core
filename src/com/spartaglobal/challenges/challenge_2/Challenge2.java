package com.spartaglobal.challenges.challenge_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Challenge_2 {
    public void sortByLength(String sentence){
        //Challenge 2
        String[] sortedSentence = sentence.split(" ");

        //method found after creating a for each loop to input elements from the String array - solution by IntelliJ
        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList(sortedSentence));

        //bubble sort algorithm to order in order of length
        String temp;
        for (int i = 0; i < stringArray.size(); i++) {
            for (int j = 0; j < stringArray.size(); j++) {
                if (stringArray.get(i).length() < stringArray.get(j).length()) {
                    temp = stringArray.get(j);
                    stringArray.set(j, stringArray.get(i));
                    stringArray.set(i, temp);
                }
            }
        }
        //final sorted list
        System.out.println(stringArray);
    }
}
