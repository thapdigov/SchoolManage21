/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.config;

import az.perfect.bean.Student;
import az.perfect.bean.Teacher;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author Behruz Tapdiqov
 */
public class Base implements Serializable {

    private LinkedList<Student> students = new LinkedList<>();
    private LinkedList<Teacher> teachers = new LinkedList<>();
    private HashMap<String ,String > users = new HashMap<>();
    public static Base base = null;
    public static boolean logeddIn;

    public static void save() {

        FileUtil.writeObjectToFile(base, "app.obj");

    }

    public static void intialize() {
        Object obj = FileUtil.readObjectFromFile("app.obj");
        if (obj instanceof Base) {
            base = (Base) obj;
        }

    }

    public static Base instance() {
        if (base == null) {
            base = new Base();
        }
        return base;
    }

    public LinkedList<Student> getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students.add(students);
    }

    public LinkedList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher teachers) {
        this.teachers.add(teachers);
    }

    public HashMap<String, String> getUsers() {
        return users;
    }

    public void setUsers(String username, String password) {
        this.users.put(username, password);
    }
    
    

}
