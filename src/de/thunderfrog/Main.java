package de.thunderfrog;

public class Main {

    public static void main(String[] args) {

        // UNGLEICHE DATATYPE
        Pair<String, Integer> java = new Pair<>("JDK 1.0",1996);

        // Einfache Ausgabe
        System.out.println(java);

        // getFirst & getSecond
        System.out.println(java.getFirstPair());
        System.out.println(java.getSecondPair());

        // After Swap
        // java.swap();
        // System.out.println(java.getFirstPair());
        // System.out.println(java.getSecondPair());

        System.out.println(Pair.swap(java));

        System.out.println();
        System.out.println();

        // GLEICHER DATATYPE
        Pair<String, String> javaX = new Pair<>("JDK 3.0","2020");

        // Einfache Ausgabe
        System.out.println(javaX);

        // getFirst & getSecond
        System.out.println("BEFOR SWAP FIRST: " + javaX.getFirstPair());
        System.out.println("BEFOR SWAP SECOND: " + javaX.getSecondPair());

        // After Swap
        javaX.swap();
        System.out.println("AFTER SWAP FIRST: " + javaX.getFirstPair());
        System.out.println("AFTER SWAP SECOND: " + javaX.getSecondPair());

        // Swap Back
        javaX.swap();
        System.out.println(Pair.swap(javaX));

    }
}
