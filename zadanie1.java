package zadachi;
import java.lang.String;
import java.util.Scanner;
import java.util.Random;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner chislo = new Scanner(System.in);
        
        System.out.print("Enter temperature in celsius - ");
        int tselsij = chislo.nextInt();
        float farengeit= (float)tselsij*9/5+32;
        System.out.println("In farengeits it is "+farengeit+"F");

        System.out.print("Enter a three-digit number - ");
        Integer chislo_three = chislo.nextInt();
        String chislo_str = chislo_three.toString();
        while (chislo_str.length() !=3){
            System.out.println("Number not three-digit");
            System.out.print("Enter a three-digit number - ");
            chislo_three = chislo.nextInt();
            chislo_str = chislo_three.toString();
        }
        int ed = (chislo_three%100-chislo_three%10)/10;
        int des = chislo_three%10;
        int summ = ed+des;
        System.out.println("units is "+ed);
        System.out.println("dozens is "+des);
        System.out.println("summa is "+summ);
        /* функция рандома
        Random random = new Random();
        int chislo1 = random.nextInt(10);
        System.out.println(chislo1);
        */
        String[] animal = new String[]{"rat","bull","tiger","cat","dragon","snake","horse",
        "sheep","monkey","rooster","dog","pig"};
        String[] element = new String[]{"wood","fire","earth","metall","water"};
        System.out.print("Enter year - ");
        Integer year = chislo.nextInt();
        String year_str = year.toString();
        int lenght = year_str.length()-1;

        int con = 1;
        for (int i =0; i<lenght;i++){
            con = con*10;
        }

        if(year%12==4){
            System.out.print("Your animal is "+animal[0]);
        }else if(year%12==5){
            System.out.print("Your animal is "+animal[1]);
        }else if(year%12==6){
            System.out.print("Your animal is "+animal[2]);
        }else if(year%12==7){
            System.out.print("Your animal is "+animal[3]);
        }else if(year%12==8){
            System.out.print("Your animal is "+animal[4]);
        }else if(year%12==9){
            System.out.print("Your animal is "+animal[5]);
        }else if(year%12==10){
            System.out.print("Your animal is "+animal[6]);
        }else if(year%12==11){
            System.out.print("Your animal is "+animal[7]);
        }else if(year%12==0){
            System.out.print("Your animal is "+animal[8]);
        }else if(year%12==1){
            System.out.print("Your animal is "+animal[9]);
        }else if(year%12==2){
            System.out.print("Your animal is "+animal[10]);
        }else if(year%12==3){
            System.out.print("Your animal is "+animal[11]);
        }
        if (year%con==0 || year%con==1){
            System.out.println(" and element is "+element[3]);
        }else if(year%con==2 || year%con==3){
            System.out.println(" and element is "+element[4]);
        }
        else if(year%con==4 || year%con==5){
            System.out.println(" and element is "+element[0]);
        }
        else if(year%con==6 || year%con==7){
            System.out.println(" and element is "+element[1]);
        }
        else if(year%con==8 || year%con==9){
            System.out.println(" and element is "+element[2]);
        }
    }
}
