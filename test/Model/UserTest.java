/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ADMIN
 */
public class UserTest {

    User u;

    public UserTest() {
        u = new User();
    }
    
    @Test
    public void testSuccessfulLogin() {
//        User() u = new User();
        u.setAccount("username");
        u.setPass("password");

        boolean result = u.CheckLogin();

        assertTrue(result);
    }

//    @Test
//    public void testCheckLogin() {
//        
//    }
//
//    @Test
//    public void testAddUser() {
//    }
//
//    @Test
//    public void testGetUserByAccountAndPass() {
//    }
//
//    @Test
//    public void testGetUserByAccountName() {
//    }

}
