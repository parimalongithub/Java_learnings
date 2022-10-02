import java.util.Scanner;

public class condictional {
    public static void main(String[] args) {
        int age=18;
        boolean cond=(age>=18);
        if(cond){
            System.out.println("The he or she can vote!");
        }
        else{
        System.out.println("The he or she can not vote!");
        }



        //switch case
        int Age;
        Scanner sc=new Scanner(System.in);
        Age=sc.nextInt();

        switch (Age){
            case 18:
            System.out.println("you can vote");
            break;

            case 12:
            System.out.println("you can't vote");
            break;
        default:
        System.out.println("you are citizen of country");


        }




        
    }

}
