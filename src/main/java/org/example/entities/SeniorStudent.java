package org.example.entities;

public class SeniorStudent extends Student{
    private String Major;
    public double GPA;

    public SeniorStudent(String Id, String FirstName, String LastName, String Gender, String PhoneNumber,
                         String GradeLevel, String RegistrationDate, double FeeBalance, String major, double GPA) {

        super(Id, FirstName, LastName, Gender, PhoneNumber, GradeLevel, RegistrationDate,
                FeeBalance, GradeLevel, RegistrationDate, FeeBalance);
        this.Major = major;
        this.GPA = GPA;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        IO.println("Senior Student: " + getFirstName() + " " + getLastName()
        + "| Major: " + Major + " | GPA: " + GPA);
    }
}
