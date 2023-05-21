  /*In this clas we are going to learn recursion and in further classes we are going to learn problems on recursion */

/* we are going to print numbers from 5 to 1 by recursion method  */

public class recursion1{

    // base class or funtion with base condition for recursion 

    public static void printNum(int n){
        if(n==0){
            return;       // this is our base condition  
        }
        System.out.println(n);   // recursion statement
        printNum(n-1);
    }
    public static void main(String args[]){
        // in this function w are going to call our base class funtion for recursion
        int n = 5; 
        // function call for recursion
        printNum(n);

    }

}