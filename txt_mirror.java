package zadania;

import java.lang.String;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

import java.util.Scanner;

public class txt_mirror {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        char[] mass = new char[text.length()];
        for(int i = 0; i<text.length();i++){
            mass[i]= text.charAt(text.length()-1-i);
        }
        String mirror = new String(mass);
        System.out.println(mirror);
    }
}
