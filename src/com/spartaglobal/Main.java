package com.spartaglobal;

import com.spartaglobal.challenges.challenge_1.Challenge1;
import com.spartaglobal.challenges.challenge_2.Challenge2;
import com.spartaglobal.challenges.challenge_3.Challenge3;

public class Main {

    public static void main(String[] args) {
        final int limit = 1000;
        final String sentence = "here is a block of text with differing sized words";
        final String fullName = "Melvin Thomas";

        //Calls the challenge1 class to display the result
        Challenge1 challenge1 = new Challenge1();
        challenge1.sumOfNumbers(limit);

        //Calls the challenge2 class to show result through the method
        Challenge2 challenge2 = new Challenge2();
        challenge2.sortByLength(sentence);

        //Calls the challenge3 class to show the result of reversing the names passed
        Challenge3 challenge3 = new Challenge3();
        challenge3.reverseName(fullName);
    }
}
