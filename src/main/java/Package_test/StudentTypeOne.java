package Package_test;

import java.math.BigDecimal;

public class StudentTypeOne extends Students implements SettlementStrategy {

    public StudentTypeOne() {
    }

    public StudentTypeOne(double timeToStudy) {
        super(timeToStudy);
    }

    @Override
    public void initializationCalculationAbilities() {
        this.timeMasterSkills = timeToStudy / BigDecimal.valueOf(talent).setScale(2, BigDecimal.ROUND_HALF_DOWN).doubleValue();
        this.practical = this.timeMasterSkills / 3d;
        this.analysis = this.timeMasterSkills / 3d;
        this.beingInStream = this.timeMasterSkills / 3d;
    }

    @Override
    public String toString() {
        return "StudentTypeOne{" +
                "practical=" + practical +
                ", analysis=" + analysis +
                ", beingInStream=" + beingInStream +
                ", timeToStudy=" + timeToStudy +", timeMasterSkills="+ timeMasterSkills+
                ", talent=" + talent + ", type=" + getClass().getSimpleName() +
                '}'+"\n";
    }
}