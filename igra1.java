package zadania;
import java.lang.String;
import java.util.Scanner;
import java.util.Random;

public class igra1 {
    public static void main(String[] args) {
        Scanner chislo = new Scanner(System.in);
        Random random = new Random();
        int number;
        int player;
        number = random.nextInt(11)+1;
        for (int i = 0; i <5;i++){
            System.out.print("Your number is ");
            player = chislo.nextInt();
            if (player > number){
                System.out.println("This number is greater than the specified number");
            }else if (player < number){
                System.out.println("This number is less than the specified number");
            }
            else{
                System.out.println("This number true");
                break;
            }
            if (i == 4 && player !=  number){
                System.out.println("You lose, true number is "+number);
            }
        }
    }
}
