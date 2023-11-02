// Java program to implement Playfair Cipher
import java.util.*;
 
public class PlayFairCipher
{
  static int SIZE = 30;
  private char   matrix_arr[][] = new char[5][5];
  // Function to convert the string to lowercase
  static void toLowerCase(char plain[], int ps)
  {
    int i;
    for (i = 0; i < ps; i++) {
      if (plain[i] > 64 && plain[i] < 91)
        plain[i] += 32;
    }
  }
 
  // Function to remove all spaces in a string
  static int removeSpaces(char[] plain, int ps)
  {
    int i, count = 0;
    for (i = 0; i < ps; i++)
      if (plain[i] != '\u0000')
        plain[count++] = plain[i];
 
    return count;
  }
 
  // Function to generate the 5x5 key square
  static void generateKeyTable(char key[], int ks, char keyT[][])
  {
    int i, j, k, flag = 0;
 
    // a 26 character hashmap
    // to store count of the alphabet
    int dicty[] = new int[26];
    for (i = 0; i < ks; i++) {
      if (key[i] != 'j')
        dicty[key[i] - 97] = 2;
    }
 
    dicty['j' - 97] = 1;
 
    i = 0;
    j = 0;
 
    for (k = 0; k < ks; k++) {
      if (dicty[key[k] - 97] == 2) {
        dicty[key[k] - 97] -= 1;
        keyT[i][j] = key[k];
        j++;
        if (j == 5) {
          i++;
          j = 0;
        }
      }
    }
 
    for (k = 0; k < 26; k++) {
      if (dicty[k] == 0) {
        keyT[i][j] = (char)(k + 97);
        j++;
        if (j == 5) {
          i++;
          j = 0;
        }
      }
    }
  }
 
  // Function to search for the characters of a digraph
  // in the key square and return their position
  static void search(char keyT[][], char a, char b, int arr[])
  {
    int i, j;
 
    if (a == 'j')
      a = 'i';
    else if (b == 'j')
      b = 'i';
 
    for (i = 0; i < 5; i++) {
 
      for (j = 0; j < 5; j++) {
 
        if (keyT[i][j] == a) {
          arr[0] = i;
          arr[1] = j;
        }
        else if (keyT[i][j] == b) {
          arr[2] = i;
          arr[3] = j;
        }
      }
    }
  }
 
  // Function to find the modulus with 5
  static int mod5(int a) { return (a % 5); }
 
  // Function to make the plain text length to be even
  static int prepare(char str[], int ptrs)
  {
    if (ptrs % 2 != 0) {
      str[ptrs++] = 'z';
      str[ptrs] = '\0';
    }
    return ptrs;
  }
 
  // Function for performing the encryption
  static void encrypt(char str[], char keyT[][], int ps)
  {
    int i;
    int[] a =new int[4];
 
    for (i = 0; i < ps; i += 2) {
 
      search(keyT, str[i], str[i + 1], a);
 
      if (a[0] == a[2]) {
        str[i] = keyT[a[0]][mod5(a[1] + 1)];
        str[i + 1] = keyT[a[0]][mod5(a[3] + 1)];
      }
      else if (a[1] == a[3]) {
        str[i] = keyT[mod5(a[0] + 1)][a[1]];
        str[i + 1] = keyT[mod5(a[2] + 1)][a[1]];
      }
      else {
        str[i] = keyT[a[0]][a[3]];
        str[i + 1] = keyT[a[2]][a[1]];
      }
    }
  }
 
  // Function to encrypt using Playfair Cipher
  static void encryptByPlayfairCipher(char str[], char key[])
  {
    int ps;
    int ks;
    char[][] keyT = new char[5][5];
 
    // Key
    ks = key.length;
    ks = removeSpaces(key, ks);
    toLowerCase(key, ks);
 
    // Plaintext
    ps = str.length;
    toLowerCase(str, ps);
    ps = removeSpaces(str, ps);
 
    ps = prepare(str, ps);
 
    generateKeyTable(key, ks, keyT);
 
    encrypt(str, keyT, ps);
  }
 
  static void strcpy(char[] arr, String s) {
    for(int i = 0;i < s.length();i++){
      arr[i] = s.charAt(i);
    }
  }
 
  private String format(String old_text)
  {
      int i = 0;
      int len = 0;
      String text = new String();
      len = old_text.length();
      for (int tmp = 0; tmp < len; tmp++)
      {
          if (old_text.charAt(tmp) == 'j')
          {
              text = text + 'i';
          }
          else
              text = text + old_text.charAt(tmp);
      }
      len = text.length();
      for (i = 0; i < len; i = i + 2)
      {
          if (text.charAt(i + 1) == text.charAt(i))
          {
              text = text.substring(0, i + 1) + 'x' + text.substring(i + 1);
          }
      }
      return text;
  }
  
  public int[] GetDiminsions(char letter)
  {
      int[] key = new int[2];
      if (letter == 'j')
          letter = 'i';
      for (int i = 0; i < 5; i++)
      {
          for (int j = 0; j < 5; j++)
          {
              if (matrix_arr[i][j] == letter)
              {
                  key[0] = i;
                  key[1] = j;
                  break;
              }
          }
      }
      return key;
  }
  
  private String[] Divid2Pairs(String new_string)
  {
      String Original = format(new_string);
      int size = Original.length();
      if (size % 2 != 0)
      {
          size++;
          Original = Original + 'x';
      }
      String x[] = new String[size / 2];
      int counter = 0;
      for (int i = 0; i < size / 2; i++)
      {
          x[i] = Original.substring(counter, counter + 2);
          counter = counter + 2;
      }
      return x;
  }
  
  public String decryptMessage(String Code)
  {
      String Original = new String();
      String src_arr[] = Divid2Pairs(Code);
      char one;
      char two;
      int part1[] = new int[2];
      int part2[] = new int[2];
      for (int i = 0; i < src_arr.length; i++)
      {
          one = src_arr[i].charAt(0);
          two = src_arr[i].charAt(1);
          part1 = GetDiminsions(one);
          part2 = GetDiminsions(two);
          if (part1[0] == part2[0])
          {
              if (part1[1] > 0)
                  part1[1]--;
              else
                  part1[1] = 4;
              if (part2[1] > 0)
                  part2[1]--;
              else
                  part2[1] = 4;
          }
          else if (part1[1] == part2[1])
          {
              if (part1[0] > 0)
                  part1[0]--;
              else
                  part1[0] = 4;
              if (part2[0] > 0)
                  part2[0]--;
              else
                  part2[0] = 4;
          }
          else
          {
              int temp = part1[1];
              part1[1] = part2[1];
              part2[1] = temp;
          }
          Original = Original + matrix_arr[part1[0]][part1[1]]
                  + matrix_arr[part2[0]][part2[1]];
      }
      return Original;
  }
  
  // Driver code
  public static void main(String[] args) {
    char str[] = new char[SIZE];
    char key[] = new char[SIZE];
 
    // Key to be encrypted
 
    strcpy(key, "Monarchy");
    System.out.println("Key text: " + String.valueOf(key));
 
    // Plaintext to be encrypted
    strcpy(str, "instrument");
    System.out.println("Plain text: " + String.valueOf(str));
 
    // encrypt using Playfair Cipher
    encryptByPlayfairCipher(str, key);
 
    System.out.println("Cipher text: " + String.valueOf(str));
  }
 
}