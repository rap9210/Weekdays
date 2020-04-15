import java.util.Scanner;
public class Weekday {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number that " +
                "corresponds to a particular weekday: ");
        int wd_num = scn.nextInt();

        if (wd_num == 1){
            System.out.println("Sunday");
        }
        if (wd_num == 2){
            System.out.println("Monday");
        }
        if (wd_num == 3){
            System.out.println("Tuesday");
        }
        if (wd_num == 4){
            System.out.println("Wednesday");
        }
        if (wd_num == 5){
            System.out.println("Thursday");
        }
        if (wd_num == 6){
            System.out.println("Friday");
        }
        if (wd_num == 7){
            System.out.println("Saturday");
        }
    }
}
