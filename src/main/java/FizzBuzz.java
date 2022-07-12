public class FizzBuzz {
    public String fizzBuzzString(String str) {
        if (str.startsWith("f")) return "Fizz";
        if (str.endsWith("b")) return "Buzz";

        if (str.startsWith("f") && str.endsWith("b")) return "FizzBuzz";

        return str;


    }
}