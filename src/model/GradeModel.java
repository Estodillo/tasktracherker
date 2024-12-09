
package model;

public class GradeModel {
    private String idNumber;
    private String name;
    private double science;
    private double english;
    private double filipino;
    private double math;
    
    public GradeModel(String idNumber, String name, double science, double english, double filipino, double math) {
        this.idNumber = idNumber;
        this.name = name;
        this.science = science;
        this.english = english;
        this.filipino = filipino;
        this.math = math;
    }

    public GradeModel() {
    }

    // Getters and Setters
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScience() {
        return science;
    }

    public void setScience(double science) {
        this.science = science;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getFilipino() {
        return filipino;
    }

    public void setFilipino(double filipino) {
        this.filipino = filipino;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    // To String Method for Display
    @Override
    public String toString() {
        return "Grade{" +
                "idNumber='" + idNumber + '\'' +
                ", name='" + name + '\'' +
                ", science=" + science +
                ", english=" + english +
                ", filipino=" + filipino +
                ", math=" + math +
                '}';
    }
}
