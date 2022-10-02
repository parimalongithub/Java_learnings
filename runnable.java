class MyThreadRunnable implements Runnable{
    public void run(){
        int i =0;
        while(i<40000){
        System.out.println("I am thread1 not threat 1 ");
        i++;
        

    }
}
}


class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i =0;
        while(i<40000){
        System.out.println("I am thread2 not threat2");
        i++;
        }
     
        

    

    }
}



public class runnable {
    public static void main(String[] args) {
        MyThreadRunnable bullet=new MyThreadRunnable();
        Thread gun=new Thread(bullet);
        MyThreadRunnable1 bullet1=new MyThreadRunnable1();
        Thread gun1=new Thread(bullet1);
        gun.start();
        gun1.start();
    }
}


    