import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 25-12s18027 Christoper Hutabarat
 * @author 25-12s18064 Letare Saragih
 */

public class Main {
     /* class-level attributes */
 private static List<String> nims = new ArrayList<>();
 private static List<String> names = new ArrayList<>();

 /* program entry point */
 public static void main(String[] _args) {
 Scanner in = new Scanner(System.in);
 String s;
 boolean quit = false;
 
 do {
     s = in.nextLine();
 
    String[] tokens = s.split(" ");
    String output = "";
        switch (tokens[0]) {
      case "add":
           add(tokens[1], tokens[2]);
            break;
      case "find":
           output = find(tokens[1]);
           break;
      case "count":
           output = "" + count();
           break;
      case "reset":
           reset();
           break;
      case "exit":
           quit = true;
        }
 
 if (output.length() > 0) {
 System.out.println(output);
 }
 } while (!quit);
 }

 public static void add(String _nim, String _name) {
     int check = 0;
     
     for(int i = 0; i<nims.size(); i++){
         if(_nim.equals(nims.get(i))){
             check++;
         }
     }
            if(check == 0){
                nims.add(_nim);
                names.add(_name);
                }
             }

 
 public static String find(String _nim) {
    int index = nims.indexOf(_nim);
    
    if (index >= 0) {
       return nims.get(index) + " " + names.get(index);
    }
    return "";
 }

 public static int count() {
     if(nims.size() > 0){
         return nims.size();
     }
     else{
         return 0;
     }
 }
 
 public static void reset() {
     nims.clear();
     names.clear();
 }
}


