package exercise2;

import common.Color;
import common.ExerciseFail;
import common.exercise2.Exercise2Helper;
import common.exercise2.Person;
import common.exercise2.HedgeV2;
import lombok.Value;

@Value
public class Exercise2 {

    public HedgeV2 hedgeV2;
    Exercise2Helper helper = new Exercise2Helper();

    public Exercise2(HedgeV2 personInspector) {
        this.hedgeV2 = personInspector;
    }

    public boolean isLeader(Person person) {
        // TODO implement the checklist to find if a person is a leader.
        return false;
    }

    public Person procedure() throws ExerciseFail {
        // TODO use the inspector to implement the procedure to find the leader.
        return new Person(Color.BLUE, Color.BROWN, false, "not the leader");
    }
}
