public class breakandcontinue {
    public static void main(String[] args) {

        //use of break statment
        for(int i=0;i<80;i++){
            System.out.println(i);
            System.out.println("java never lets you down");
            if(i==2){
                System.out.println("Ending the loop here");
                break;
            }
    int a=0;   

        do{
            System.out.println(a);
            System.out.println("in do while loop");
            a++;
            if(a==10){
                System.out.println("this how we can break in do while loop");
                break;
            }
            
        }while(a<100);

        }
        //use of continue statment

        for(int i=0;i<80;i++){
           
            if(i==2){
                System.out.println("when was equal i was 2 there was continue stament therfore it skips that itration");
                continue;
            }
                System.out.println(i);
                System.out.println("java never lets you down");
            
    }
    
}
}
