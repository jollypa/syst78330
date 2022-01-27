import java.util.Scanner;

package stringrev;

/**
 *This class +++ Sample class  +++
 * @author $Parul Jolly
 */
public class StringREv {
 public static void main(String[] args) {
Scanner k = new Scanner(System.in);
System.out.print("Enter a word to reverse: ");
String word = k.nextLine();
//String reverse = "";
char[] reverse=word.toCharArray();// store string into char array
//iterate through in reverse manner
for(int i = reverse.length-1; i >= 0; i--){
System.out.print(reverse[i]);
}

System.out.println(" ");
        }

}
