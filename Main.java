import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        //Credits: Bro Code

        //stack = LIFO data structure. Last-In First-Out
        //stores objects into a sort of "vertical tower"
        //push() to add to the top
        //pop() to remove from the top

        // uses of stacks?
        // 1. undo/red features in text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)

        //defining an ArrayList for .addAll Method
        ArrayList<String> games = new ArrayList<>();
        games.add("Minecraft");
        games.add("DOOM");
        games.add("Mario Party"); //Nintendo pls don't copyright me

        //adding different apps to the Stack
        Stack<String> apps = new Stack<>();
        apps.push("Minecraft");
        apps.push("Roblox");
        apps.push("Intellij IDEA");
        apps.push("Discord");

        System.out.println("The last item of the Stack is: " + apps.peek()); //returns the last value of the stack
        System.out.println("Deleted the last item: " + apps.pop()); //returns the last item of the stack that is removed

        //checking if the stack still contains "Discord"
        //if position is -1 then it's non-existent
        System.out.println("Position of the searched item:" + apps.search("Discord"));
        System.out.println("Is the Stack empty: " + apps.empty()); //checks if the stack is empty

        System.out.println("Added Games to the Stack: " + apps.addAll(games)); //adds the ArrayList to the Stack
        System.out.println(apps);
        
    }

}
