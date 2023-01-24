package org.example;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String []str=new String[5];
        str[2]="Geeks classes are coming soon";
        Optional<String>empty=Optional.empty();
        System.out.println(empty);
        Optional<String> value=Optional.of(str[2]);
        System.out.println(value);
    }
}
