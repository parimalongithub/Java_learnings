public class multidimensional {
    public static void main(String[] args) {
        //this how we can intiate 2d araay/multidimesional array
        int multidimensional_araay[][];
        multidimensional_araay=new int[2][3];




        //this how we can assign value to the array
        multidimensional_araay[0][0]=101;
        multidimensional_araay[0][1]=102;
        multidimensional_araay[0][2]=103;
        multidimensional_araay[1][0]=201;
        multidimensional_araay[1][1]=202;
        multidimensional_araay[1][2]=203;       






        //this how we can print multidimesional array
        for(int x=0;x<multidimensional_araay.length;x++){
            for(int j=0;j<multidimensional_araay[x].length;j++){
                System.out.print(multidimensional_araay[x][j]);
                System.out.print(" ");
                 }
        }

    }    
}
