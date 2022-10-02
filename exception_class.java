import java.util.Scanner;

class myexception extends Exception{
      @Override
    public String toString() {
         return "IAM tostring";
    }
    @Override
    public String getMessage() {
        return "Iam getMeassage";
    }
}

public class exception_class {
   
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if (a<99){
            try{
           throw  new myexception();
           // throw new ArithmeticException("This is an exception");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);

            }

        }
        
    }
}
 