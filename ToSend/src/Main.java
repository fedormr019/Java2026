<<<<<<< Updated upstream
=======
class Main {
    public static void main(String[] args) {
        int a1[] = {1,2,3,4,5};
        int a2[] = {6,7,8,9,10};
        a1 = a2;

        System.out.println("a1[0] = " + a1[0]); // 6
        System.out.println("a1[4] = " + a1[4]); // 10
        System.out.println("a2[0] = " + a2[0]); // 6

        // Переменная a1 теперь ссылается на массив a2
        // Исходный массив {1,2,3,4,5} теряется
    }
}

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // toString
        int[] arr1 = {5, 2, 8, 1, 9};
        System.out.println("toString: " + Arrays.toString(arr1));

        // sort
        Arrays.sort(arr1);
        System.out.println("После sort: " + Arrays.toString(arr1));

        // binarySearch (массив должен быть отсортирован)
        int index = Arrays.binarySearch(arr1, 8);
        System.out.println("binarySearch 8: " + index);

        // equals
        int[] arr2 = {1, 2, 5, 8, 9};
        int[] arr3 = {1, 2, 5, 8, 9};
        int[] arr4 = {1, 2, 3, 4, 5};
        System.out.println("equals arr2 и arr3: " + Arrays.equals(arr2, arr3));
        System.out.println("equals arr2 и arr4: " + Arrays.equals(arr2, arr4));

        // compare (сравнивает лексикографически)
        int[] arr5 = {1, 2, 3};
        int[] arr6 = {1, 2, 5};
        System.out.println("compare arr5 и arr6: " + Arrays.compare(arr5, arr6));
    }
}
>>>>>>> Stashed changes
