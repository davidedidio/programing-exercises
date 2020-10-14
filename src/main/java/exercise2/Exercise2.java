package exercise2;

import common.ExerciseFail;
import lombok.Value;

@Value
public class Exercise2 {

    PersonInspector inspector;
    Exercise2Helper helper = new Exercise2Helper();

    public Exercise2(PersonInspector personInspector) {
        this.inspector = personInspector;
    }

    public boolean isLeader(Person person) {
        // TODO implement the checklist to find if a person is a leader.
    }

    public Person procedure() throws ExerciseFail {
        // TODO implement the procedure to find the leader.
    }
}
