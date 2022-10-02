
interface sampleinterface{
    void meth1();
    void meth2();
}
interface childsample extends sampleinterface{
    
    void meth3();
    void meth4();


}
class mySampleclass implements childsample{
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println();
    }
}
public class inheritanceininterface {
    public static void main(String[] args) {    
        System.out.println();   
    }
}