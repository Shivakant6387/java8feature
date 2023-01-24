package org.example;

import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        StringJoiner stringJoiner=new StringJoiner(",");
        stringJoiner.add("Rahul");
        stringJoiner.add("Raju");
        stringJoiner.add("Sakshi");
        stringJoiner.add("Amrita");
        System.out.println(stringJoiner);
    }
}
