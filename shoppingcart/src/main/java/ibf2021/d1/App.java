package ibf2021.d1;

import java.io.Console;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main( String[] args )
    {
        
HashSet<String> cart = new HashSet<String>();

List <String> shoppingCart = new ArrayList<>();

String input = "";

    
        Console cons = System.console();


//Lecturer answer

/*
Scanner scan = new Scanner(System.in).useDelimiter(",");


System.out.println("Please key in something");

String com = (scan.next()).trim().toLowerCase();
System.out.println("end type something");


System.out.println("You have typed >>"+com+"<<");

// While not List & not add
while(!com.equals("list") && !com.equals("add")){
        System.out.println("Please only use list or add");
        System.out.println(com);
        com = scan.next();
}
if(com.equals("list") && cart.size()>1){
    System.out.println("List is "+ cart);
}else if(com.equals("add")&& scan.hasNext()){

    com = scan.next();
    

}else{
    System.out.println("Cart is empty");
}

*/

/*
//DELIM test
String myInput = null;
Scanner myscan = new Scanner(System.in).useDelimiter(",");
System.out.println("Enter your input: ");
int i=1;

do{
myInput = myscan.next();
System.out.println(i+" is "+ myInput);
i++;
}while(myscan.hasNext()==true);
*/


/*
        switch (input.trim().toLowerCase()){
            case "code":
                System.out.println("Cool!");
                break;
            default:
                System.out.printf("What is this %s hobby of yours?" , input);          
*/

//MY ANS

        while(input.length() <= 0){
            input = cons.readLine("Welcome to your shopping cart: ");
            input = input.trim();
        }

        System.out.println("Input length is " +input.length());

        if(input.contains("add")&&input.length()>3){
            System.out.println("Added item length is " + input.substring(0,input.length()));
        }

        if (input.equals("list")){
            if(cart.size() == 0){
                System.out.println("Your cart is empty.");
            }else if (cart.contains(input)){
                System.out.println("You have " + " in your cart");
            }
        }   


    }


}