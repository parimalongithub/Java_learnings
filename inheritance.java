class Base{
      int x;

    public void setx(int x){
        this.x=x;
    }   
    public  int getx(){
        return x;
    }
    public void printme(){
        System.out.println("iam a cosntructor");
    }
}

class derived extends Base{//this how we extends or inherit the class from base class
    int y;
    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y=y;
    }


}
public class inheritance {
    public static void main(String[] args) {
        Base b=new Base();
        b.setx(4);
        System.out.println(b.getx());
    }
}
 