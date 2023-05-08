package exercise1;

public class main {

    public static void main(String[] args) {
        System.out.println(getSum());
    }

    public static int getSum() {
        int[] array = new int[] {-1, -10, 5, 2, 3, 4, 88};
        int sum = 0;
        boolean check = true;
        for (int i=0; i<array.length; i++){
            if (array[i] > 1){
                check = true;
                for (int j=2; j<array[i]; j++){
                    if (array[i] % j == 0){
                    check = false;
                    break;
                    }
                }
                if (check==true){
                    sum = sum + array[i];
                }
            }
        }
        return sum;
    }
}