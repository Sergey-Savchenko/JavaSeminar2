package exercise2;

public class main {

    public static void main(String[] args) {
        System.out.println(getAnswer());
    }
    
    public static boolean getAnswer() {
        int[] array = new int[] {1, 2, 10, 500};
        boolean check = true;
        for (int i=0; i<array.length-1; i++){
            if (array[i] >= array[i+1]){
                check = false;
                break;
                }
        }
        return check;
    }
}
