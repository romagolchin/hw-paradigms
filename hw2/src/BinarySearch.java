/**
 * Created by romag_000 on 20/02/2016.
 */
public class BinarySearch {
    //Pre: a[i] >= a[i + 1], 0 <= i < a.length - 1
    static int binSearch(int x, int[] a) {
        int l = -1;
        int r = a.length - 1;
        if (l == r)
            return 0;
        //Inv: ( (a[l] > x >= a[r]) || (l == -1) || (a[r] > x) ) && r > l
        while (r > l + 1) {
            int m = (l + r) / 2;
            if (a[m] <= x)
                r = m;
                //r' == (l + r) / 2 && a[r'] <= x
            else
                l = m;
            //l' == (l + r) / 2 && a[l'] > x
        }
        //Inv && r' == l' + 1
        if (a[r] > x)
            r += 1;
        return r;
    }
    //Post: (a[R - 1] > x >= a[R] => R = min j | a[j] <= x) ||
    //(R == a.length && a[R] > x) || (a.length == 0 && R == 0)

    //Pre: a[i] >= a[i + 1], 0 <= i < a.length - 1 && -1 <= l < r < a.length
    static int helper(int x, int[] a, int l, int r) {
        if (l == r - 1) {
            if (a[r] > x)
                r += 1;
            return r;
        } else {
            int m = (l + r) / 2;
            if (a[m] <= x)
                return helper(x, a, l, m);
            else
                return helper(x, a, m, r);
        }
    }
    //Post: (a[R - 1] > x >= a[R] => R = min j | a[j] <= x) ||
    //(R == a.length && a[R] > x) || (a.length == 0 && R == 0)

    //Pre: a[i] >= a[i + 1], 0 <= i < a.length - 1
    static int recursiveBinSearch(int x, int[] a) {
        if (a.length > 0)
            return helper(x, a, -1, a.length - 1);
        else
            return 0;
    }
    //Post: (a[r - 1] > x >= a[r] => r = min j | a[j] <= x) ||
    //( ( (min a[j] > x) || (a.length == 0) ) && r == -1)

    public static void main(String[] args) {
        int x = Integer.valueOf(args[0]);
        int[] arr = new int[args.length - 1];
        for (int i = 1; i < args.length; ++i)
            arr[i - 1] = Integer.valueOf(args[i]);
        System.out.println(binSearch(x, arr));
//        System.out.print(recursiveBinSearch(x, arr));
    }
}
