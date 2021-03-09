package de.thunderfrog;

public class Main {

    public static void main(String[] args) {

        Pair<String, Integer> java = new Pair<>("JDK 1.0",1996);
        Pair<String, String> javaX = new Pair<>("JDK 2.0","2021");

        java.getFirst();
        java.getSecond();
    }
}
