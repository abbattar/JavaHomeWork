package Home_Work_3;

import java.util.Arrays;

public class JHW3_1 {
    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 7, -3, 12, 43, 2, 11, -34, 5};
        SortUnsorted(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
    private static void SortUnsorted(int[] a, int lo, int hi) {

        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        SortUnsorted(a, lo, mid);
        SortUnsorted(a, mid + 1, hi);
    
        int[] buf = Arrays.copyOf(a, a.length);
    
        for (int k = lo; k <= hi; k++)
            buf[k] = a[k];
    
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }
}
