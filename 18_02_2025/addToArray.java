public class addToArray {
    public static void main(String[] args) {
        int arr1[] = { 9, 9, 9, 9, 2 };
        int arr2[] = { 9, 7, 7, 7, 2 };
        int lenOfArr1 = arr1.length;
        int lenOfArr2 = arr2.length;
        int max = lenOfArr1 > lenOfArr2 ? lenOfArr1 : lenOfArr2;

        int result[] = new int[max + 1];
        int carry = 0;
        for (int i = 0; i < max; i++) {
            int add = 0;
            if (lenOfArr1 > i && lenOfArr2 > i) {
                add = arr1[i] + arr2[i] + carry;

            } else if (lenOfArr1 > i) {
                add = arr1[i] + carry;

            } else if (lenOfArr2 > i) {
                add = arr2[i] + carry;
            }

            if (add > 9) {
                result[i] = add % 10;
                carry = 1;
            } else {
                result[i] = add;
                carry = 0;
            }
        }
        result[max] = carry;

        for (int i = 0; i < (carry == 1 ? max + 1 : max); i++) {
            System.out.print(result[i] + " ");
        }

    }

}