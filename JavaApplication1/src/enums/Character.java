/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

import java.io.Serializable;

/**
 *
 * @author Spencer
 */
public enum Character implements Serializable {
    
    Dragon("It is a huge looking monster with huge teeth sticking out and drool."),
    Fairy("She is a small flying being able to help in times of need."),
    Sorcerer("A person of force not to be reckoned with."),
    Wizard("A wise old man, who could help you with potions... for a price."),
    Parrot("Don't say anything to this bird. Unless you want the pirate to"
            + "know what your up to."),
    Baboon("This animal seems very friendly at first, but if you get too close"
            + " she will hurt you."),
    Cobra("A spitting cobra is not your friend, near or afar."),
    Princess("The princess loves to talk, so your loved one might die before "
            + "she is done talkingot you. You were warned."),
    Prince("A spirited young fighter who wants his first chance to kill a "
            + "dragon."),
    King("The man who calls the shots. Be his friend and he will reward you."
            + " Upset him and ou will lose your head."),
    Queen("The lady of vanity, she'll give you no recognition. Unless you "
            + "offer her beauty products."),
    Cook("Don't get too close to him or you'll served for supper tonight."),
    DragonKeeper("A dangerous man, who is always on the look out to feed his "
            + "pet."),
    Pirate("The back stabbing scoundrel is only interested in one thing..."
            + " money!"),
    FirstMate("The first mate gets the scraps of the pirate, so if he can bring"
            + "you to the pirate, he'll get a small reward... so he thinks?");
    
    private final String description;
    
    Character(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
    
}
