package exercise3;
import java.util.Arrays;

public class main {
    
    public static void main(String[] args) {
        int[] array = new int[] {-1, 2, 10, 500};
        System.out.println(Arrays.toString(array));
        int doubleSum = 0;
        for (int i=0; i<array.length; i++){
            if (array[i]>9 && array[i]<100){
                doubleSum = doubleSum + i;
            }
        }
        System.out.println(doubleSum);
        for (int i=0; i<array.length; i++){
            if (array[i]<0){
                array[i]=doubleSum;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}    