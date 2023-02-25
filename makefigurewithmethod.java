import java.util.Scanner;

public class makefigurewithmethod {
     static int f(int a,int b){
         if(a>0){
             System.out.print(a + " " );
             a-=5;
             return f(a,b);
         } return f1(a,b);
     }
     static int f1(int a,int b){
         if(a<=b){
             System.out.print(a + " ");
             a+=5;
             return f1(a,b);
         }return b;
     }
    public static void main(String[] args){
         Scanner input=new Scanner(System.in);
         int a;
         System.out.print("bir sayı giriniz: ");
         int b= input.nextInt();
         a=b;
         f(a,b);

}}
