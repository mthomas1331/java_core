package com.spartaglobal;

import com.spartaglobal.challenge_1.Challenge_1;
import com.spartaglobal.challenge_2.Challenge_2;

import java.util.ArrayList;



public class Main {

    public static void main(String[] args) {
        final int limit = 1000;
        final String sentence = "here is a block of text with differing sized words";

        //Calls the challenge_1 class to display the result
        Challenge_1 challenge_1 = new Challenge_1();
        System.out.println(challenge_1.sumOfNumbers(limit));

        //Calls the challenge_2 class to show result through the method
        Challenge_2 challenge_2 = new Challenge_2();
        challenge_2.sortByLength(sentence);



    }
}
