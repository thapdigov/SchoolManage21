/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.bean;

/**
 *
 * @author Behruz Tapdiqov
 */
public class Student extends Person {

    private String schoolName;
    private int scolarship;

    public Student() {
    }

    public Student(String name, String surname, int age, String schoolName, int scolarship) {
        super(name, surname, age);
        this.schoolName = schoolName;
        this.scolarship = scolarship;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getScolarship() {
        return scolarship;
    }

    public void setScolarship(int scolarship) {
        this.scolarship = scolarship;
    }

    @Override
    public String toString() {
        return super.toString()+ " ,schoolName=" + schoolName + ", scolarship=" + scolarship;
    }

}
