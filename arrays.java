public class arrays { 
    public static void main(String[] args) {
        //syntax of array
        int []marks=new int[5];
        marks[0]=70;
        marks[1]=67;
        marks[2]=55; 
        marks[3]=90;





        //syntax of an array type 2
        int [] mark;
        mark=new int[3];







        //syntax of an array type 3
        int[] mar={123,342,24,234,34,12,43,54};
        float []measurment={213.2f,12.32f,213.21f,10.22f};
        String[] name={"parimal","siddhika","gautami","harsh"};
        System.out.println(mar[2]);
        System.out.println(mar.length);
        System.out.println(measurment[2]);
        System.out.println(name[0]); 

        //prtinting all elements in the array
        for(int i=0;i<mar.length;i++){
            System.out.println(mar[i]);
           //prtinng all elements in reverse order
        for(int x=mar.length-1;x>=0;x--){
            System.out.println(mar[x]);




        }
        //                      for each loop                             //
        for(String element:name){
            System.out.println(element);
        }
 
        

         
    }    
}
}