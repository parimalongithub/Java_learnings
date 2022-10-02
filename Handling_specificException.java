
import java.util.Scanner;




public class Handling_specificException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr ={23,32,12,43,54};
        try{
            System.out.println("please the enter the index number you want to axis from the array");
            int index=sc.nextInt();
            System.out.println(arr[index]);
            System.out.println("Enter the number with which you want to divide the specific element of array");
            int number =sc.nextInt();
            System.out.println(arr[index]/number);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("!!!!!   please check your index number that you put in !!!!!!!");
            System.out.println(e);
            

        }
        catch(ArithmeticException e1){
            System.out.println("!!!!!  please check the number the you are dividing  with it  !!!!!");
            System.out.println(e1);

        }
        catch(Exception e3){
            System.out.println("some error occurd!!");
            System.out.println(e3);
        }

    
    }
}
