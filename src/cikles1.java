public class cikles1 {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int z = x + y;
        System.out.println(x+"\n"+y);
        for (; z < 10000000; x=y,y=z)
        {
            z=x+y;
            System.out.println(z);
        }
    }
}