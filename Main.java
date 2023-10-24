import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //program that checks the role of the user
        Scanner input=new Scanner(System.in);
        System.out.println("Enter role");
        String role=input.next();

        if (role.contains("admin")){
            System.out.println("welcome admin");}
        else if(role.contains("superuser")){
            System.out.println("welcome superuser");}
        else  {
            System.out.println("welcome user");}




        // print the greatest number
        System.out.println("Enter three numbers");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        System.out.println("the greatest number is");

        if(num1>num2&&num1>num3){
            System.out.println(num1);}

        else if (num2>num1&&num2>num3){
                System.out.println(num2);}

         else {
            System.out.println(num3);}


 // q3 t keeps a number from the user and generates
          Random randomNum = new Random();
            int dayNum=randomNum.nextInt(7);

             switch (dayNum){

                 case 1:
                     System.out.println("ٍٍSunday");
                     break;

                 case 2:
                     System.out.println("Monday");
                     break;

                 case 3:
                     System.out.println("Tuseday");
                     break;

                 case 4:
                     System.out.println("Wednesday");
                     break;

                 case 5:
                     System.out.println("Thursday");
                     break;

                 case 6:
                     System.out.println("Sunday");
                     break;
                 default:
                     System.out.println("Friday");


        }


//q4 corresponding letter grade
        System.out.println("Enter your gread");
        int score=input.nextInt();
            if (score>=90 && score<=100){
                System.out.println("your gread is A");}

                else if (score>=80 && score<=89){
                System.out.println("your gread is B");
                }
                else if (score>=70 && score <=79){
                System.out.println("your gread is c");}

                else if (score >=60 && score <=69){
                    System.out.println("your gread is d");}
               
                    else{
                    System.out.println("your gread is F");
                }
         //categorizes them into one of three age categories: "Child," "Teenager,"
        //or "Adult"
        System.out.println("Enter your Age");
          int age=input.nextInt();
          if(age<13){
              System.out.println("you are child");
          }
            else if (age>13&&age<19){
                System.out.println("you are teenager");
            }
            else
                System.out.println("you are adult");
                }


            }






