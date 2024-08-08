package backjun.bronze5;

import java.util.Scanner;

public class BOJ_10871 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int x = scan.nextInt();

    int array[] = new int[n]; 

    for(int i=0; i<n; i++) {
      array[i] = scan.nextInt();
      if(x > array[i]) {
        System.out.print(array[i] + " ");
      }
    }

    scan.close();
  }
}
