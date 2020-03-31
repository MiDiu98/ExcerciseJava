package array;

public class Exercise12 {

    public boolean checkEquivalentArr(int[] a, int[] b) {
        int[] diff = new int[3];
        int count = 0;
        if (a.length - b.length != 0) return false;

        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) {
                if (count > 1) return false;
                diff[count] = i;
                count++;
            }

        if (count == 0) return true;
        return (a[diff[0]] == b[diff[1]] && b[diff[0]] == a[diff[1]]) ? true : false;
    }
}
