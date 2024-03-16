/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package az.perfect.menu;

import az.perfect.service.AddStudentService;
import az.perfect.service.StudentShowService;
import az.perfect.service.AddTeacherService;
import az.perfect.service.DeleteStudentService;
import az.perfect.service.DeleteTeacherService;
import az.perfect.service.EditStudentService;
import az.perfect.service.EditTeacherService;
import az.perfect.service.TeacherShowService;
import az.perfect.service.ExitService;
import az.perfect.service.LoginService;
import az.perfect.service.MenuService;
import az.perfect.service.RegisterService;
import az.perfect.service.UnknownService;

/**
 *
 * @author Behruz Tapdiqov
 */
public enum Menu {

    LOGIN(1, "Login", new LoginService()),
    REGISTER(2, "Register", new RegisterService()),
    ADDSTUDENT(3, "Add_Student", new AddStudentService()),
    ADDTEACHER(4, "Add_Teacher", new AddTeacherService()),
    SHOWSTUDENT(5, "ShowStudent", new StudentShowService()),
    SHOWTEACHER(6, "ShowTeacher", new TeacherShowService()),
    EDITSTUDENT(7, "EditStudent", new EditStudentService()),
    EDITTEACHER(8, "EditTeacher", new EditTeacherService()),
    DELETESTUDENT(9, "DeleteStudent", new DeleteStudentService()),
    DELETETEACHER(10, "DeleteTeacher", new DeleteTeacherService()),
    EXIT(11, "Exit", new ExitService()),
    UNKNOWN(new UnknownService());

    private int number;
    private String text;
    private MenuService service;

    private Menu(int number, String text, MenuService service) {
        this.number = number;
        this.text = text;
        this.service = service;
    }

    private Menu(MenuService service) {
        this.service = service;
    }

    public void enumProsess() {
        service.prosess();
        MenuUtil.startMenu();

    }

    public static Menu findNumberForMenu(int num) {
        Menu menu[] = Menu.values();
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].number == num) {
                return menu[i];
            }

        }
        return Menu.UNKNOWN;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return number + "." + text;
    }

}
