package problem04;

public class Problem04 {

    public static boolean hasPairWithSum(int[] array, int targetSum) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    return true; 
                }
            }
        }
        return false;
    }
}



