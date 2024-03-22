
package Question8_124;

public class Employee {
    private String name;
    private String jobTitle;
    private double basicSalary;

    // Constructor
    public Employee(String name, String jobTitle, double basicSalary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.basicSalary = basicSalary;
    }

    // Method to calculate Dearness Allowance (DA)
    public double calculateDA() {
        // DA = 10% of basic salary
        return 0.10 * basicSalary;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
}
