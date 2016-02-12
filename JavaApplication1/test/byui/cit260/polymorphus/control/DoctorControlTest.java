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
 * @author Spencer
 */
public class DoctorControlTest {
    
    public DoctorControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of amountNeeded method, of class DoctorControl.
     */
    @Test
    public void testAmountNeeded() {
        
        /********************************
         * Test case # 1
         *******************************/
        
        System.out.println("\tTest case #1");
        
        // input values for test case #1
        double basicCost = 100.0;
        double medicalRate = 0.1;
        double gameTime = 20.0;
        DoctorControl instance = new DoctorControl();
        double expResult = 300.0;
        
        // call function to tst case
        double result = instance.amountNeeded(basicCost, medicalRate, gameTime);
        assertEquals(expResult, result, 0.0);
        
        
        /********************************
         * Test case # 2
         *******************************/
        
        System.out.println("\tTest case #2");
        
        // input values for test case #2
        basicCost = 75.0;
        medicalRate = -10;
        gameTime = 50.0;
        
        expResult = -1.0;
        
        // call function to tst case
        result = instance.amountNeeded(basicCost, medicalRate, gameTime);
        assertEquals(expResult, result, 0.0);
        
        
        /********************************
         * Test case # 3
         *******************************/
        
        System.out.println("\tTest case #3");
        
        // input values for test case #3
        basicCost = -50.0;
        medicalRate = 100.0;
        gameTime = 70.0;
        
        expResult = -1.0;
        
        // call function to tst case
        result = instance.amountNeeded(basicCost, medicalRate, gameTime);
        assertEquals(expResult, result, 0.0);
        
        /********************************
         * Test case #4
         *******************************/
        
        System.out.println("\tTest case #4");
        
        // input values for test case #4
        basicCost = 50.0;
        medicalRate = 10.0;
        gameTime = 110.0;
        
        expResult = -1.0;
        
        // call function to tst case
        result = instance.amountNeeded(basicCost, medicalRate, gameTime);
        assertEquals(expResult, result, 0.0);
        
        /********************************
         * Test case #5
         *******************************/
        
        System.out.println("\tTest case #5");
        
        // input values for test case #5
        basicCost = 100.0;
        medicalRate = 0.1;
        gameTime = 0.0;
        
        expResult = 100.0;
        
        // call function to tst case
        result = instance.amountNeeded(basicCost, medicalRate, gameTime);
        assertEquals(expResult, result, 0.0);
        
        /********************************
         * Test case #6
         *******************************/
        
        System.out.println("\tTest case #6");
        
        // input values for test case #6
        basicCost = 100.0;
        medicalRate = 0.1;
        gameTime = 100.0;
        
        expResult = 1100.0;
        
        // call function to tst case
        result = instance.amountNeeded(basicCost, medicalRate, gameTime);
        assertEquals(expResult, result, 0.0);
        
        /********************************
         * Test case #7
         *******************************/
        
        System.out.println("\tTest case #7");
        
        // input values for test case #7
        basicCost = 100.0;
        medicalRate = 0.1;
        gameTime = 110.0;
        
        expResult = -1.0;
        
        // call function to tst case
        result = instance.amountNeeded(basicCost, medicalRate, gameTime);
        assertEquals(expResult, result, 0.0);
    }
}
