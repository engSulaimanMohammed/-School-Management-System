package org.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String GradeLevel;
    private String RegistrationDate;
    private double FeeBalance;
    private List<String> Subjects;

    public Student(String Id, String FirstName, String LastName, String Gender, String PhoneNumber,
                   String GradeLevel, String RegistrationDate, double FeeBalance  ) {

        super(Id, FirstName, LastName, Gender, PhoneNumber, );
        setfeeBalance(FeeBalance); // To check The balance if less than 0 or above.
        this.GradeLevel = GradeLevel;
        this.RegistrationDate = RegistrationDate;
        this.Subjects = new ArrayList<>();

    }

    public String getGradeLevel() {
        return GradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        GradeLevel = gradeLevel;
    }

    public String getRegistrationDate() {
        return RegistrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        RegistrationDate = registrationDate;
    }

    public double getFeeBalance() {
        return FeeBalance;
    }

    public void setFeeBalance(double feeBalance) {
        if (FeeBalance < 0) {
            IO.println("Fee Balance can not be bellow 0.");
            this.FeeBalance = 0;
            return;
        }
        FeeBalance = feeBalance;
    }



    public List<String> getSubjects() {
        return Subjects;
    }

    public void setSubjects(List<String> subjects) {
        Subjects = subjects;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        IO.println("Student: " + getFirstName() + " " + getLastName()
                + " | Grade: " + GradeLevel + " | FeeBalance: " + FeeBalance);
    }

}
