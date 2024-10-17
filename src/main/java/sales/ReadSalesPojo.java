package sales;
public class ReadSalesPojo {
    private int salesId;
    private String salespersonName;
    private int target;
    private int numberOfUnits;
    private int numberOfUnitsSold;
    private String completionStatus;

    // Constructor
    public ReadSalesPojo() {
    }

    public ReadSalesPojo(int salesId, String salespersonName, int target, int numberOfUnits, int numberOfUnitsSold, String completionStatus) {
        this.salesId = salesId;
        this.salespersonName = salespersonName;
        this.target = target;
        this.numberOfUnits = numberOfUnits;
        this.numberOfUnitsSold = numberOfUnitsSold;
        this.completionStatus = completionStatus;
    }

    // Getters and Setters
    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

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

    @Override
    public String toString() {
        return "ReadSalesPojo{" +
                "salesId=" + salesId +
                ", salespersonName='" + salespersonName + '\'' +
                ", target=" + target +
                ", numberOfUnits=" + numberOfUnits +
                ", numberOfUnitsSold=" + numberOfUnitsSold +
                ", completionStatus='" + completionStatus + '\'' +
                '}';
    }
}
