package org.userregistration.junit;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args){
        System.out.println("Welcome to User Registration problem");
        validateFirstname();
    }

    private static void validateFirstname() {
        ArrayList<String> firstNames=new ArrayList<>();
        firstNames.add("Anjali");
        firstNames.add("Teja");
        String regex="[A-Z][a-z]{3,}";
        for(String firstName:firstNames){
            Pattern pattern= Pattern.compile(regex);
            Matcher matcher=pattern.matcher(firstName);
            System.out.println(firstName+":"+firstName.matches(regex));
        }
    }
}


