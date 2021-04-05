package Package_test;

import java.util.Objects;

/**
 * Hello world!
 *
 */
public class App
{
    private static SettlementStrategy strategy;
    public static final double totalTime=198d;

    public static void main(String[] args) {

        if (Objects.isNull(strategy)) {
            for (Students students : Classroom.preparationPupils()) {
                if (students instanceof StudentTypeOne) {
                    strategy = new StudentTypeOne(totalTime);
                    strategy.initializationCalculationAbilities();
                }
                if (students instanceof StudentTypeTwo) {
                    strategy = new StudentTypeTwo(totalTime);
                    strategy.initializationCalculationAbilities();
                }
                if (students instanceof StudentTypeThree) {
                    strategy = new StudentTypeThree(totalTime);
                    strategy.initializationCalculationAbilities();
                }
                System.out.print(strategy);
                strategy.initializationCalculationAbilities();
            }
        }
    }
}
