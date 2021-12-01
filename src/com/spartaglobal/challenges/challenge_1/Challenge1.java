package com.spartaglobal.challenges.challenge_1;

public class Challenge1 {

    public void sumOfNumbers(int limit){
        //Challenge 1 - sum of numbers
        int ans = 0;
        //loop through all the numbers up to the limit and find multiples
        for (int i = 0; i < limit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                //System.out.println(i);
                ans += i;
            }
        }
        System.out.println(ans);
    }

}
