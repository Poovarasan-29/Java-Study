
public class duplicateNums {
    public static void main(String[] args) {
        int[] array = { 1, 3, 3, 1, 1, 34, 5, 34 };

        int count = 0;
        for (int i = 0; i < array.length - count - 1; i++) {
            for (int j = i + 1; j < array.length - count; j++) {
                if (array[i] == array[j]) {
                    count++;
                    for (int k = j; k < array.length - 1 - count; k++) {
                        array[k] = array[k + 1];
                    }
                    j--;
                }
            }
        }
        for (int i = 0; i < array.length - count; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
