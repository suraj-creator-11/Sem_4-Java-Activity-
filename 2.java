class Printer {

    // Print an integer
    void print(int num) {
        System.out.println("Integer: " + num);
    }

    // Print a string
    void print(String str) {
        System.out.println("String: " + str);
    }

    // Print an array of integers
    void print(int[] arr) {
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

public class PrinterDemo {
    public static void main(String[] args) {
        Printer p = new Printer();

        // Print an integer
        p.print(100);

        // Print a string
        p.print("Hello, Java!");

        // Print an array of integers
        int[] numbers = {10, 20, 30, 40, 50};
        p.print(numbers);
    }
}