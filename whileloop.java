public class whileloop {
    public static void main(String[] args) {
        System.out.println("While loop");
        //Loops can execute a block of code as long as a secified condition is met
        //The while loop loops through a block of code as long as the specified condition is met
        int i = 0;
        while (i < 5) {
          System.out.println(i);
          i++;//this increment variable ensures that the programm does not run into infinite loop
          
          
          //the Do while loop
          int i2 = 0;
            do {
            System.out.println(i2);
            i2++;
            }
            while (i2 < 5);
        }
    } 

}
