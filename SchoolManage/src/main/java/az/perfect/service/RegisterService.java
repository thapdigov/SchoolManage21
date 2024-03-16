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
public class RegisterService implements MenuService {

    @Override
    public void prosess() {
        String username = MenuUtil.textAl("Enter username:");
        String password = MenuUtil.textAl("Enter password:");
        
        if(Base.instance().getUsers().containsKey(username)){
            System.out.println("Bu usernaem artiq movcuddur");
            prosess();
        }
        
        Base.instance().setUsers(username, password);
        
        Base.save();

    }

}
