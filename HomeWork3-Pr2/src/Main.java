public class Main {
    public static void main(String[] args) {
        int a = (int) ( Math.random() * 999 );
        System.out.println(a);
        int b = (int) ( Math.random() * 999 );
        System.out.println(b);
        int c = (int) ( Math.random() * 999 );
        System.out.println(c);
        int d = a + b + c ;
        System.out.println(" Сумма чисел = " + d );
        int n = a * b * c ;
        System.out.println(" Произведение чисел = " + n );

    }
}
