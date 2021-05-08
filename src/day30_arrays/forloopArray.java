package day30_arrays;

public class forloopArray {
    public static void main(String[] args) {
        int[] data= {32, 456, 4, 5, 8, 89, 998};
        for (int eachNum : data){
            System.out.println(eachNum);
        }
        for (int n: data){
            System.out.print(n+" ");
        }
        System.out.println();
        //repeat above with for loop
        for (int i=0; i < data.length; i++){
            System.out.print( data[i]+" ");
        }
        System.out.println();
        System.out.println(data[data.length-1]);
       // for (int idx= data.length; data.length>=0; idx--){
         //   System.out.println(data[idx]);
       // }
    }
}
