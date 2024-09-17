package backjun.bronze5;

import java.util.Scanner;

public class BOJ_11021 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int t = scan.nextInt();

    int[] arrayA = new int[t];
    int[] arrayB = new int[t];

    int[] total = new int[t];

    for(int i=0; i<t; i++) {
      arrayA[i] = scan.nextInt();
      arrayB[i] = scan.nextInt();
    }

    for(int i=0; i<t; i++) {
      total[i] = arrayA[i] + arrayB[i];
    }

    for(int i=1; i<=t; i++) {
      System.out.println("Case #" + i + " " + total[i-1]);
    }

    scan.close();
  }

}
