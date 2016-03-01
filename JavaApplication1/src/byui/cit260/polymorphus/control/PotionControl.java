/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.polymorphus.control;

/**
 *
 * @author Spencer Walters
 */
public class PotionControl {
    
    public double concoctItem(double requireItem, double item, double amount){
    
     if (requireItem != 3) { // Items are not three
          return -1;
    }
     if (item != 2) { // two of each item
         return -1;
     }
     if (amount <=4 ) { //need 4 of each
          return -1;
     }
     double mixItem = requireItem + (1 + (item * amount)); // Round to a whole number
     return mixItem;
    }
}

