/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.polymorphus.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author swalters
 */
public class PotionControlTest {
    
    public PotionControlTest() {
    }

    /**
     * Test of concoctItem method, of class PotionControl.
     */
    @Test
    public void testConcoctItem() {
        System.out.println("concoctItem");
        double requireItem = 0.0;
        double item = 0.0;
        double amount = 0.0;
        PotionControl instance = new PotionControl();
        double expResult = 0.0;
        double result = instance.concoctItem(requireItem, item, amount);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
