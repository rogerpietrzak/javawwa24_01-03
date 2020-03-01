import java.util.List;
import java.util.OptionalLong;

final class Algorithms {
    public static boolean isPalindrom(String string) {

        return true;
    }

    public static int NWD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static OptionalLong sumOf(List<Integer> lista) {

        return OptionalLong.empty();
    }


    public static int abs(int a){
        if (a >= 0) {
            return a;
        } else {
            return a * (-1);
        }

    }

    public static long pow (long a, long b) {
        return 0;
    }


    public static long sil (long a) {
        return 0;
    }
}

