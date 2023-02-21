public class Main {
    static int b ;
    static int c ;

    public static void main(String[] args) {

        int num = 6;
        for (b = 1, c = 1;  c < num + 1   ; c++) {
            b = c * b;
            System.out.println(b);  // -vv, can be erased
        }
        System.out.println(b);
    }
}