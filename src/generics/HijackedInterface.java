package generics;

class Cat extends ComparablePet implements Comparable<Cat> {
    public int compareTo(Cat arg) {
        return 0;
    }

}
