import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
      /*int age= 27;



      if(age<27) {
          System.out.println("girl");}
         else if(age==23){
          System.out.println("women");}
else{
          System.out.println("lady");

    }*/
      // int  age=23;
     //Scanner sc=new Scanner(System.in)  ;
        System.out.println("age");
    // int age =sc.nextInt();
Scanner sc=new Scanner(System.in);
int age=Integer.parseInt (args[0]);
        if(age<23){
            System.out.println("mam");}
         else{
            System.out.println("sir");
        }

    }
}
