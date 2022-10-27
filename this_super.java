class ok{
    int a;
    public int geta(){
        return a;
 
    }

    
    ok(int a){
        this.a=a;//this is how we use 'this' meathod

    }
    public int returnone(){
        return 1;
    }
    
}

public class this_super {
    public static void main(String[] args) {
        ok k=new ok(2);
        System.out.println(k.geta());

        
    }
}