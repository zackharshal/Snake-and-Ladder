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
        int position = 0;
        while(position != 100){
            int rand = random();
            position += rand;
            int check = random3();
            if(check == 2){
                position += rand;
            } else if (check == 3) {
                position -= rand;
                if(position < 0){
                    position = 0;
                }
            }else{
                continue;
            }
        }
        System.out.println("Player won the game.");

    }
}