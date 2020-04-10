package oop.Exercise01Test;

import oop.Exercise01.Student;
import oop.Exercise01.StudentBuilder;
import oop.Exercise01.StudentController;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class StudentControllerTest {

    @Test
    public void test_addStudent() {
        List<Student> list = new ArrayList<Student>();
        StudentBuilder builder = new StudentBuilder()
                                        .id("01")
                                        .firstName("Hue")
                                        .lastName("Nguyen")
                                        .birthday(new Date())
                                        .className("A1")
                                        .address("Quang Nam");

        Student student = builder.build();
        student.toString();
        list.add(student);
        assertEquals(new StudentController().addStudent(student), list);
    }

    @Test
    public void test_deleteStudent() {
        StudentController students = new StudentController();
        Student student = new Student(new StudentBuilder()
                                                .id("01")
                                                .firstName("Hue")
                                                .lastName("Nguyen")
                                                .birthday(new Date())
                                                .className("A1")
                                                .address("Quang Nam"));

        students.addStudent(student);

        List<Student> list = new ArrayList<Student>();
        list.add(student);
        list.remove(student);

        assertEquals(students.deleteStudent(student), list);
    }

    @Test
    public void test_saveToFile(){
        StudentController students = new StudentController();
        Student student = new Student(new StudentBuilder()
                                                .id("01")
                                                .firstName("Hue")
                                                .lastName("Nguyen")
                                                .birthday(new Date())
                                                .className("A1")
                                                .address("Quang Nam"));

        students.addStudent(student);
        String path = "";
        assertTrue(students.saveToFile(path));
    }

    @Test
    public void test_getById() {
        String path = "";
        Student student = new Student(new StudentBuilder()
                                                .id("01")
                                                .firstName("Hue")
                                                .lastName("Nguyen")
                                                .birthday(new Date())
                                                .className("A1")
                                                .address("Quang Nam"));
        StudentBuilder builder = new StudentBuilder();
        Student student2 = builder.id("02")
                                    .firstName("Hue")
                                    .lastName("Nguyen")
                                    .birthday(new Date())
                                    .className("A1")
                                    .address("Quang Nam")
                                    .build();

        StudentController students = new StudentController();
        students.addStudent(student);
        students.addStudent(student2);
        students.saveToFile(path);

        students.loadFromFile(path);

        assertEquals(students.getById("01"), student);
        assertEquals(students.getById("03"), null);
    }

    @Test
    public void test_findByName() {
        Student student = new Student(new StudentBuilder()
                                                .id("01")
                                                .firstName("Hue")
                                                .lastName("Nguyen")
                                                .birthday(new Date())
                                                .className("A1")
                                                .address("Quang Nam"));
        StudentBuilder builder = new StudentBuilder();
        Student student2 = builder.id("02")
                                    .firstName("Hoa")
                                    .lastName("Nguyen")
                                    .birthday(new Date())
                                    .className("A1")
                                    .address("Quang Nam")
                                    .build();

        StudentController students = new StudentController();
        students.addStudent(student);
        students.addStudent(student2);

        List<Student> list = new ArrayList<Student>();
        list.add(student2);

        assertEquals(students.findByName("Hoa"), list);

    }

    @Test
    public void test_findByClassName() {
        Student student = new Student(new StudentBuilder()
                                                .id("01")
                                                .firstName("Hue")
                                                .lastName("Nguyen")
                                                .birthday(new Date())
                                                .className("A1")
                                                .address("Quang Nam"));
        StudentBuilder builder = new StudentBuilder();
        Student student2 = builder.id("02")
                                    .firstName("Hoa")
                                    .lastName("Nguyen")
                                    .birthday(new Date())
                                    .className("A1")
                                    .address("Quang Nam")
                                    .build();

        StudentController students = new StudentController();
        students.addStudent(student);
        students.addStudent(student2);

        List<Student> list = new ArrayList<Student>();
        list.add(student);
        list.add(student2);

        assertEquals(students.findByClassName("A1"), list);
    }

}
