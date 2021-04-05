package Package_test;

import java.math.BigDecimal;

public class StudentTypeTwo extends Students implements SettlementStrategy {
    public StudentTypeTwo(double timeToStudy) {
        super(timeToStudy);
    }

    public StudentTypeTwo() {
    }

    @Override
    public String toString() {
        return "StudentTypeTwo{" +
                "practical=" + practical +
                ", analysis=" + analysis +
                ", timeToStudy=" + timeToStudy +", timeMasterSkills="+ timeMasterSkills+
                ", talent=" + talent + ", type=" + getClass().getSimpleName() +
                '}'+"\n";
    }

    @Override
    public void initializationCalculationAbilities() {
        this.timeMasterSkills = timeToStudy / BigDecimal.valueOf(talent).setScale(2, BigDecimal.ROUND_HALF_DOWN).doubleValue();
        this.practical = this.timeMasterSkills * 2d;
        this.analysis = this.timeMasterSkills * 2d;
    }

}