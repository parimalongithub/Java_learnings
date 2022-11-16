interface camara{
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
interface wifi{
    String[] getnetwork();
    void connectonewtwork(String network);

}
class MyCellPhone{
    void callnumber(int phonenumber){
        System.out.println("calling"+phonenumber);

    }
    void pickcall(){
        System.out.println("connecting...");

    }
 
}
class mysmartphone extends MyCellPhone implements wifi,camara{
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
public class default_methods {
    public static void main(String[] args) {


        mysmartphone ms=new mysmartphone();
        String[]af=ms.getnetwork();
        for (String string : af) {
            System.out.println(string );
        }
        ms.record4kvideo();
    }
}

