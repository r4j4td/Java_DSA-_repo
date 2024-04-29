// --> enter 3 number from user & make a fuction to make an average.


// import java.util.*;

// public class function {
//     public static void main(String[] args) {
        
//         Scanner sc =new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         int average = (a + b + c) / 3;
//         System.out.println(average);
        
//     }
//     public static int average(int a, int b, int c) {
//         return (a + b + c)/3;
//     }

    
// }

// --> write a function to print the sum of all odd number from 1 to n.

// import java.util.*;
// public class function {
//     public static void printSum(int n) {
//         int sum = 0;
//         for(int i=1; i<=n; i++){
//             if(i % 2 != 0){
//                 sum = sum + i;
//             }
//         }
//         System.out.println(sum);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         printSum(n);
//     }
// }



// --> write a function which takes in 2 numbers and return the greater of those two.

// import java.util.*;
// public class fuction {
//     public static int getGreater(int a, int b) {
//         if(a > b){
//             return a;
//         } else {
//             return b;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println(getGreater(a, b));
//     }
// }


// --> write a function that calculates the greatest common divisor of 2 numbers. 

// import java.util.*;
// public class fuction {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n1 = sc.nextInt();
//         int n2 = sc.nextInt();
//         while(n1 != n2) {
//             if(n1>n2){
//                 n1 = n1 - n2;
//             } else {
//                 n2 = n2 - n1;
//             }
//         }
//         System.out.println("GCD is : "+ n2);
//     }
//     public static int findGCD(int n1, int n2) {
//         return n1;
//     }
// }

// --> fibonacci number.

import java.util.*;
public class fuction {g
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0 , b = 1;
        System.out.println(a+" ");
        if(n > 1) {
            // find nth term
            for(int i=2; i<=n; i++) {
                System.out.println(b+" ");
                // the concept below is called swapping
                int temp = b;
                b = a + b;
                a = temp;
            }
            System.out.println();
        }
    } public static int fibonacci(int a, int b) {
        return a ;
        
    }
}