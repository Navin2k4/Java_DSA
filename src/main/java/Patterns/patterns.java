package Patterns;

public class patterns {
    public static void main(String[] args) {
        System.out.println();
        int n = 5;
        pattern8(n);
    }
    /*
     ! Pattern 1 :
     ! * * * * *
     ! * * * * *
     ! * * * * *
     ! * * * * *
     ! * * * * *
     */
    static void pattern1(int n) {
        System.out.println("Pattern 1 : ");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    ! Pattern 2 :
    ! *
    ! * *
    ! * * *
    ! * * * *
    ! * * * * *
     */
    static void pattern2(int n) {
        System.out.println("Pattern 2 : ");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /* 
    ! Pattern 3 :
    ! * * * * *
    ! * * * *
    ! * * *
    ! * *
    ! *
*/
    static void pattern3(int n) {
        System.out.println("Pattern 3 : ");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    ! Pattern 4 :
    ! 1
    ! 1 2
    ! 1 2 3
    ! 1 2 3 4
    ! 1 2 3 4 5
     */
    static void pattern4(int n) {
        System.out.println("Pattern 4 : ");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    /*
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
    
    /*
    ! Pattern 6 :
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
    static void pattern6(int n) {
        System.out.println("Pattern 6 : ");
        for (int row = 0; row < 2 * n; row++) {
            int totalColumnInRow = row > n ? (2 * n - row) : row;
            int numberOfSpaces = n-totalColumnInRow;
            for (int i = 0; i < numberOfSpaces; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColumnInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    ! Pattern 7 :
    ! 1
    ! 2 1 2
    ! 3 2 1 2 3
    ! 4 3 2 1 2 3 4
    ! 5 4 3 2 1 2 3 4 5
     */    
    static void pattern7(int n){
        System.out.println("Pattern 7 : ");

        for (int row = 1; row <=n ; row++) {
            for (int space = 0; space < n-row ; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    /*
    ! Pattern 8 :
    ! 1
    ! 2 1 2
    ! 3 2 1 2 3
    ! 4 3 2 1 2 3 4
    ! 5 4 3 2 1 2 3 4 5
    ! 4 3 2 1 2 3 4
    ! 3 2 1 2 3
    ! 2 1 2
    ! 1
     */
    static void pattern8(int n) {
        System.out.println("Pattern 8 : ");
        for (int row = 1; row <= 2 * n; row++) {
            int totalColumnInRow = row > n ? (2 * n - row) : row;
            int numberOfSpaces = n - totalColumnInRow;
            for (int i = 1; i <= numberOfSpaces; i++) {
                System.out.print("  ");
            }
            for (int col = totalColumnInRow; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= totalColumnInRow; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}
