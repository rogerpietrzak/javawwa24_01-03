import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;

final class Algorithms {
    public static boolean isPalindrom(String string) {

        return true;
    }

    public static int NWD (int a, int b) {
        while ( a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
/*
    public static OptionalLong sumOf(List<Integer>) {

        return OptionalLong.empty();
    }*/
    }
    public static int abs(int a){
        return 0;
    }
}
