import java.util.Scanner;
import java.util.ArrayList;
//Not sure what this code is for, but I made it :D
public class PhotoLineups {

   public static void printAllPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
      ArrayList<String> tmpNameList;
      String removedName;

      if (nameList.size() == 0) {
         for (int i = 0; i < permList.size(); i++) {
            System.out.print(permList.get(i));
            if (i < permList.size() - 1) {
               System.out.print(", ");
            }
         }
         System.out.println();
      } else {
         for (int i = 0; i < nameList.size(); i++) {
            tmpNameList = new ArrayList<String>(nameList); 
            removedName = tmpNameList.remove(i);           
            permList.add(removedName);                     
            printAllPermutations(permList, tmpNameList);   
            permList.remove(permList.size() - 1);          
         }
      }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<String> nameList = new ArrayList<String>();
      ArrayList<String> permList = new ArrayList<String>();
      String name;

      name = scnr.next();
      while (!name.equals("-1")) {
         nameList.add(name);
         name = scnr.next();
      }

      printAllPermutations(permList, nameList);
   }
}
