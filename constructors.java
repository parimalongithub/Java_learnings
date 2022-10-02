 class MyEmployee{
    private int id;
    private String name;    



    public MyEmployee(){
         id=34;
         name="parimal";
    }
    public MyEmployee(String myname ,int uid){
        id=uid;
        name=myname;
   }
    public void setname(String n){name=n;}
    public String getname(){return name;}
    public void setid(int i){id=i;}
    public int getid(){return id;}   
}
public class constructors {
    
    public static void main(String[] args) {
        MyEmployee parimal=new MyEmployee(); 
        System.out.println(parimal.getname());
        System.out.println(parimal.getid());
    }
}


