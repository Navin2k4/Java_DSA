package Recursion;

public class BasicUnderstandingPrg {
    public static void main(String[] args) {
        int n = 1;
        printnumber(n);
    }

    static void printnumber(int n) {
        System.out.println(n);

        // ! Base conditon : The condition where the recursion will stop making new calls
        // ! Without the base condition it will result in the stack overflow error since
        // ! the memory of the computer stack exceed at a particular point
        // ? But why :
        // * It is because every function in the stack is waiting fot the execution of
        // * the function to be ended which will clear the function from the memory
        // * but without the base conditon the loop will run infinitely that makes the
        // * stack to exceed the allocated mamory of the stack
        if (n == 5) {
            return;
        }

        // ! Recursive Call
        // ! If you are calling a function again and again, you can treat it as a
        // seperate call in the stack
        // ! And hence it will make the memory seperately in the stack
        printnumber(n + 1);

    }
}
