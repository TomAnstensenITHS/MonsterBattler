package Resources;
import Resources.Variables;

public class Game {
    public void runGame(){
        HelpMethods hMethods = new HelpMethods();
        hMethods.setup();
        hMethods.introduction(Variables.player);
        hMethods.runCombat();
        hMethods.outro();
    }
}
