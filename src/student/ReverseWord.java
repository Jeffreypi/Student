
package student;
import java.util.Scanner;
/*author:Jeffrey*/
// added comment for fetch+merge
// added comment for pull

public class ReverseWord {
    public static void main(String[] args){
    char[] myArray = new char[7];
    myArray[0]='s';
    myArray[1]='t';
    myArray[2]='u';
    myArray[3]='d';
    myArray[4]='e';
    myArray[5]='n';
    myArray[6]='t';
   for (int i =0;i<myArray.length;i++){
       System.out.println(myArray[i]);
   }
    
   
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word");
    String word=sc.nextLine();
    char[] myLetters = new char[word.length()];
    
    for (int i=0;i<myLetters.length;i++){
        myLetters[i] = word.charAt(i);
        System.out.println(myLetters[i]);
    }
    for (int i=myLetters.length-1 ;i>=0;i--){
        System.out.println(myLetters[i]);
    }
    }
    
}

