package util;

public class Range {
    public static int[] range(int count) {
        int[] res = new int[count];
        for (int i = 0; i < count; i++) {
            res[i] = i;
        }
        return res;
    }

    public static int[] range(int start, int end) {
        int count = end - start;
        int[] res = new int[count];
        for (int i = 0; i < count; i++) {
            res[i]  = i + start;
        }
        return res;
    }

    public static int[] range(int start, int end, int step) {
        int count = 0;
        if ((end - start) % step != 0) {
            count = (end - start) / step + 1;
        }else {
            count = (end - start) / step;
        }
        int[] res = new int[count];
        if (count == 0) return null;
        res[0] = start;
        for (int i = 0; i < count; i++) {
            res[i]  = start + i * step;
        }
        return res;
    }
}
