package Package_test;

public abstract class Students {
    protected double practical; //практическая часть
    protected double analysis; //разбор
    protected double beingInStream; //нахождение в потоке
    protected double timeToStudy;
    double timeMasterSkills;
    double totalElapsedTime;

    public static final double indexOne;
    public static final double indexTwo;
    public double talent;


    static {
        indexOne = 0.01d;
        indexTwo = 1.0d;
    }

    public Students(double timeToStudy) {
        this.timeToStudy = timeToStudy;
        this.talent = Math.random() * (indexTwo - indexOne) + indexOne;
    }

    public Students() {
    }

    public double getPractical() {
        return practical;
    }

    public void setPractical(double practical) {
        this.practical = practical;
    }

    public double getAnalysis() {
        return analysis;
    }

    public void setAnalysis(double analysis) {
        this.analysis = analysis;
    }

    public double getBeingInStream() {
        return beingInStream;
    }

    public void setBeingInStream(double beingInStream) {
        this.beingInStream = beingInStream;
    }

    public double getTimeToStudy() {
        return timeToStudy;
    }

    public void setTimeToStudy(double timeToStudy) {
        this.timeToStudy = timeToStudy;
    }

    public double getTimeMasterSkills() {
        return timeMasterSkills;
    }

    public void setTimeMasterSkills(double timeMasterSkills) {
        this.timeMasterSkills = timeMasterSkills;
    }

    public double getTotalElapsedTime() {
        return totalElapsedTime;
    }

    public void setTotalElapsedTime(double totalElapsedTime) {
        this.totalElapsedTime = totalElapsedTime;
    }

    public static double getIndexOne() {
        return indexOne;
    }

    public static double getIndexTwo() {
        return indexTwo;
    }

    public double getTalent() {
        return talent;
    }

    public void setTalent(double talent) {
        this.talent = talent;
    }
}