package book.chap05.exam02;

import java.util.Scanner;

public class QuickSort {
  static void swap(int[] a, int idx1, int idx2) {
    int t = a[idx1];
    a[idx1] = a[idx2];
    a[idx2] = t;
  }

  static void quickSort(int[] a, int left, int right) {
    int pl = left;
    int pr = right;
    int x = a[(pl+pr) / 2];

    do{
      while(a[pl] < x) {
        pl++;
      } 
    }while(pl <= pr);

    if(left < pr) {
      quickSort(a, left, pr);
    }
    if(pl < right) {
      quickSort(a, pl, right);
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("퀵 정렬");
    System.out.print("요솟수: ");
    int nx = scan.nextInt();
    int[] x = new int[nx]; 

    for(int i=0; i<nx; i++) {
      System.out.print("x[" +i+ "} : ");
      x[i] = scan.nextInt();
    }

    quickSort(x, 0, nx -1);

    System.out.println("오름차순 정렬");
    for(int i=0; i<nx; i++) {
      System.out.println("x[" + i + "] = " + x[i]);
    }

    scan.close();
  }
}
