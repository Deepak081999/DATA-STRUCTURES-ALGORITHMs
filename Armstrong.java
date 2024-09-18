public class Armstrong {
    public static void main(String[] args) {
        // Example : 5 =(5)2 = 25
        // 6 = (6)2 = 36
        // 25 = (25)2 = 625
        // 76=(76)2 = 5776
        // 376 = (376)2 = 141376
        // 890625 = (890625)2 = 793212890625

        int n = 10, sq = n * n;
        if (isAutomorphic(n) == 1)
            System.out.println("Num: " + n + ", Square: " + sq + " - is Automorphic");
        else
            System.out.println("Num: " + n + ", Square: " + sq + " - is not Automorphic");

    }

    static int isAutomorphic(int n) {
        int square = n * n;
        while (n != 0) {
            // means not automorphic number
            if (n % 10 != square % 10) {
                return 0;
            }
            // reduce down numbers
            n /= 10;
            square /= 10;
        }
        // if reaches here means automorphic number
        return 1;
    }
}
