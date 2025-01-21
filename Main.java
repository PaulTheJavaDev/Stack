import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        //stack = LIFO data structure. Last-In First-Out
        //stores objects into a sort of "vertical tower"
        //push() to add to the top
        //pop() to remove from the top

        // uses of stacks?
        // 1. undo/red features in text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)

        ArrayList<String> games = new ArrayList<>();
        games.add("Minecraft");
        games.add("DOOM");
        games.add("Mario Party"); //Nintendo pls don't copyright me

        Stack<String> apps = new Stack<>();
        apps.push("Minecraft");
        apps.push("Roblox");
        apps.push("Intellij IDEA");
        apps.push("Discord");

    
        
    }

}
