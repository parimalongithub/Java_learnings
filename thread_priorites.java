class Mythread3 extends Thread{
    Mythread3 (String name){
        super(name);

    }
    public void run(){
        while(true){
        System.out.println("name of the the student is "+this.getName());
        }
    }

    }
public class thread_priorites {
    public static void main(String[] args) {
        Mythread3 m1=new Mythread3("pariaml");
        Mythread3 m2=new Mythread3("Raj");
        Mythread3 m3=new Mythread3("omkar");
        Mythread3 m4=new Mythread3("harry bhai (Most Important)");
        m4.setPriority(Thread.MAX_PRIORITY);
        m3.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MIN_PRIORITY);
        m1.setPriority(Thread.MIN_PRIORITY);



        m1.start();
        m2.start();
        m3.start();
        m4.start();



        }
    }

