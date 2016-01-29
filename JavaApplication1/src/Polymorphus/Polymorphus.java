/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphus;

import byui.cit260.polymorphus.model.Game;

/**
 *
 * @author Spencer
 */
public class Polymorphus {

    public static void main(String[] args) {
        Game mainGame = new Game();
        
        mainGame.setTotalTime(30.00);
        mainGame.setMenu("Main");
        
        String gameInfo = mainGame.toString();
        System.out.println(gameInfo);
    }
    
}
