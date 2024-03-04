/*
! Pattern 1 :
! * * * * *
! * * * * *
! * * * * *
! * * * * *
! * * * * *

! Pattern 2 :
! *
! * *
! * * *
! * * * *
! * * * * *

! Pattern 3 :
! * * * * *
! * * * *
! * * *
! * *
! *

! Pattern 4 :
! 1
! 1 2
! 1 2 3
! 1 2 3 4
! 1 2 3 4 5

! Pattern 5 :
! *
! * *
! * * *
! * * * *
! * * * * *
! * * * *
! * * *
! * *
! *
 */

package Patterns;

public class patterns {
    public static void main(String[] args) {
        System.out.println();
        int n = 5;
        pattern5(n);
    }

    static void pattern1(int n) {
        System.out.println("Pattern 1 : ");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        System.out.println("Pattern 2 : ");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        System.out.println("Pattern 3 : ");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        System.out.println("Pattern 4 : ");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        System.out.println("Pattern 5 : ");
        for (int row = 0; row < 2 * n; row++) {
            int totalColumnInRow = row > n ? (2 * n - row) : row;
            for (int col = 0; col < totalColumnInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
