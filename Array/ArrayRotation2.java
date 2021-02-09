import java.util.Scanner;

public class ArrayRotation2 {

    static void rotate(int a[], int d, int n) {
        int b = check(a,d,n);
        int i,t,j=0;
        int s=n;
        while(b>=0){
        for(i=b;i<n-1;i++){
               t= a[i];
               a[i]=a[i+1];
               a[i+1]=t;
               
        }b--;n--;
    }

        for(i=0;i<s;i++)
        System.out.println(a[i]);
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
        rotate(a, d, n);
    }
}
