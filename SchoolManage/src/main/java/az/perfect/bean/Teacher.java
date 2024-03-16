/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.bean;

/**
 *
 * @author Behruz Tapdiqov
 */
public class Teacher extends Person {

    private String schoolName;
    private int salary;

    public Teacher() {
    }

    public Teacher(String name, String surname, int age, String schoolName, int salary) {
        super(name, surname, age);
        this.schoolName = schoolName;
        this.salary = salary;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " ,schoolName=" + schoolName + ", salary=" + salary;
    }

}
