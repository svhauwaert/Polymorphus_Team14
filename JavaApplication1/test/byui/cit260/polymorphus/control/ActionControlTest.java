/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.polymorphus.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Spencer Van Hauwaert
 */
public class ActionControlTest {
    
    public ActionControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of fightCharacter method, of class ActionControl.
     */
    @Test
    public void testFightCharacter() {
        
        /********************************
         * Test case # 1
         *******************************/
        
        System.out.println("\tTest case #1");
        
        // input values for test case #1
        int attackStrength = 30;
        int weaponClass = 5;
        int armorChar = 10;
        ActionControl instance = new ActionControl();
        int expResult = 25;
        
        // call function to test case
        int result = instance.fightCharacter(attackStrength, weaponClass, armorChar);
        assertEquals(expResult, result);
        
        
        /********************************
         * Test case # 2
         *******************************/
        
        System.out.println("\tTest case #2");
        
        // input values for test case #2
        attackStrength = 25;
        weaponClass = -10;
        armorChar = 10;
        
        expResult = -1;
        
        // call function to test case
        result = instance.fightCharacter(attackStrength, weaponClass, armorChar);
        assertEquals(expResult, result);
        
        /********************************
         * Test case # 23         *******************************/
        
        System.out.println("\tTest case #3");
        
        // input values for test case #3
        attackStrength = 20;
        weaponClass = 15;
        armorChar = -10;
        
        expResult = -1;
        
        // call function to test case
        result = instance.fightCharacter(attackStrength, weaponClass, armorChar);
        assertEquals(expResult, result);
        
        /********************************
         * Test case # 4
         *******************************/
        
        System.out.println("\tTest case #4");
        
        // input values for test case #4
        attackStrength = -15;
        weaponClass = 20;
        armorChar = 5;
        
        expResult = -1;
        
        // call function to test case
        result = instance.fightCharacter(attackStrength, weaponClass, armorChar);
        assertEquals(expResult, result);
        
        /********************************
         * Test case # 5
         *******************************/
        
        System.out.println("\tTest case #5");
        
        // input values for test case #5
        attackStrength = 0;
        weaponClass = 20;
        armorChar = 15;
        
        expResult = 5;
        
        // call function to test case
        result = instance.fightCharacter(attackStrength, weaponClass, armorChar);
        assertEquals(expResult, result);
        
        /********************************
         * Test case # 6
         *******************************/
        
        System.out.println("\tTest case #6");
        
        // input values for test case #6
        attackStrength = 30;
        weaponClass = 0;
        armorChar = 10;
        
        expResult = 20;
        
        // call function to test case
        result = instance.fightCharacter(attackStrength, weaponClass, armorChar);
        assertEquals(expResult, result);
        
        /********************************
         * Test case # 7
         *******************************/
        
        System.out.println("\tTest case #7");
        
        // input values for test case #7
        attackStrength = 30;
        weaponClass = 5;
        armorChar = 0;
        
        expResult = 35;
        
        // call function to test case
        result = instance.fightCharacter(attackStrength, weaponClass, armorChar);
        assertEquals(expResult, result);
    }
    
    
}
