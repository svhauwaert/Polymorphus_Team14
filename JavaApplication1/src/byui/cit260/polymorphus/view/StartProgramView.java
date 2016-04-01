package byui.cit260.polymorphus.view;

import byui.cit260.polymorphus.control.ProgramControl;
import byui.cit260.polymorphus.model.Player;
import java.util.Scanner;
import java.io.Console;

/**
 *
 * @author Spencer Van Hauwaert
 *         
 */

public class StartProgramView extends View{
    
    public StartProgramView(String promptMessage) {
        super(promptMessage);
    }
    
    public void startProgram() {
        
        // Display the banner screen
        this.displayBanner();
        
        // prompt the player to enter their name - retrieve  the name of the player
        String playersName = this.getPlayersName();
        
        // Create the player object and save the player object in the ProgramControl class
        Player player = ProgramControl.createPlayer(playersName);
        
        // Display a personalized welcome message
        this.displayWelcomeMessage(player);
        
        // Display the main menu.
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
        //FightCharacterView fightCharacterView = new FightCharacterView();
        //fightCharacterView.displayFightScene();
    }

    private void displayBanner() {
        System.out.println("\n\n****************************************************");
        
        System.out.println("*                                                  *"
                        + "\n*            CURE FOR POLYMORPHOUS                 *"
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
    
    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n=============================================");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tWe hope you have a lot of fun!");
        System.out.println("=============================================");
    }

    public void display() {
        
    }

    @Override
    public boolean doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
