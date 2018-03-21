package generics;

import typeinfo.Person;
import typeinfo.pets.Pet;
import util.New;

import java.util.List;
import java.util.Map;

public class SimplerPets {
    public static void main(String[] args) {
        Map<Person, List<? extends Pet>> petPeople = New.map();
    }
}
