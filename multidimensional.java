public class multidimensional {
    public static void main(String[] args) {
        int flats[][];
        flats=new int[2][3];//syntax for 2d array
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;       
        System.out.println(flats[0][2]);
        for(int x=0;x<flats.length;x++){
            for(int j=0;j<flats[x].length;j++){
                System.out.print(flats[x][j]);
                System.out.print(" ");
                 }
        }

    }    
}
