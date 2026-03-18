import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("-----TASK 1-----");
        int[] inputArray1 = {10_000, 30_000, 15_000, 20_000, 25_000};
        float[] outputArray1 = new float[4];
        int maxCash = inputArray1[0];
        int minCash = inputArray1[0];
        int index1 = 0;
        for (int j : inputArray1) {
            outputArray1[0] += j;
            if (j > maxCash) {
                maxCash = j;
            }
            if (j < minCash) {
                minCash = j;
            }
        }
        outputArray1[1] = maxCash;
        outputArray1[2] = minCash;
        outputArray1[3] = outputArray1[0] / inputArray1.length;
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));
        //task 2
        System.out.println("-----TASK 2-----");
        int[] inputArray2 = {10_000, 30_000, 15_000, 20_000, 25_000};
        float[] outputArray2 = new float[inputArray2.length];
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
        boolean[] outputArray3 = new boolean[inputArray3.length];
        int index3 = 0;
        int bonus = 5000;
        for (int j : inputArray3) {
            outputArray3[index3] = j > bonus;
            index3++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));
        //task 4
        System.out.println("-----TASK 4-----");
        int[] inputArray4 = {1000, -1500, 2000, 3000, -7500};
        boolean[] outputArray4 = new boolean[1];
        boolean positiveBalance = true;
        for (int j : inputArray4) {
            if (j > 0) {
                positiveBalance = true;
            } else {
                positiveBalance = false;
                break;
            }
        }
        outputArray4[0] = positiveBalance;
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));
        //task 5
        System.out.println("-----TASK 5-----");
        int[] inputArray5 = {5000, 0, -1500, 2000, 7000};
        int[] outputArray5 = new int[1];
        int rent = 0;
        for(int profit : inputArray5){
            if (profit > 0) {
                rent++;
            }
        }
        outputArray5[0] = rent;
        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));
    }
}