package holding;

import typeinfo.pets.Pet;

import java.util.LinkedList;

import static util.Print.print;

public class LinkedListFeatures {
    public static void main(String[] args){
        LinkedList<Pet> pets = new LinkedList<Pet>(Pets.arrayList(5));
        print(pets);

        print("pets.getFirst(): " + pets.getFirst());
        print("pets.element(): " + pets.element());

        print("pets.peek(): " + pets.peek());

        print("pets.remove(): " + pets.remove());
        print("pets.removeFirst(): " + pets.removeFirst());

        print("pets.poll(): " + pets.poll());
        print(pets);

        pets.addFirst(new Rat());
        print("After addFirst(): " + pets);
        pets.offer(Pets.randomPet());
        print("After offer(): " + pets);
        pets.add(Pets.randomPet());
        print("After add(): " + pets);
        pets.addLast(new Hamster());
        print("After addLast(): " + pets);
        print("pets.removeLast(): " + pets.removeLast());

    }
}
