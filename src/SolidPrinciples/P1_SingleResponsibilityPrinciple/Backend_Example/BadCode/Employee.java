package SolidPrinciples.P1_SingleResponsibilityPrinciple.Backend_Example.BadCode;

// Any issue with this class ???


public class Employee {

    private int id;
    public int getId() {
        return this.id;
    }

    public String fetchBioData() {
        return "Some bio data";
    }

    public double calculateSalary() {
        return 0;
    }

    public void printPerformanceData() {
        System.out.println("Some performance related data");
    }

}