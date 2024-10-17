public class SalesDataPojo {
    private String salespersonName;
    private int target;
    private int numberOfUnits;
    private int numberOfUnitsSold;
    private String completionStatus;

    // Constructor
    public SalesDataPojo() {
    }

    // Getters and Setters
    public String getSalespersonName() {
        return salespersonName;
    }

    public void setSalespersonName(String salespersonName) {
        this.salespersonName = salespersonName;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setNumberOfUnits(int numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public int getNumberOfUnitsSold() {
        return numberOfUnitsSold;
    }

    public void setNumberOfUnitsSold(int numberOfUnitsSold) {
        this.numberOfUnitsSold = numberOfUnitsSold;
    }

    public String getCompletionStatus() {
        return completionStatus;
    }

    public void setCompletionStatus(String completionStatus) {
        this.completionStatus = completionStatus;
    }
}
