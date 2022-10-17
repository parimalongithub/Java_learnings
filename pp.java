import java.util.*;


public class pp {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("please enter your target");
        int target=sc.nextInt();
       int []arry={2,5,4,3};
       //          {2,5,4,3,2}
      
       

       
       for (int i=0;i<arry.length;i++){
        for (int j = i+1 ; j<arry.length;j++){
            if(arry[i]+arry[j]==target){
                System.out.print(i);
                System.out.print(" ");
                System.out.print(j);
                System.out.print(" " );

            }

        }
        
           
  

       }

       

      
        

        
    }
}
