public class methods {
    static void foo(){
        System.out.println("Good morning broo!!!");
    }
    static void foo(int a ){
        
        System.out.println("Good morning " + a + " bro ");
    } 
    static void change2(int arr[]){
        arr[0]=68;              
    }
    static void change(int a){
        a=98;
    }
    static void telljoke(){
        System.out.println("this is joke");
    }
    static int logic(int p,int q){
        int z;
        if(p>q){
            z=p+q;  
       }
       else{

        z=(p+q)*5; 
       } 
       return z;
    }    
    

public static void main(String[] args) {
    int a=3;
    int b=5;
    int c;
    System.out.println(logic(a, b));
    int [] marks={34,90,21,23,89};


//if we do not write static than we have create object like show below
//methods obj=new  methods();
telljoke();
a=69;
change(a); 
System.out.println(a);

//changing the array(in the case of array  refernce will be passed)
int []mark={52,24,12,43,23};
change2(mark);
System.out.println(mark[0]);


//method overloading
foo();
foo(3000);
}
}


