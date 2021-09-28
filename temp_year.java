package zadania;
import java.lang.String;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class temp_year {
    public static int int_rand(int min, int max){
        Random random = new Random();
        int number = random.nextInt(max-min)+min;
        return (number);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] year = new int[12][];
        for (int i = 0; i<12;i++){
            if (i == 0 || i == 2 || i == 4 || i == 6 || i == 7 || i == 9 || i ==11){
                year[i] = new int[31];
            }else if(i == 3 || i == 5 || i == 8 || i == 10){
                year[i] = new int[30];
            }else{
                year[i] = new int[28];
            }
        }
        for (int i = 0; i<12;i++){
            for (int j = 0; j<year[i].length;j++){
                if (i == 0 || i == 1 || i == 11){
                    year[i][j]=int_rand(-10, 6);
                }else if (i == 3 || i == 4 || i == 5){
                    year[i][j]=int_rand(5, 21);
                }else if(i == 6 || i == 7 || i == 8){
                    year[i][j]=int_rand(20, 36);
                }else{
                    year[i][j]=int_rand(5, 21);
                }
            }
        }
        String[] months = new String[]{"Jan.","Feb.","Mar.","Apr.","May.","Jun.",
        "Jul.","Aug.","Sept.","Oct.","Nov.","Dec."};
        System.out.print("Enter the desired month (in mumbers) - ");
        int month = input.nextInt();
        while (month < 1 || month > 12){
            System.out.print("Enter the desired month - ");
            month = input.nextInt();
        }
        System.out.print("Enter the desired day - ");
        int day = input.nextInt();
        while (day < 0 || day > year[month-1].length){
            System.out.println("There is no such day");
            System.out.print("Enter the desired day - ");
            day = input.nextInt();
        }
        String sentens = new String(months[month-1] + day + " - " + year[month-1][day-1] + "C");
        System.out.println(sentens);
        int max = year[0][0];
        int min = year[0][0];
        float[] mid_months = new float[12];
        float md = 0;
        for (int i = 0; i < year.length; i++){
            md = 0;
            for (int j= 0; j < year.length; j++){
                if (max < year[i][j]){
                    max = year[i][j];
                }
                if (min > year[i][j]){
                    min = year[i][j];
                }
                md += year[i][j];
            }
            md /= 12;
            mid_months[i]= md;
        }
        System.out.println("Max. - "+ max +", min - "+ min);
        System.out.println("Average temperatures:");
        for (int i = 0; i < mid_months.length; i++){
            System.out.printf("%s %.2fC",months[i],mid_months[i]);
            System.out.println("");
        }
        System.out.println("You want see all temperatures in array?");
        String answer = input.next();
        if (answer.equals("yes")){
            System.out.println(Arrays.deepToString(year));
        }
    }
}
