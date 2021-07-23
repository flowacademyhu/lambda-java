import java.util.Arrays;

public class Array {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5 }; //new int[5];
    arr[0] = 1;
    arr[1] = 10;
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ", ");
    }
    System.out.println();

    int[][] arr2d = new int[3][3];
    arr2d[0][0] = 12;
    arr2d[1][1] = 10;
    // print2d(arr2d);
    int[][] arr2d2 = copy2D(arr2d);
    arr2d[2][2] = 5;
    print2d(arr2d2);
  }

  public static int[][] copy2D(int[][] src) {
    int[][] des = new int[src.length][src[0].length];
    for (int i = 0; i < src.length; i++) {
      for (int j = 0; j < src[i].length; j++) {
        des[i][j] = src[i][j];
      }
    }
    return des;
  }

  public static void print2d (int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println("");
    }
    System.out.println("---------------");
  }

}