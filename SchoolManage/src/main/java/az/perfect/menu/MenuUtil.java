/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.menu;

import az.perfect.config.Base;
import java.util.Scanner;

/**
 *
 * @author Behruz Tapdiqov
 */
public class MenuUtil {

    public static void showAllMenu() {
        Menu menu[] = Menu.values();
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] != Menu.UNKNOWN) {
                if (menu[i] == Menu.LOGIN || menu[i] == Menu.REGISTER) {
                    if (Base.logeddIn == false) {
                        System.out.println(menu[i]);
                    }
                } else if (Base.logeddIn == true) {
                    System.out.println(menu[i]);
                }
            }
        }

    }

    public static void startMenu() {
        showAllMenu();
        int selectedMenu = ededAl("Please, Select Menu");
        Menu m = Menu.findNumberForMenu(selectedMenu);
        m.enumProsess();

    }

    public static String textAl(String baslig) {
        Scanner sc = new Scanner(System.in);
        System.out.println(baslig + ":");
        return sc.nextLine();

    }

    public static int ededAl(String baslig) {
        Scanner sc = new Scanner(System.in);
        System.out.println(baslig + ":");
        return sc.nextInt();

    }

}
