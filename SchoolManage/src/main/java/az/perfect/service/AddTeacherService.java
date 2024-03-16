/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service;

import az.perfect.bean.Student;
import az.perfect.bean.Teacher;
import az.perfect.config.Base;
import az.perfect.menu.MenuUtil;

/**
 *
 * @author Behruz Tapdiqov
 */
public class AddTeacherService implements MenuService {

    @Override
    public void prosess() {

        int count = MenuUtil.ededAl("Nece muellim elave etmek isteyirsiniz?");
        
        if (count <= 0) {
            throw new IllegalArgumentException("Sayi duzgun daxil edin:");

        } else {
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". Qeydiyyat");
                String name = MenuUtil.textAl("Adi daxil edin");
                String surname = MenuUtil.textAl("soyadi daxil edin");
                int age = MenuUtil.ededAl("Yasi daxil edin");
                String schollname = MenuUtil.textAl("Scholl ad  daxil edin");
                int salary = MenuUtil.ededAl("maasi  daxil edin");
                Teacher t = new Teacher(name, surname, age, schollname, salary);

                Base.instance().setTeachers(t);
                Base.save();

            }
        }
    }

}
