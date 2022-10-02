class Mythred extends Thread{
    Mythred(String name){

        super (name);

    }
    public void run(){
       
            System.out.println("I am thread");
        
            
         }
     
    }
public class thread_constructor {
    public static void main(String[] args) {
        Mythred m=new Mythred("parimal");
        m.start();
        System.out.println("the id of the thread is " +m.getId());
        System.out.println("the name of the thread is "+ m.getName());
       
    }
}
