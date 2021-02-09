import java.util.Scanner;


/**
 * ArrayRotation1
 */
public class ArrayRotation1 {
    
    static void left(int a[], int n, int d) {
        int arr[] = new int[n];
        int i,j,s=n;
        int b = check(a, d, n);
      for (j=0,i = b+1; i < n; j++,i++) {
            arr[j] = a[i];


        }
       for(i=n-1;i>=j;i--,b--){
           arr[i]=a[b];
       }
        for (i = 0; i < s; i++) {
            System.out.println(arr[i]);
        }
    }

    static int check(int a[], int d, int n) {
        int i;
        for (i = 0; i < n; i++) {
            if (a[i] == d) {
                break;
            }
        }

        return i;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int i;
        int n = 5;
        System.out.println("Enter the element");
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to rotate");
        int d = sc.nextInt();
        left(a, n, d);

        
    }
}