/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service;

import az.perfect.config.Base;
import az.perfect.menu.MenuUtil;

/**
 *
 * @author Behruz Tapdiqov
 */
public class LoginService implements MenuService {

    @Override
    public void prosess() {
        String login = MenuUtil.textAl("Login:");
        String password = MenuUtil.textAl("Pasword:");

        if (!(Base.instance().getUsers().containsKey(login) && Base.instance().getUsers().get(login).equals(password))) {
            throw new IllegalArgumentException("Login or pasword invalide!!!");

        }
        Base.logeddIn = true;
    }

}
