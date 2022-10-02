class Myhthread4 extends Thread{

    public void run(){
        int i=0;
        while(i<4){
        System.out.println("Iam the method in Mythread 4 class  ");
        i++;
        }
    }
}
class Mytheread5 extends Thread{
    public void run(){
        System.out.println("Iam the method in Mythread 5 class");

    }
}
public class thread_methods {
    public static void main(String[] args) {

        Myhthread4 m=new Myhthread4();
        Mytheread5 m1=new Mytheread5();
        m.start();
        try{
            m.join();
        }
        catch(Exception e){
            System.out.println(e);

        }
        m1.start();

    }
}
