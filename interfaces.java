interface Bicycle{
    int x=80;
    void applybrake(int decrement);
    void speedup(int incerement);

}
interface blowhorn{
    void bell();
    void electronic();
}
class Herocycle implements Bicycle,blowhorn{
    int x=4;
    void blowhorn(){
        System.out.println("tring tring");
    }
    public void applybrake(int decrement){
        System.out.println("appying the brake");
    }
    public void speedup(int incerement){
        System.out.println("paddling");
    }
    public void bell(){
        System.out.println("tring tring ");
    }
    public void electronic(){
        System.out.println("tweka tweak");
    }
}
public class interfaces {
    public static void main(String[] args) {
        Herocycle h=new Herocycle();
        h.applybrake(4);
        System.out.println(h.x);
        h.electronic(); 
        
        //you can create properties in interfaces
        //h.a=12;
        //you cannot modify the 
    }
    
}
