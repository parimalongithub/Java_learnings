public class Erros_exception {
    public static void main(String[] args) {
        int a=56;
        int b= 0;
        int c;
        try{
            c=a/b;
        }
        catch(Exception e){
            System.out.println("WE FAILED TO DIVIDE REASON FOR BEING :" );
            System.out.println(e);

        }
        System.out.println(a/b);
    }
}




