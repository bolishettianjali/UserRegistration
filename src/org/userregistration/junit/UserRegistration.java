package org.userregistration.junit;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration problem");
        validateFirstname();
        validateLastName();
        validateEmail();
    }

    private static void validateFirstname() {
        ArrayList<String> firstNames = new ArrayList<>();
        firstNames.add("Anjali");
        firstNames.add("Teja");
        String regex = "[A-Z][a-z]{3,}";
        for (String firstName : firstNames) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(firstName);
            System.out.println(firstName + ":" + firstName.matches(regex));
        }
    }

    private static void validateLastName() {
        ArrayList<String> lastNames = new ArrayList<>();
        lastNames.add("Bolishetti");
        lastNames.add("Polishetti");
        String regex = "[A-Z][a-z]{3,}";
        for (String lastName : lastNames) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(lastName);
            System.out.println(lastName + ":" + lastName.matches(regex));
        }
    }

    private static void validateEmail() {
        ArrayList<String> emailIds = new ArrayList<>();
        emailIds.add("user@domain.com");
        emailIds.add("user@domain.co.in");
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
            for(String email:emailIds){
                System.out.println(email+": "+email.matches(regex));
            }
    }
}


