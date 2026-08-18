package org.example.entities;

public class HeadTeacher extends Teacher{
    private String Department;
    private int TeachersManaged;

    public HeadTeacher(String Id, String FirstName, String LastName, String Gender, String PhoneNumber,
                       String Subject, int YearsOfExperience, double Salary, String department, int teachersManaged) {

        super(Id, FirstName, LastName, Gender, PhoneNumber, Subject,
                YearsOfExperience, Salary);
        this.Department = department;
        this.TeachersManaged = teachersManaged;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getTeachersManaged() {
        return TeachersManaged;
    }

    public void setTeachersManaged(int teachersManaged) {
        TeachersManaged = teachersManaged;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        IO.println("Head Teacher: " + getFirstName() + " " + getLastName()
        + " | Department: " + Department + " | TeachersManaged:  " + TeachersManaged);
    }
}
