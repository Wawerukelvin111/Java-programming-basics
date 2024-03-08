public class forloop {
    public static void main(String[] args) {
        System.out.println("Anotheraddition to for loops");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            //statement 1 sets a variable before the loop starts(int=0)
           //statement 2 defines the condition for the loop to run(i must be less than 5)
           //statenment 3 increases a value(i++) each time until the code block in the loop has been executed
           }
           for (int a = 0; a <= 10; a = a + 2) {
            System.out.println(a);
            //statement 1 sets the initial value
            //statement 2 defines the condition for the loop to run (a should be either less than or equal to 10)
            //statement 3 prints the values those that are incremented by 2 from the previous number
          }
          //FOR EACH

          String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String b : cars) {
        System.out.println(b);//usimg arrays mostly
}

    }
}
