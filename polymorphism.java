interface camara2{
    void takesnap();
    void recordvideo();
    private void greet(){
        System.out.println("good morning ");

    }
    default void record4kvideo(){
        greet();
        System.out.println("recording in 4k video");

    }
}
interface wifi2{
    String[] getnetwork();
    void connectonewtwork(String network);

}
class MyCellPhone2{
    void callnumber(int phonenumber){
        System.out.println("calling"+phonenumber);

    }
    void pickcall(){
        System.out.println("connecting..."); 

    }
 
}
class mysmartphone2 extends MyCellPhone2 implements wifi2,camara2{
    public void takesnap(){
        System.out.println("taking the snap");
    }
    public void recordvideo(){
        System.out.println("recording the video ");   
    }
    public String[] getnetwork(){
        System.out.println("getting the newtwork list");
        String[] networklist={"pawar","pawar2"};
        return networklist;
    }
    public void connectonewtwork(String network){
        System.out.println("connecting to the network"+network);
    }
    public void record4kvideo(){
        System.out.println("take snap and record in 4k video");
    }
}

public class polymorphism { 
    public static void main(String[] args) {
        camara2 c=new mysmartphone2();//this smartphone use as the camara
        //cam1.getnetwork(); this not allowed
        c.record4kvideo();
    
        
    }
}