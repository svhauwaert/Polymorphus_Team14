
package byui.cit260.polymorphus.view;

import Polymorphus.Polymorphus;
import java.io.PrintWriter;

/**
 *
 * @author Spencer Van Hauwaert
 */

public class ErrorView {
    private static final PrintWriter errorFile =Polymorphus.getOutFile();
    //private static final PrintWriter logFile =Polymorphus.getLogFile();
    public static void display(String className,String errorMessage){
        errorFile.println(
        "------------------------------------------------------"
        +"\n-ERROR -"+  errorMessage
        +"\n---------------------------------------------------");
        //logFile.println(className+"-"+ errorMessage);   
    }

    static void display(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
