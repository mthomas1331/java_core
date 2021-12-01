package com.spartaglobal.challenges.challenge_3;

public class Challenge3 {

    public void reverseName(String fullName){
        //Find the position of the space in string
        int spaceId = fullName.indexOf(" ");
        //Use substring to split the string into two names
        String firstName = fullName.substring(0, spaceId);
        String lastName = fullName.substring(spaceId+ 1);
        //output the final result
        System.out.println(lastName + " " + firstName);
    }
}
