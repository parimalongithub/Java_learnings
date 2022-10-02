
public class strings {
    public static void main(String[] args) {
        String name=new String("parimal");
        int value=name.length();
        String l=name.toLowerCase();
        String u=name.toUpperCase();
        //string method
        System.out.println(value);
        System.out.println(l);
        System.out.println(u);
        String subString=name.substring(2);
        System.out.println(subString);
        System.out.println(name.substring(2,5));
        System.out.println(name.replace("par","mal" ));
        System.out.println(name.startsWith("par"));
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("a"));
        System.out.println(name.indexOf("zzx"));//if not present than the i will give output -1
        System.out.println(name.lastIndexOf("a")); 

        //escape sequence
        System.out.println("\"iam escape sequence \" ");
        System.out.println("my name is \n parimal");
        

        //String a="pariaml";
        //System.out.println(a);
       // int a=67;
       // float b =23;
       // System.out.printf("value of a is %d and value of f is %f ",a,b);




    
         


    }
}
