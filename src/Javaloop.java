public class Javaloop {
    public static void main(String[] args){
        /*
        result=condition?expression1:expression2;
        A=90-100
        B=80-89
        C=70-79
        D=60-69
        F=0-59
         */
    int m=87;
    String grade=(m>=90)?"A":(m>=80 && m<=89)?"B":(m>=70 && m<=79)?"C":(m>=60 && m<=69)?"D":"F";
System.out.println(grade);
    }
}
