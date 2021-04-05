package Package_test;

import java.math.BigDecimal;

public class StudentTypeThree extends Students implements SettlementStrategy {
    public StudentTypeThree(double timeToStudy) {
        super(timeToStudy);
    }

    @Override
    public String toString() {
        return "StudentTypeThree{" +
                "practical=" + practical +
                ", timeToStudy=" + timeToStudy +", timeMasterSkills="+ timeMasterSkills+
                ", talent=" + talent + ", type=" + getClass().getSimpleName() +
                '}' + "\n";
    }

    @Override
    public void initializationCalculationAbilities() {
        this.timeMasterSkills = timeToStudy / BigDecimal.valueOf(talent).setScale(2, BigDecimal.ROUND_HALF_DOWN).doubleValue();
        this.practical = this.timeMasterSkills * 3d;

    }

    public StudentTypeThree() {
    }
}