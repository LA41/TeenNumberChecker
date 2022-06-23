public class TeenNumberChecker {
    public static boolean hasTeen(int q, int w, int e) {
        return isTeen(q) || isTeen(w) || isTeen(e);
    }
    public static boolean isTeen(int r) {
        return r >= 13 && r <= 19;
    }
}
