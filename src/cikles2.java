public class cikles2 {
    public static void main(String[] args) {
        int x = 1;
        for (int y = 2; y < 1000000; y++) {
            boolean t = true;
            for (int z = 2; z < y; z++) {
                if (y % z == 0) {
                    t = false;
                    break;
                }
            }
            if (t) {
                System.out.println(y);
            }
        }
    }
}

