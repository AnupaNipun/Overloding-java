public class sum {
    void sum(int a, long f) {
        System.out.println(a + f);

    }
    void sum(int r, int e) {
        System.out.println(r + e);
    }
    public static void main(String[] args) {
    sum a = new sum();
    a.sum(5, 12345L);
    a.sum(9, 54321);
    }



}
