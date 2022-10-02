class theEmployee{
    int id;
    String name;
    public void printdeatail(){
        System.out.println("my name is "+name);
        System.out.println("my id is "+id);
    }
}
public class oops {

    public static void main(String[] args) {
        System.out.println("");
        theEmployee harry=new theEmployee();//instating new employee object
        theEmployee mangesh=new theEmployee();
        //setting the attribute
        harry.name="codewithharry";
        harry.id=12;
        mangesh.id=20;
        mangesh.name="mangesh pandey";
        //setting the attribute

        //System.out.println(p.id);
        //System.out.println(p.name);
        harry.printdeatail();
        mangesh.printdeatail();
    }
}
