/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whyinnovation.tests.PSD;

import com.whyinnovation.PSD.UserAccount;
import javax.inject.Inject;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author admin
 */
public class UserAccountTest {
    
    //@Inject
    private UserAccount userAccount = new UserAccount();
    
    @Test
    public void testSetBalance(){
        userAccount.setBalance(10);
        assertEquals(10, userAccount.getBalance());
    }
    
    @Test
    public void testGetBalance(){
        assertEquals(0, userAccount.getBalance());
    }
}
