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
        number = random.nextInt(10)+1;
        // игра с циклом for
        for (int i = 0; i <5;i++){
            System.out.print("Your number is ");
            player = chislo.nextInt();
            if ((player > number-3 && player < number+3) && player != number){
                System.out.println("This is hot");
            }else if ((player >=1 && player <= 10) && player != number){
                System.out.println("This is cold");
            }else if (player ==  number){
                System.out.println("This number true");
                break;
            }
            if (i == 4 && player !=  number){
                System.out.println("You lose, true number is "+number);
            }
        }
        // игра с циклом while
        int j =0;
        number = random.nextInt(10)+1;
        while(j<4 ){
            System.out.print("Your number is ");
            player = chislo.nextInt();
            if ((player > number-3 && player < number+3) && player != number){
                System.out.println("This is hot");
            }else if ((player >=1 && player <= 10) && player != number){
                System.out.println("This is cold");
            }else if (player ==  number){
                System.out.println("This number true");
                break;
            }
            if (j == 4 && player !=  number){
                System.out.println("You lose, true number is "+number);
            }
            j++;
        }
        
        int j = 0;
        while(j==0){
            number = random.nextInt(10)+1;
            for (int i = 0; i <5;i++){
                System.out.print("Your number is ");
                player = chislo.nextInt();
                if ((player > number-3 && player < number+3) && player != number){
                    System.out.println("This is hot");
                }else if ((player >=1 && player <= 10) && player != number){
                    System.out.println("This is cold");
                }else if (player ==  number){
                    System.out.println("This number true");
                    break;
                }
                if (i == 4 && player !=  number){
                    System.out.println("You lose, true number is "+number);
                }
            }
            System.out.println("You want play again? ");
            String answer = chislo.next();
            if (answer.equals("no")){
                break;
            }
        }
    }
}
