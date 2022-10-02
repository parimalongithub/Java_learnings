
public class finally_block {
    public static int greet(){
        try{
            int a=50;
            int b=0;
            int c=a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
            
        }
        finally{//this will line of code will execute any how!!
            System.out.println("Clening up the resourses!");
        }
        return 0;
    }
    public static void main(String[] args) {
        int k=greet();
        System.out.println(k);




        


        
   
    }
}
