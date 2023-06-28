//public class cikles3 {
//    public static void main(String[] args) {
//        int i = 0;
//        int x;
//        while (x > 0) {
//            x/=10;
//            i++;
//
//        }
//    }
//}

public class cikles3 {
    public static void main(String[] args) {
        for (int x =10; x < 1000000; x++) {
            int i = 0;
            while (x > 0) {
                x /= 10;
                i++;

            }
        }
    }
}