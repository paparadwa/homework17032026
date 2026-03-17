import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("-----TASK 1-----");
        int[] inputArray1 = {10_000, 30_000, 15_000, 20_000, 25_000};
        float[] outputArray1 = new float[4];
        int maxCash = -10000;
        int minCash = 1_000_000_000;
        int index1 = 0;
        for (int j : inputArray1) {
            outputArray1[0] += j;
            if (j > maxCash) {
                maxCash = j;
                outputArray1[1] = maxCash;
            }
            if (j < minCash) {
                minCash = j;
                outputArray1[2] = minCash;
            }
            if (index1 == outputArray1.length - 1) {
                outputArray1[index1] = outputArray1[0] / inputArray1.length;
            }
            index1++;
        }
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));
        //task 2
        System.out.println("-----TASK 2-----");
        int[] inputArray2 = {10_000, 30_000, 15_000, 20_000, 25_000};
        float[] outputArray2 = new float[5];
        int index2 = 0;
        for (int j : inputArray2) {
            outputArray2[index2] = j * 0.87f;
            index2++;
        }
        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));
        //task 3
        System.out.println("-----TASK 3-----");
        int[] inputArray3 = {2000, 3000, 7000, 8000, 4000};
        boolean[] outputArray3 = new boolean[5];
        int index3 = 0;
        int bonus = 5000;
        for (int j : inputArray3) {
            if (j > bonus) {
                outputArray3[index3] = true;
            } else {
                outputArray3[index3] = false;
            }
            index3++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));
        //task 4
        System.out.println("-----TASK 4-----");
        int[] inputArray4 = {1000, -1500, 2000, 3000, -7500};
        boolean[] outputArray4 = new boolean[5];
        int index4 = 0;
        for (int i = 0; i < inputArray4.length; i++) {
            if (inputArray4[i] > 0) {
                outputArray4[index4] = true;
            } else {
                outputArray4[index4] = false;
                break;
            }
            index4++;
        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));
        //task 5
        System.out.println("-----TASK 5-----");
        int[] inputArray5 = {5000, 0, -1500, 2000, 7000};
        boolean[] outputArray5 = new boolean[5];
        int index5 = 0;
        for(int profit : inputArray5){
            outputArray5[index5] = profit > 0;
            index5++;
        }
        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));
    }
}