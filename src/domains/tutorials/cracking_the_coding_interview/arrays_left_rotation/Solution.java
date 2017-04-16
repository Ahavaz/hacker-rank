import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int a[] = new int[n];
    int t = 0;
    for(int i=0; i < n; i++){
      a[i] = in.nextInt();
    }

    while(k-- > 0){
      t = a[0];
      for(int i=0; i < n-1; i++){
        a[i] = a[i+1];
      }
      a[n-1] = t;
    }
    
    for(int num : a){
      System.out.print(num + " ");
    }
  }
}
