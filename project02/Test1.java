package project02;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[]{12,3,64,35,77,43};
        int temp = arr[0];
        for (int i= 0;i < arr.length;i++){
            arr[i] = arr[i] / temp;
            System.out.print( arr[i] + " ");
        }
        System.out.println();
    }
}
