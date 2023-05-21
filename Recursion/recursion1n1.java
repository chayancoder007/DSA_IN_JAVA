public class recursion1n1 {
    /* here we are going to same recursion que in reverse order 
     print num from 1 to 5 */
     public static void printNum(int n){
        if(n>5){    // here you can give another base condition if(n==6){ return;}
            return;
        }
        System.out.println(n);
        printNum(n+1);
     }
    public static void main(String args[]){
        int n = 1;
        printNum(n);

    }
}
