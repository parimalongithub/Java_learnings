class Base1{

    Base1(){
        System.out.println("iam a constructor");
    }
    Base1(int x){
        System.out.println("iam overloaded construcntor with value of x as "+x );
    }
    public int x;

    public void setx(int x){
        this.x=x;
    }   
    public  int getx(){
        return x;
    }
}
class derived1 extends Base1{
    int y;
    
    derived1(){
        //super(0);
        System.out.println("iam derived class constructor");
    }
    derived1(int x ,int y){
       
        super(x);
        System.out.println("iam overloaded  constructor  of derived with  value of y is " +y);
    }
    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y=y;
    }
}
class childofderived extends derived1{
    childofderived(){
        System.out.println("iam child derived constructor");
    }
    childofderived(int x  ,int y,int z){
        super(x,y);
        System.out.println("iam overloaded constructor of derived from derived 1 with value of z "+z);
    }
}
public class constructors_in_inheritance {
    public static void main(String[] args) {
        //Base1 okk=new Base1();
        //derived1 okk =new derived1(4,3);
        childofderived c=new childofderived(1,2,3);
        childofderived x =new childofderived();        
    }
    
}





