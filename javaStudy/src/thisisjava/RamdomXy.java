package thisisjava;

import java.util.Scanner;

public class RamdomXy {
   int k;
   int n;

   public void play() {
      // TODO Auto-generated method stub
      Scanner in = new Scanner(System.in);
      System.out.println("K를 입력 해라 ");
      k = in.nextInt();
      System.out.println("n을 입력 해라");
      n = in.nextInt();

      int yval[] = new int[n + 1]; // n자리 수가 저장될 y값배열
      int xval[] = new int[n + 1]; // n자리 수가 저장될 x값배열

      for (int i = 0; i < yval.length; i++) { // y값을 랜덤으로 출력
         yval[i] = (int) (Math.random() * 300 + 1); // 1~300까지
         for (int j = 1; j < i; j++) {
            if (yval[j] == yval[i]) {
               i--;
               break;
            }
         }
      }
      for (int i = 0; i < xval.length; i++) { // x값을 랜덤으로 출력
         xval[i] = (int) (Math.random() * 300 + 1); // 1~300까지
         for (int j = 1; j < i; j++) {
            if (xval[j] == xval[i]) {
               i--;
               break;
            }
         }
      }
      for (int i = 0; i < yval.length - 1; i++) {

         System.out.println(" y : " + yval[i] + "   " + "x : " + xval[i]);
      }

   }
}
