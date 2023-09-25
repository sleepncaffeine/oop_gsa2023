class ArrayUtil {
    public static int[] concat(int[] a, int[] b) {
        // 배열 a와 b를 연결한 새로운 배열 리턴
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++)
            result[i] = a[i];
        for (int i = 0; i < b.length; i++)
            result[i + a.length] = b[i];
        return result;
    }

    public static void print(int[] a) {
        // 배열 a 출력
        System.out.print("[ ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.print("]");
    }
}

public class StaticEx {
    public static void main(String[] args) {
        int[] array1 = { 1, 5, 7, 9 };
        int[] array2 = { 3, 6, -1, 100, 77 };
        int[] array3 = ArrayUtil.concat(array1, array2);
        ArrayUtil.print(array3);
    }
}
