package oop.Exercise01;

import java.util.Date;

public class StudentBuilder extends Student {

    public StudentBuilder id(String id) {
        this.id = id;
        return this;
    }

    public StudentBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public StudentBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public StudentBuilder birthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }

    public StudentBuilder className(String className) {
        this.className = className;
        return this;
    }

    public StudentBuilder address(String address) {
        this.address = address;
        return this;
    }

    public Student build() {
        Student student = new Student(this);
        return student;
    }
}
