package org.example.entities;

import java.util.List;

public class Student extends Person {
    private String GradeLevel;
    private String RegistrationDate;
    private double FeeBalance;
    private List<String> Subjects;

    public Student(String Id, String FirstName, String LastName, String Gender, String PhoneNumber,
                   String GradeLevel, String RegistrationDate, double FeeBalance  ) {

        super(Id, FirstName, LastName, Gender, PhoneNumber);
    }


}
