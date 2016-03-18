/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package byui.cit260.polymorphus.control;

import Polymorphus.Polymorphus;
import byui.cit260.polymorphus.model.CastleRoom;
import byui.cit260.polymorphus.model.Game;
import byui.cit260.polymorphus.model.Map;
import byui.cit260.polymorphus.model.SceneType;
import exceptions.MapControlException;

/**
 *
 * @author Spencer
 */
/*public class MapControl {

    static void moveActorsToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Map createMap() throws MapControlException {
        // create the map
        Map map = new Map(5, 7);
        
        // create a list of different scenes in the game
        CastleRoom[] castleRoom = createCastleRoom();
        
        // assign the different scenes to locations in the map
        GameControl.assignScenesToLocations(map, castleRoom);
        
        return map;
    }

    private static CastleRoom[] createCastleRoom() {
        Game game = Polymorphus.getCurrentGame();
        
        CastleRoom[] castleRoom = new CastleRoom[SceneType.values().length];
        
        CastleRoom startingCastleRoom = new CastleRoom;
        startingScene.setDescription(
                  "\nYou have entered the main hall entrance of the wizard's "
                + "castle. The place looks old and dusty. You see many comb webs"
                + "around the room with flickering torchs to give an erie feel."
                + "You see a room in front on you.");
        startingScene.setMapSymbol(" EN ");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(30);
        castleRoom[SceneType.entrance.ordinal()] = startingScene;
        
        CastleRoom lobbyScene = new CastleRoom;
        lobbyScene.setDescription(
                  "\nYou are in the lobby and you see a statue standing there. Don't blink!");
        lobbyScene.setMapSymbol(" LO ");
        lobbyScene.setBlocked(false);
        lobbyScene.setTravelTime(30);
        castleRoom[SceneType.start.ordinal()] = lobbyScene;
        
        return castleRoom;
    }

    
    
}*/
