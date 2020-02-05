/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @totopotato 25-12S18027 Christopher Alfred Hutabarat
 * @letaresaragih 25-12S18064 Letare Aiglien Saragih
 */
import java.util.ArrayList;
public class Main {
    /* program entry point */
    public static void main(String[] _args) {
      System.out.println("Hello, world !");
          
      
//declaring and manipulating primitive variables
int gear = 1;
boolean result = true;
char capitalC = 'C';
byte b = 100;

System.out.println(gear + ", " + result + ", " + capitalC + ", " +b);

gear++;
result = !result;
capitalC +=4;

System.out.println(gear + ", " + result + ", " + capitalC + "," + b);

// 26 in hexadecimal and binary
int hexVal = 0x1a;
int binVal = 0b11010;

System.out.println(hexVal + "," + binVal);


//intantiating and manipulating objects
String name = "Wiro Sableng";
Short gearObject = 1;
Boolean resultObj = true;

System.out.println(name + "," + gearObject + "," + resultObj);

name = name.toUpperCase();
gearObject++;
resultObj = (result == false) || !resultObj;

System.out.println(name + "," + gearObject + "," + resultObj);


// array, collections, and loop
int[][] numbers = new int[10][10];
   
for (int i = 0; i < numbers.length; ++i) {
    for (int j = 0; j < numbers[i].length; ++j) {
        numbers[i][j] = i + j;
    }
}

for (int i = 0; i < numbers.length; ++i) {
    for (int j = 0; j < numbers[i].length; ++j) {
        System.out.print(numbers[i][j] + " ");
    }
    System.out.println();
}
    
//challenge 

int counter = 19; //variable ini berguna sebagai penghitung jumlah looping

ArrayList<ArrayList<Integer>> number = new ArrayList<>(counter);
    
    for (int i = 0; i < counter; ++i){
        number.add(new ArrayList());
    }
    
    for (int j = 0; j < counter;j++){
        System.out.println(number.get(counter));
    }
    
}
}

