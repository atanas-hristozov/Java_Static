import Tools.ToolBox;

public class Main {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Ivan");
        Friend friend2 = new Friend("Georgi");
        Friend friend3 = new Friend("Todor");
        Friend friend4 = new Friend("Maria");
        System.out.println(Friend.numberOfFriends);

        Friend.displayFriends();
    }
}