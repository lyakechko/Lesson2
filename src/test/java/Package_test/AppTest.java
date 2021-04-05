package Package_test;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {


    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void processOrder() {
        Object obj = Classroom.preparationPupils().stream().limit(1).filter(Objects::nonNull).findFirst().get();
        StudentTypeOne student = (StudentTypeOne) obj;
        student.setTimeToStudy(App.totalTime);
        System.out.println("student.getTimeToStudy()"+student.getTimeToStudy());
        assertTrue(student.getTimeToStudy() == 198);
    }

    @Test
    public void preparationPupils() {
        assertEquals(9,Classroom.preparationPupils().size());
    }
}
