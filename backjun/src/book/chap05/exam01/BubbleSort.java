package book.chap05.exam01;

import java.util.Scanner;

public class BubbleSort {

  static void swap(int[] a, int idx1, int idx2) {
    int t = a[idx1];
    a[idx1] = a[idx2];
    a[idx2] = t;
  }

  //방법 1
  // static void bubbleSort(int[] a, int n) {
  //   for(int i=0; i<n-1; i++) {
  //     for(int j=n-1; j>i; j--) {
  //       if(a[j-1] > a[j]) {
  //         swap(a, j-1, j);
  //       }
  //     }
  //   }
  // }

  //방법 2
  // static void bubbleSort(int[] a, int n) {
  //   for(int i=0; i<n-1; i++) {
  //     int exchg = 0;
  //     for(int j=n-1; j>i; j--) {
  //       if(a[j-1] > a[j]) {
  //         swap(a, j-1, j);
  //         exchg++;
  //       }
  //       if(exchg == 0) {
  //         break;
  //       }
  //     }
  //   }
  // }

  //방법 3
  static void bubbleSort(int[] a, int n) {
    int k = 0;
    while (k < n - 1) {
      int last = n - 1;
      for(int j=n-1; j>k; j--) {
        
      }
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("(버블 정렬(버전 1)");
    System.out.print("요솟수: ");
    int nx = scan.nextInt();
    int[] x = new int[nx];

    for(int i=0; i<nx; i++) {
      System.out.print("x[" +x+ "]: ");
      x[i] = scan.nextInt();
    }

    bubbleSort(x, nx);

    System.out.println("오름차순으로 정렬했습니다.");
    for(int i=0; i<nx; i++) {
      System.out.println("x[" +i+ "]: " + x[i]);
    }

    scan. close();
  }

}
