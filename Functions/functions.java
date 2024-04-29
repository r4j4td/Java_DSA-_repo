// import java.util.*;

// public class functions {
//     public static void printMyName(String name) {
//         System.out.println(name);
//         return;
        
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();

//         printMyName(name);
//     }
    
// }


// import java.util.*;
// public class functions {
//     public static int calculations(int a, int b) {
//         int sum = a + b;
//         return sum;  
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = calculations(a, b);
//         System.out.println(sum);
//     }
// }


// import java.util.*;
// public class functions {
//     public static int calculations(int a, int b) {
//         // int sum = a * b;
//         return a * b;
        
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         // int sum = calculations(a, b);
//         System.out.println("product of two number is : "+calculations(a, b));
//     }
// }

import java.util.*;
public class functions{
    public static void printFactorial(int n) {
        // loop
        if(n < 0){
            System.out.println("invalid number");
            return;
        }
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);
    }
}