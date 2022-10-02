import java.util.Scanner;



public class nested_trycatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index number ");
        int ind=sc.nextInt();
        int []arr ={23,32,12,43,54};
        try{
            System.out.println("you are in first try block");
            try{
                System.out.println(arr[ind]);

            }
            catch(ArrayIndexOutOfBoundsException w){
                System.out.println("please index number you put in");
                System.out.println(w);
    
            }

        }
        catch(Exception w){//this catch will not work if the exception is caught in first block
            System.out.println("exception on first block");
            System.out.println(w);



        }
      


    }
}
