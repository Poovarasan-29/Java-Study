public class moveZerosAtLast {
    public static void main(String[] args) {
        int[] array = { 1, 3, 4, 5, 0, 6, 7, 9, 0, 5, 0, 3 };
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                int j = i;
                count++;
                while (j < array.length - count) {
                    array[j] = array[j + 1];
                    j++;
                }
                array[j] = 0;
            }
        }
        for (int arr : array) {
            System.out.print(arr + " ");
        }
    }
}
