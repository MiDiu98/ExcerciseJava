package oop.Exercise01;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentController {
    List<Student> students = new ArrayList<Student>();

    public StudentController() { }

    public List<Student> addStudent(Student student) {
        students.add(student);
        return students;
    }

    public List<Student> deleteStudent(Student student) {
        students.remove(student);
        return students;
    }

    public boolean saveToFile(String path) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(path + "Student.json"), students);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Student> loadFromFile(String path) {
        ObjectMapper mapper = new ObjectMapper();
        List<Student> students = new ArrayList<Student>();
        try {
            students = mapper.readValue(new File(path + "Student.json"), new TypeReference<List<Student>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

    public Student getById(String id) {
        for (Student student : students) {
            if (student.getId().equals(id))
                return student;
        }
        return null;
    }

    public List<Student> findByName(String firstName) {
        List<Student> list = new ArrayList<Student>();
        for (Student student : students) {
            if (student.getFirstName().equals(firstName))
                list.add(student);
        }
        return list;
    }

    public List<Student> findByClassName(String className) {
        List<Student> list = new ArrayList<Student>();
        for (Student student : students) {
            if (student.getClassName().equals(className))
                list.add(student);
        }
        return list;
    }
}
