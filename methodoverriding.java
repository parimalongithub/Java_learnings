class a{
    public void meth1(){
        System.out.println("this is method 1 of class a");

    }
}
class b extends a{
    @Override
    public void meth1(){
        System.out.println("this is method 1 of class b");
    }
    public void meth2(){
        System.out.println("this is method 2 of class b");
    }

    
}
public class methodoverriding {
     public static void main(String[] args) {
        //a p=new a();
        //p.meth1();
        b q=new b();
        q.meth1();       



    }
}



