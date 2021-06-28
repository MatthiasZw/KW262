package utils;


public abstract class IOTools {


        public static String readLine(String info) {
        System.out.println(info);
        return new java.util.Scanner(System.in).nextLine();

}
        public static int readInteger(String info) {
        System.out.println(info);
        return new java.util.Scanner(System.in).nextInt();
}
        public static double readDouble(String info) {
        System.out.println(info);
        return new java.util.Scanner(System.in).nextDouble();
    }
}
