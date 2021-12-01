package com.spartaglobal.challenge_1;

public class Challenge_1 {

    public int sumOfNumbers(int limit){
        //Challenge 1 - sum of numbers
        int ans = 0;

        for (int i = 0; i < limit; i++) {           //loop through all the numbers up to the limit and find multiples
            if (i % 3 == 0 || i % 5 == 0) {
                //System.out.println(i);
                ans += i;
            }
        }
        //System.out.println(ans);

        return ans;
    }

}
