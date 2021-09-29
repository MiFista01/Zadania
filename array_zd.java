package zadania;
import java.lang.String;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class array_zd {
    public static void print(int[] aray){
        System.out.println(Arrays.toString(aray));
    }
    public static void print(String[] aray){
        System.out.println(Arrays.toString(aray));
    }
    public static void main(String[] args) {
        // создать и заполнить массив рандомными числами
        Random random = new Random();
        int[] mass = new int[20];
        int counter = 0;
        int number;
        while(counter<20){
            number = random.nextInt(51);
            if (number%2==0){
                mass[counter]=number;
                counter++;
            }
        }
        print(mass);
        // создать и заполнить массив рандомными числами


        //нахождение наибольшего, наименьшего числа
        int max = mass[0];
        int min = mass[0];
        for(int i = 0; i<mass.length;i++){
            if (max < mass[i]){
                max = mass[i];
            }
            if (min > mass[i]){
                min = mass[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        //нахождение наибольшего, наименьшего числа


        //сортировка и копирования массива
        Arrays.sort(mass);
        int[] mass_copy = Arrays.copyOfRange(mass, 1, mass.length-1);
        print(mass);
        print(mass_copy);
        //сортировка и копирования массива

        //среднее число оригинала
        float average = 0;
        for (int i = 0;i<mass.length;i++){
            average += mass_copy[i];
        }
        System.out.println(average/mass_copy.length);
        //среднее число оригинала
    }
} 
