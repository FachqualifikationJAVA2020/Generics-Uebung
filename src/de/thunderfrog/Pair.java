package de.thunderfrog;

public class Pair <String, Integer>{
    private String sPair;
    private String sPair2;
    private int iPair;

    // KONSTRUKTOR STRING + INTEGER
    public Pair(String sPair, int iPair){
        this.sPair = sPair;
        this.iPair = iPair;
    }

    // KONSTRUKTOR STRING + STRING
    public Pair(String sPair, String sPair2){
        this.sPair = sPair;
        this.sPair2 = sPair2;
    }

    // SETTER & GETTER
    public String getsPair() {
        return sPair;
    }

    public void setsPair(String sPair) {
        this.sPair = sPair;
    }

    public int getiPair() {
        return iPair;
    }

    public void setiPair(int iPair) {
        this.iPair = iPair;
    }

    public String getsPair2() {
        return sPair2;
    }

    public void setsPair2(String sPair2) {
        this.sPair2 = sPair2;
    }

    // Aufgabe A
    public void getFirst(){
        System.out.println("First: " + getsPair());
    }

    public void getSecond(){
        System.out.println("Second: " + getiPair());
    }

    // Aufgabe C
    public void swap(){

    }


}
