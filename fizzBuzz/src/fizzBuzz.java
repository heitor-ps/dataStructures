public class fizzBuzz {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        for (int i = 0; i < number.length; i++) {
            if (number[i] % 3 == 0) {
                System.out.println("fizz at index " + number[i]);
            }
            if (number[i] % 5 == 0) {
                System.out.println("buzz at index " + number[i]);
            }
            if (number[i] % 3 == 0 && number[i] % 5 == 0) {
                System.out.println("fizz buzz at index " + number[i]);
            }
        }
    }
}
