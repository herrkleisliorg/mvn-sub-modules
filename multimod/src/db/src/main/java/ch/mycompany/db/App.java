package ch.mycompany.db;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        int i = 42;
        try {
        } catch (Exception e) {
        }
    }

    //https://javabeginners.de/Algorithmen/Sortieralgorithmen/Mergesort.php
    public static int[] intArr = { 16, 23, 14, 7, 21, 20, 6, 1, 17, 13, 12, 9,
            3, 19 };
    public int[] sort(int l, int r) {

        if (l < r) {
            int q = (l + r) / 2;

            sort(l, q);
            sort(q + 1, r);
            merge(l, q, r);
        }
        return intArr;
    }

    private void merge(int l, int q, int r) {
        int[] arr = new int[intArr.length];
        int i, j;
        for (i = l; i <= q; i++) {
            arr[i] = intArr[i];
        }
        for (j = q + 1; j <= r; j++) {
            arr[r + q + 1 - j] = intArr[j];
        }
        i = l;
        j = r;
        for (int k = l; k <= r; k++) {
            if (arr[i] <= arr[j]) {
                intArr[k] = arr[i];
                i++;
            } else {
                intArr[k] = arr[j];
                j--;
            }
        }
    }

    public void foo () {
    }

    public void foo2 () {
    }
    private void foo3() {
        // no idea why this is empty
    }

    //https://javabeginners.de/Algorithmen/Sortieralgorithmen/Mergesort.php
    public static int[] intArr = { 16, 23, 14, 7, 21, 20, 6, 1, 17, 13, 12, 9,
            3, 19 };
    public int[] sort(int l, int r) {

        if (l < r) {
            int q = (l + r) / 2;

            sort(l, q);
            sort(q + 1, r);
            merge(l, q, r);
        }
        return intArr;
    }

    private void merge(int l, int q, int r) {
        int[] arr = new int[intArr.length];
        int i, j;
        for (i = l; i <= q; i++) {
            arr[i] = intArr[i];
        }
        for (j = q + 1; j <= r; j++) {
            arr[r + q + 1 - j] = intArr[j];
        }
        i = l;
        j = r;
        for (int k = l; k <= r; k++) {
            if (arr[i] <= arr[j]) {
                intArr[k] = arr[i];
                i++;
            } else {
                intArr[k] = arr[j];
                j--;
            }
        }
    }
}
