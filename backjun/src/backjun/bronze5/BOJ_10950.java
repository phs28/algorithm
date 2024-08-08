package backjun.bronze5;

import java.util.Scanner;

public class BOJ_10950 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int t = scan.nextInt();

    int a[] = new int[t];
    int b[] = new int[t];

    int array[] = new int[t];

    for(int i=0; i<t; i++) {
      a[i] = scan.nextInt();
      b[i] = scan.nextInt();
    }

    for(int i=0; i<t; i++) {
      array[i] = a[i] + b[i];
      System.out.println(array[i]);
    }

    scan.close();
  } 
}
