class Employee{
    private int id;
    private String name;
    public void setname(String n){
        name=n;
    }
    public String getname(){
        return name;
    }
    public void setid(int i){

        id=i;
    }
    public int getid(){
        return id;
    }   
    
}
public class accescessmodifer {

    public static void main(String[] args) {  
      Employee parimal=new Employee();
     // parimal .id=21;this line will throw error because private
     // parimal.name="parimal";
     parimal.setname("hello there my name is parimal iam from pune i like listen music");
     System.out.println(parimal.getname());
     
    }
}