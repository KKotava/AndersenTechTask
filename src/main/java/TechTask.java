import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TechTask {

  public static void main (String[] Args) {
    int number;
    String name;
    int size;
    Scanner scanner = new Scanner(System.in);

//Make up an algorithm
//If the entered number is greater than 7, then print “Hello”
    System.out.println("Enter the number");
    while (!scanner.hasNextInt()) scanner.next();
    number = scanner.nextInt();
    if (number > 7) {
      System.out.println("Hello");
    }

//If the entered name matches “John”, then output “Hello, John”, if not, then output "There is no such name"
    System.out.println("Enter your first name");
    name = scanner.next();
    if (name.equals("John")) {
      System.out.println("Hello, John");
    } else {
      System.out.println("There is no such name");
    }

//There is a numeric array at the input, it is necessary to output array elements that are multiples of 3
    System.out.println("Enter size of the array");
    while (!scanner.hasNextInt()) scanner.next();
    size = scanner.nextInt();
    int[] array = new int[size];
    for (int i = 0; i < size; i++) {
      System.out.println("Enter number");
      array[i] = scanner.nextInt();
    }
    scanner.close();
    List<Integer> validNumbers = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      if (array[i] % 3 == 0) {
        validNumbers.add(array[i]);
      }
    }
    if (validNumbers.isEmpty()) {
      System.out.println("There are no array elements that are multiples of 3");
    } else {
      System.out.print("Array elements that are multiples of 3 are: ");
      for (int i = 0; i < validNumbers.size(); i++) {
        System.out.print(validNumbers.get(i) + " ");
      }
    }
  }

}
