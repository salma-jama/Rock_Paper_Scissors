public class Game {
    public static void main(String[] args){
        String player1 = RandomChoice();
        String player2 = RandomChoice();
        String result = Winner(player1,player2);
        System.out.println("Player 1:" + player1);
        System.out.println("Player 2:" + player2);
        System.out.println("Result:" + result);
    }
    public static String RandomChoice(){
        int choice = (int) (Math.floor((Math.random() * 3)));
        if(choice == 0){
            return "Rock";
        } else if (choice == 1) {
            return "Paper";
        }else if(choice == 2){
            return "Scissors";
        }else{
            return "";
        }
    }
    public static String Winner(String player1, String player2){
        if(player1.equals(player2)){
            return "It's a tie!";
        }else if(player1.equals("Rock") && player2.equals("Scissors") || player1.equals("Scissors") && player2.equals("Paper") || player1.equals("Paper") && player2.equals("Rock")){
            return "PLayer 1 Wins!";
        }else{
            return "Player 2 Wins!";
        }
    }
}