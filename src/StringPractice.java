import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String newString = "football";
    // Find the length of the string
    int length = newString.length();
    System.out.println(length);
    // Concatenate (add) two strings together and reassign the result
    String comboString = newString + " season";
    // Find the value of the character at index 3
    char indexChar = comboString.charAt(3);
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    boolean containsString = comboString.contains("basketball");
    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < comboString.length(); i++) {
        System.out.println(comboString.charAt(i));
    }
    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> stringList = new ArrayList<>();
    // Add multiple strings to the List (OK to do one-by-one)
    stringList.add("Seahawks");
    stringList.add("Mariners");
    stringList.add("Sonics");
    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String joined = String.join(", ", stringList);
    System.out.println(joined);
    // Check whether two strings are equal
    boolean theSame = newString.equals(comboString);
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
