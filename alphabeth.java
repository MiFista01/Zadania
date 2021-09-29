package zadania;

import java.util.Arrays;
import java.util.Scanner;

public class alphabeth {
    public static void main(String[] args) {
        finish:
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.print("Your sentens - ");
            String sentens = input.nextLine();
            //создания массива в котором каждый элемент это буква алфавита
            char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
            //создания массива в котором каждый элемент это буква алфавита

            char[] miss = new char[alphabet.length];
            //проверка на то что в фразе существуют все  буквы алфавита
            if (sentens.length()>=alphabet.length){
                int counter = 0;
                for (int i=0; i<alphabet.length;i++){
                    for (int j=0; j<sentens.length();j++){
                        if (sentens.contains(Character.toString(alphabet[i]))){
                            break;
                        }else{
                            miss[counter] = alphabet[i];
                            counter++;
                            break;
                        }
                    }
                }
                if (miss[0] == '\u0000'){
                    System.out.println("Your sentens is true");
                }else{
                    System.out.println("Your sentens is false");
                    System.out.println("You don't have:");
                    for (int i = 0; i<miss.length;i++){
                        if (miss[i] == '\u0000'){
                            break;
                        }
                        System.out.println(miss[i]);
                    }
                }
            }else{
                System.out.println("This sentens shorter than necessary");
            }
            System.out.println("You want again");
            String answer = input.next();
            if (answer.equals("no")){
                break finish;
            //проверка на то что в фразе существуют все  буквы алфавита
        }
    }
}
}
