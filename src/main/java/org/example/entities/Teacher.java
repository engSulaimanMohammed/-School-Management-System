package org.example.entities;

import java.util.List;

public class Teacher extends Person {
    private String Subject;
    private int YearsOfExperience;
    private double Salary;
    private List <String> TeachingClasses;

    public Teacher(String Id, String FirstName, String LastName, String Gender,
                   String PhoneNumber, String Subject, int YearsOfExperience, double Salary  ) {
        this.Subject = Subject;
        this.YearsOfExperience = YearsOfExperience;
        this.Salary = Salary;


        super(Id, FirstName, LastName, Gender, PhoneNumber);

    }


}
