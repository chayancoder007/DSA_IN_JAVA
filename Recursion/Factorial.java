public class Factorial {
    public static void printFac(int n, int product){
        if(n==1 || n==0){
         System.out.println(product);
         return;   
        }
        product *= n;
        printFac(n-1, product);
        System.out.print("");
        
    }
    public static void main(String args[]){
        printFac(5 , 1);
    }
    
}
