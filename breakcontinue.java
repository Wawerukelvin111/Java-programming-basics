public class breakcontinue {
    public static void main(String[] args) {
        System.out.println("brief introduction into break continue");
        //Break
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              break;
            }
            System.out.println(i);
          //This statement tells the program to stop once the i is equal to 4
                   
         } 
         
         for (int a = 0; a < 10; a++) {
            if (a == 4) {
              continue;
            }
            System.out.println(a);
          //this statement tells the program to skip the number 4 
        }
        //Break and continue in while loop
        //Break example
        int b = 0;
        while (b < 10) {
        System.out.println(b);
        b++;
        if (b == 4) {
            break;
        }//this breaks the loop once i=4
}


    }

}
