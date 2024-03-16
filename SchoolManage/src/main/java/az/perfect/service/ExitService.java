/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.service;

/**
 *
 * @author Behruz Tapdiqov
 */
public class ExitService implements MenuService {
    
    @Override
    public void prosess() {
        
        System.exit(0);
    }
    
}
