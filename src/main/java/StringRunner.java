import java.util.Arrays;

//Changed name of class from dupe "Problem" to "ProblemOne"- otherwise program will not run 
class ProblemOne {
  // declare the convertToString method here
  static <E> String convertToString(E[] array) {
    return Arrays.toString(array);
  }
}

public class StringRunner {
  public static void main(String[] args) {
    Integer[] inputInt = { 1, 2, 3 };
    String[] inputStr = { "Cake", "Donut", "Cupcake" };

    System.out.println(ProblemOne.convertToString(inputInt)); // [1, 2, 3]
    System.out.println(ProblemOne.convertToString(inputStr)); // [Cake, Donut,
    // Cupcake]
  }
}