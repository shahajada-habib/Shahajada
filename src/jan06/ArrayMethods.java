package jan06;

public class ArrayMethods {

    // method1: return int array
    public int[] method1() {
        return new int[] {10, 20, 30, 40, 50};
    }

    // method2: return String array
    public String[] method2() {
        return new String[] {"Karim", "Kalachan", "Kuddus"};
    }

    // main method to test both
    public static void main(String[] args) {
        ArrayMethods obj = new ArrayMethods();

        int[] numbers = obj.method1();
        System.out.print("method1 array: ");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();

        String[] names = obj.method2();
        System.out.print("method2 array: ");
        for (String s : names) System.out.print(s + " ");
    }
}
