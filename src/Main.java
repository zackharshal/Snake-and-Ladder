// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static int random(){
        int rand = (int) ((Math.random() *6) +1);
        return rand;
    }
    public static int random3(){
        int rand = (int) ((Math.random() * 3) + 1);
        return rand;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder game.");
        int rand = random();
        System.out.println(rand);
        int check = random3();
        if(check == 1){
            System.out.println("No play");
        } else if (check == 2) {
            System.out.println("Ladder");
        }else{
            System.out.println("Snake");
        }
    }
}