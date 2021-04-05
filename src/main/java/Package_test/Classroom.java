package Package_test;

import java.util.ArrayList;
import java.util.List;

public class Classroom {


    public static List<Students> preparationPupils() {
        List<Students> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new StudentTypeOne());
            list.add(new StudentTypeTwo());
            list.add(new StudentTypeThree());
        }
        return list;
    }
}