package org.example.entities;

import org.example.interfaces.Displayable;

import java.util.Objects;

public class Person implements Displayable {
    private String Id;
    private String FirstName;
    private String LastName;
    private String Gender;
    private String PhoneNumber;

    public Person(String Id, String FirstName, String LastName,
                  String Gender, String PhoneNumber) {
        setID(Id);
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Gender = Gender;
        this.PhoneNumber = PhoneNumber;

    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setID( String Id) {
        if (utils.HelperUtils.isEmpty(id)) {
            IO.println("Id cannot be empty. Keeping the old id.");
            return;
        }
        this.Id = Id;
    }


    @Override
    public void displayInfo() {  // From the interfaces
        IO.println("Person: " + FirstName + " " + LastName + "(ID: " + Id + ")");

    }

    @Override
    public String toString() {
        return "Person{" +
                "Id='" + Id + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Gender='" + Gender + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(Id, person.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Id);
    }

   /*@Override
    public int hashCode() {
        return Objects.hashCode(Id);
    }*/

}
