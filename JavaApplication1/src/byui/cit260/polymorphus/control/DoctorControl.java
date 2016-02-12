/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.polymorphus.control;

/**
 *
 * @author Spencer Van Hauwaert
 */
public class DoctorControl {
    
    public double amountNeeded(double basicCost, double medicalRate, double gameTime){

     if (basicCost != 100) { // basic cost is not $100?
          return -1;
    }
     if (medicalRate != .10) { // medical rate is not 10%?
         return -1;
     }
     if (gameTime < 0 || gameTime > 100) { // game time out of range?
          return -1;
     }
     double doctorsPay = basicCost * (1 + (medicalRate * gameTime)); // Round to a whole number
     return doctorsPay;
    }
}
