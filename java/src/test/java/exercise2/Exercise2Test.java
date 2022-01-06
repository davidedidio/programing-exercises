package exercise2;

import common.Color;
import common.ExerciseFail;
import common.exercise2.Person;
import common.exercise2.HedgeV2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise2Test {

    @Test
    public void testThatProcedureIsCorrectIfLeaderType1() throws ExerciseFail {
        Person leader = new Person(Color.GREEN, Color.RED, true, "Aaron");
        Exercise2 exercise2 = new Exercise2(new HedgeV2(leader));
        assertEquals(leader, exercise2.procedure());
    }

    @Test
    public void testThatProcedureIsCorrectIfLeaderType2() throws ExerciseFail {
        Person leader = new Person(Color.GREEN, Color.RED, false, "Aaron");
        Exercise2 exercise2 = new Exercise2(new HedgeV2(leader));
        assertEquals(leader, exercise2.procedure());
    }

    @Test
    public void testThatProcedureIsCorrectIfLeaderType3() throws ExerciseFail {
        Person leader = new Person(Color.GREEN, Color.GREEN, true, "Simon");
        Exercise2 exercise2 = new Exercise2(new HedgeV2(leader));
        assertEquals(leader, exercise2.procedure());
    }

    @Test
    public void testThatProcedureIsCorrectIfLeaderType4() throws ExerciseFail {
        Person leader = new Person(Color.GREEN, Color.BLUE, false, "Davide");
        Exercise2 exercise2 = new Exercise2(new HedgeV2(leader));
        assertEquals(leader, exercise2.procedure());
    }
}