package practicalten;

import java.util.ArrayList;

/**
 * The InvestigateExceptions class will throw different exceptions.
 * This example is derived from a Java source code snippet found at:
 * http://pages.cs.wisc.edu/~hasti/cs368/JavaTutorial/NOTES/Exceptions.html
 */

public class InvestigateExceptions {

  /**
   * Perform different computations that can throw an exception.
   */

  static void throwsExceptions(int numericalValue, ArrayList<Integer> chosenList, String text) {
    int divisionResult = 1 / numericalValue;
    int len = chosenList.size() + 1;
    char firstCharacter;

    try {
      firstCharacter = text.charAt(0);
      if (numericalValue == 10) {
        divisionResult = chosenList.get(3);
      }
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("Array error");
    } catch (ArithmeticException ex) {
      System.out.println("Arithmetic error");
    } catch (NullPointerException ex) {
      System.out.println("Null pointer");
    } finally {
      System.out.println("In the finally clause");
    }
    System.out.println("After the try block");
  }

  /**
   * Call a method that can performs computations that can throw an exception.
   * Please comment out one line at a time and then build and run the program.
   * You should then observe the output and write about the program's behavior.
   */
  public static void main(String[] args) {
    ArrayList<Integer> arrayInputs = new ArrayList<Integer>();
    arrayInputs.add(0);
    arrayInputs.add(1);
    arrayInputs.add(2);
    System.out.println("I called throwsExceptions and this is what happened!");
    // throwsExceptions(0, arrayInputs, "hi");
    // throwsExceptions(10, arrayInputs, "");
    // throwsExceptions(10, arrayInputs, "bye");
    // throwsExceptions(10, arrayInputs, null);
  }

}
