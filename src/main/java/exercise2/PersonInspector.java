package exercise2;

import common.ExerciseFail;

import java.util.Collections;
import java.util.LinkedList;

import static common.Color.*;

public class PersonInspector {

    private final LinkedList<Person> allPeople;

    public PersonInspector(Person leader) {
        this.allPeople = new LinkedList<>();
        allPeople.add(leader);
        allPeople.add(new Person(GREEN, RED, false, "James"));
        allPeople.add(new Person(GREEN, RED, false, "Mary"));
        allPeople.add(new Person(GREEN, RED, true, "John"));
        allPeople.add(new Person(GREEN, RED, true, "Patricia"));
        allPeople.add(new Person(GREEN, RED, false, "Robert"));
        allPeople.add(new Person(GREEN, BLACK, true, "Jennifer"));
        allPeople.add(new Person(GREEN, BROWN, true, "Michael"));
        allPeople.add(new Person(GREEN, BROWN, false, "Linda"));
        allPeople.add(new Person(GREEN, BLACK, true, "William"));
        allPeople.add(new Person(GREEN, BROWN, true, "Elizabeth"));
        allPeople.add(new Person(GREEN, BROWN, true, "Davide"));
        allPeople.add(new Person(GREEN, BROWN, true, "Barbara"));
        allPeople.add(new Person(GREEN, BROWN, false, "Richard"));
        allPeople.add(new Person(GREEN, BLACK, false, "Susan"));
        allPeople.add(new Person(GREEN, BROWN, false, "Joseph"));
        allPeople.add(new Person(GREEN, BROWN, true, "Jessica"));
        allPeople.add(new Person(GREEN, BLACK, false, "Thomas"));
        allPeople.add(new Person(GREEN, BROWN, false, "Sarah"));
        allPeople.add(new Person(GREEN, BLACK, false, "Karen"));
        allPeople.add(new Person(GREEN, BROWN, false, "Nancy"));
        allPeople.add(new Person(GREEN, BROWN, false, "Lisa"));
        allPeople.add(new Person(BROWN, BROWN, false, "Margaret"));
        allPeople.add(new Person(BROWN, BROWN, true, "Betty"));
        allPeople.add(new Person(BROWN, BROWN, false, "Sandra"));
        allPeople.add(new Person(BROWN, BROWN, false, "Ashley"));
        allPeople.add(new Person(BROWN, BROWN, false, "Dorothy"));
        allPeople.add(new Person(BROWN, BROWN, false, "Kimberly"));
        allPeople.add(new Person(BLUE, BROWN, true, "Emily"));
        allPeople.add(new Person(BLUE, BROWN, false, "Donna"));
        allPeople.add(new Person(BLUE, BROWN, false, "Michelle"));
        allPeople.add(new Person(BLUE, BROWN, false, "Carol"));
        allPeople.add(new Person(BLUE, BROWN, true, "Amanda"));
        allPeople.add(new Person(BLUE, BROWN, true, "Melissa"));
        Collections.shuffle(allPeople);
    }

    public Person getNextPerson() throws ExerciseFail {
        Person p = allPeople.poll();
        if (p == null) {
            throw new ExerciseFail("No more person to inspect.");
        }
        return p;
    }

}
