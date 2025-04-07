public class rotateArray {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 5, 1, 3, 2 };
        int n = 7;

        for (int i = 0; i < n % arr.length; i++) {
            int currentValue = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = currentValue;
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }

    }
}
