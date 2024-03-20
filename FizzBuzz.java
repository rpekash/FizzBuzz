
public class FizzBuzz {
    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++) {
            String output = "";
            if (number % 3 == 0) {
                output += "Fizz";
            }
            if (number % 5 == 0) {
                output += "Buzz";
            }
            if (output.equals("")) {
                System.out.println(number);
            } else {
                System.out.println(output);
            }
        }
    }
}
