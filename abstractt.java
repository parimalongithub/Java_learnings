abstract class parent{
    parent (){
        System.out.println("iam constructor of k class");
    }
    void sayhello(){
        System.out.println(" hello i am method of the class");
    }
    abstract public void greet();
    abstract public void greet2();

}
class child extends parent{
    @Override
    public void greet(){
        System.out.println("good mornning");
    }
    public void greet2(){
        System.out.println("good afternoon");

    }
    
        
    }

abstract class child2 extends parent{
    public void the(){
        System.out.println("I Am Good");
    }
}


public class abstractt {
    public static void main(String[] args) {
        //parent a=new parent();this  line will throw the error beacuse its an abstract class and cannot be called directly the classes
        //child2 b=new child2() ;the classe which is derived from my class will can be called 
        };
        
        
    }



