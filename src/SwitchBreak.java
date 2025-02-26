import java.util.Scanner;

public class SwitchBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("day");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
        }
    }



}
