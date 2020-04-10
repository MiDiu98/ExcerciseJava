package oop.Exercise01;

import java.util.Date;

public class Student {
    protected String id;
    protected String firstName;
    protected String lastName;
    protected Date birthday;
    protected String className;
    protected String address;

    public Student() {}

    public Student(StudentBuilder studentBuilder) {
        this.id = studentBuilder.id;
        this.firstName = studentBuilder.firstName;
        this.lastName = studentBuilder.lastName;
        this.birthday = studentBuilder.birthday;
        this.className = studentBuilder.className;
        this.address = studentBuilder.address;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public Date getBirthday() {
        return birthday;
    }
    public String getClassName() {
        return className;
    }
    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "\n\t id='" + id + '\'' +
                ",\n\t firstName='" + firstName + '\'' +
                ",\n\t lastName='" + lastName + '\'' +
                ",\n\t birthday=" + birthday + '\'' +
                ",\n\t className='" + className + '\'' +
                ",\n\t address='" + address + '\'' +
                "\n}\n";
    }
}
