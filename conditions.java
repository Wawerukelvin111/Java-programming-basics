public class conditions {
    public static void main(String[] args) {
        System.out.println("Conditions statements");
        //Java has the following conditional statements:

        // Use if to specify a block of code to be executed, if a specified condition is true
        // Use else to specify a block of code to be executed, if the same condition is false
        // Use else if to specify a new condition to test, if the first condition is false
        // Use switch to specify many alternative blocks of code to be executed
        
        if (20 > 18) {
            System.out.println("20 is greater than 18");
          }
        int x = 20;
        int y = 18;
        if (x > y) {
        System.out.println("x is greater than y");
        }

        //if else statement

        int time = 20;
        if (time < 18) {
        System.out.println("Good day.");
        } else {
        System.out.println("Good evening.");
        }
        // Outputs "Good evening."


    }
}
