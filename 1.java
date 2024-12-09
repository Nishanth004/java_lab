//To calculate and display the area of a rectangle.
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle");
        int length= sc.nextInt();
        int breadth=sc.nextInt();
        int area=length*breadth;
        System.out.println("Area of the rectanglre=" + area);
        sc.close();
    }
}

//To multiply two arrays and display the result

import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements in the arrays");
        int n =sc.nextInt();
        int []arr1, arr2;
        arr1=new int[100];
        arr2=new int[100];
        int[] ans =  new int[100];
        System.out.println("Enter the elements in array 1");
        for(int i=0;i<n;i++)
            arr1[i]=sc.nextInt();
        System.out.println("Enter the elements in array 2");
        for(int i=0;i<n;i++)
            arr2[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            ans[i]=arr1[i]*arr2[i];
        System.out.println("The product of the two arrays is:");
        for(int i=0;i<n;i++)
            System.out.print(ans[i]+ "\t");
        sc.close();
    }
}


//To sort the elements in ascending and descending order using the bubble sort algorithm.




import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        int[] arr = new int[100];
        System.out.println("Enter the number of elements in the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1])
 {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Sorted array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        
        sc.close();
    }
}
