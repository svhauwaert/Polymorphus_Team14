/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.polymorphus.control;

/**
 *
 * @author Spencer
 */
public class ActionControl {
    
    public int fightCharacter(int attackStrength, int weaponClass, int armorChar) {

     if (attackStrength < 0 || attackStrength > 30) { // players attack strength range
          return -1;
    }
     if (weaponClass < 0 || weaponClass > 20) { // players weapon class range
         return -1;
     }
     if (armorChar < 0 || armorChar > 30) { // characters armor class range
          return -1;
     }
     int playerHitStrength = (attackStrength + weaponClass) - armorChar; 
     return playerHitStrength;
    }
}
