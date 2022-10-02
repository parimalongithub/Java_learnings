
import java.util.Scanner;

public class calculatingthepercentage {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println(" MARKS are total out of ");
        float total_marks=sc.nextInt();
        System.out.println("please enter marks 1 subject");
        int marks_1_sub= sc.nextInt();
        System.out.println("please enter marks 2 subject");
        int marks_2_sub= sc.nextInt();
        System.out.println("please enter marks 3 subject");
        int marks_3_sub= sc.nextInt();
        System.out.println("please enter marks 4 subject");
        int marks_4_sub= sc.nextInt();
        System.out.println("please enter marks 5 subject");
        int marks_5_sub= sc.nextInt();
        float add=marks_1_sub+marks_2_sub+marks_3_sub+marks_4_sub+marks_5_sub;
        float percentage=(add*100/total_marks);
         System.out.print("congratulation you got- "+percentage);

    }
}


