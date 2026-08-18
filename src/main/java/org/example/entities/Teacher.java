package org.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private String Subject;
    private int YearsOfExperience;
    private double Salary;
    private List <String> TeachingClasses;

    public Teacher(String Id, String FirstName, String LastName, String Gender,
                   String PhoneNumber, String Subject, int YearsOfExperience, double Salary  ) {

        super(Id, FirstName, LastName, Gender, PhoneNumber);
        setyearsOfExperience(YearsOfExperience);
        this.Subject = Subject;
        this.YearsOfExperience = YearsOfExperience;
        this.Salary = Salary;
        this.TeachingClasses = new ArrayList<>();
    }




    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public int getYearsOfExperience() {
        return YearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        if (YearsOfExperience < 0) {
            IO.println("The Experience can be not 0. keep it at 0.");
            this.YearsOfExperience = 0;
            return;
        }
        YearsOfExperience = yearsOfExperience;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public List<String> getTeachingClasses() {
        return TeachingClasses;
    }

    public void setTeachingClasses(List<String> teachingClasses) {
        TeachingClasses = teachingClasses;
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        IO.println("Teacher:" + getFirstName() + " " + getLastName() +
                " | Subject: " + Subject + " | Experience:" + YearsOfExperience + " Years.");
    }


}
