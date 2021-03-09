package de.thunderfrog;

public class Pair <T, T1>{
    private T firstPair;
    private T1 secondPair;

    // KONSTRUKTOR
    public Pair(T s, T1 s1) {
        this.firstPair = s;
        this.secondPair = s1;
    }

    // SETTER & GETTER
    public T getFirstPair() {
        return firstPair;
    }

    public void setFirstPair(T firstPair) {
        this.firstPair = firstPair;
    }

    public T1 getSecondPair() {
        return secondPair;
    }

    public void setSecondPair(T1 secondPair) {
        this.secondPair = secondPair;
    }

    // AUFGABE A
    public T getFirst(){
        return getFirstPair();
    }

    public T1 getSecond(){
        return getSecondPair();
    }

    // AUFGABE C
    public void swap(){
        T first;
        T1 second;

        first = (T) getSecond();
        second = (T1) getFirst();

        setFirstPair(first);
        setSecondPair(second);
    }

    // AUFGABE D
    public static <T, T1> Pair swap(Pair<T, T1> pair){
        return new Pair<>(pair.getSecond(), pair.getFirst());
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstPair=" + firstPair +
                ", secondPair=" + secondPair +
                '}';
    }
}
