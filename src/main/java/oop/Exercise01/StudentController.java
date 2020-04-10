package oop.Exercise01;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
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
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(students, new FileWriter(path + "Student.json"));
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Student> loadFromFile(String path) {
        List<Student> students = new ArrayList<Student>();
        try {
            Gson gson = new Gson();
            Type collectionType = new TypeToken<Collection<Student>>(){}.getType();

            students = gson.fromJson(new FileReader(path + "Student.json"), collectionType);
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
