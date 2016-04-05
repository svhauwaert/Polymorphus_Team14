/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.polymorphus.view;

import byui.cit260.polymorphus.control.ProgramControl;
import byui.cit260.polymorphus.model.Player;
import java.util.Scanner;
import java.io.Console;

/**
 *
 * @author Spencer Van Hauwaert
 */
public class StartProgramView extends View{ 

    public StartProgramView(String promptMessage) {
        super(promptMessage);
    }
    private void displayBanner() {
        System.out.println("\n\n****************************************************");
        
        System.out.println("*                                                  *"
                        + "\n*            CURE FOR POLYMORPHUS                  *"
                        + "\n*                                                  *"
                        + "\n* Cure for Polymorphus is a text based role        *"
                        + "\n* playing game. In this game, you will be taking   *"
                        + "\n* on the role as the hero. You have been notified  *"
                        + "\n* that your loved one has been poisoned. A doctor  *"
                        + "\n* has come to vist the loved one and has explained *"
                        + "\n* that the poison is very rare.                    *");
        
        System.out.println("*                                                  *"
                        + "\n* None of your home remedies or medicine seem to   *"
                        + "\n* have any effect. You sense that your loved one   *"
                        + "\n* is in mortal danger, and you must try to save    *"
                        + "\n* them. The doctor explains of a chance that you   *"
                        + "\n* might have to save your loved one.               *");
        
        System.out.println("*                                                  *"
                        + "\n* You are told of a castle of great danger and     *"
                        + "\n* opportunity. Perhaps here is the solution you    *"
                        + "\n* need. Rumor has it, there is a powerful wizard   *"
                        + "\n* named Haven, that lives in the castle. Many      *"
                        + "\n* years ago, after having many miraculous          *"
                        + "\n* successes, Haven retired to the castle in the    *"
                        + "\n* land of Chalis, where he devoted most of his     *"
                        + "\n* time to the creation of magic.                   *");
        
        System.out.println("*                                                  *"
                        + "\n* The rooms of Chalis must be magnificent in       *"
                        + "\n* design, and contain much magic and treasure. One *"
                        + "\n* option you have is to undertake a journey into   *"
                        + "\n* this cstle and find a powerful potion that can   *"
                        + "\n* help cure your loved one. Once inside this       *"
                        + "\n* castle you will find treasure, gold, weapon…and *"
                        + "\n* creatures of that will try to stop you on your   *"
                        + "\n* journey.   Good luck and have fun!               *"
                        + "\n*                                                  *");
        
        System.out.println("****************************************************");
    }
        
        //String playersName =this.getPlayersName();
        

public void startProgram(){
    this.displayBanner();
    String playersName=this.getPlayersName();
    Player player = ProgramControl.createPlayer(playersName);
    this.displayWelcomeMessage(player);
    MainMenuView mainMenu=new MainMenuView();
    mainMenu.display();
}

private String getPlayersName() {
        //To change body of generated methods, choose Tools | Templates.
        boolean valid=false;
        String playersName=null;
      try{
        //Scanner keyboard = new Scanner(System.in);
        while(!valid){
            this.console.println("Enter the player's name");
            
            //playersName=keyboard.nextLine();
            playersName=this.keyboard.readLine();
            playersName=playersName.trim();
            if(playersName.length()<2) {
                ErrorView.display(this.getClass().getName(),"Invalid name-it must not be blank");
                continue;}
            break;
            }
        }catch(Exception e)
        {
            ErrorView.display(this.getClass().getName(),"Error reading input: "+e.getMessage());
      }
      return playersName;
    }
      

    private void displayWelcomeMessage(Player player) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.console.println("\n\n============================================");
        this.console.println("\t Welcome to the game  "+player.getName());
        this.console.println("\t We hope you have a lot of fun!");
        this.console.println("================================================");
    }
    @Override
    public boolean doAction(Object obj) {return false;}
}

