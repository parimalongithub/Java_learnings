class phone{
    public void greet(){
        System.out.println("Good morning");
    }
    public void on(){
        System.out.println("Turing on the phone.....");
    }
}
class smartphone extends phone{
    public void playmusic(){
        System.out.println("playing the music");
    }
    public void on(){
        System.out.println("Turing on smartphone.....");
    }
}
public class dynamicmethoddispatch {
    public static void main(String[] args) {
      //  phone obj=new phone();  Allowed
      //  smartphone obj1=new smartphone();    Allowed
      //  obj.name();
        phone obj=new smartphone(); //this is allowed from super class to subclass
       // smartphone ok=new phone(); this not allowed from subclass to superclass
    obj.on();
    //obj.playmusic(); this not allowed"
    
        
    }
}


 