 public class variableargs {
    static int sum(int x,int...arr){
        int resul=x;
        for(int b:arr){
            resul+=b;
        }
        return resul;
    }
    static int add(int...arr){
        int result =0;
        for(int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        int a=add(1);
        System.out.println(a);
        //this canoot need atleast one element 

        int y=sum(2);
        System.out.println(y);
    }
}
