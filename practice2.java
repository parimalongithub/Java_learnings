import java.util.Scanner ;

public class practice2 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float b=7/4f*9/ 2;
        System.out.println(b);
        char grade='a';
        grade=(char)(grade+8);
        System.out.println(grade);
        //decryption of grade
        char dgrade=(char)(grade-8);
        System.out.println(dgrade);
        //problem 3
       // int user=sc.nextInt();
       // System.out.println(user>9);
       int finalvelo=sc.nextInt();

       System.out.println("finalvelocity"+finalvelo);
       int initalvelo=sc.nextInt();
       System.out.println("intalvelocity"+initalvelo);
       int a=sc.nextInt();
       System.out.println("acelearation"+a);
       int s=sc.nextInt();
       System.out.println("distance traveeled"+s);
       int motioneq=(finalvelo^2-initalvelo^2)/2*a*s;
       System.out.println("equation of motion"+motioneq);
    }
}
