public class operators {
    public static void main(String[] args) {
        System.out.println("Learn about the operators");
        //Java divides the operators into the following groups:
        // Arithmetic operators
        // Assignment operators
        // Comparison operators
        // Logical operators
        // Bitwise operators
        int x = 5;
        x -= 3;
        System.out.println(x);//this operation results to 2
        int y = 5;
        y += 3;
        System.out.println(y);//This adds 5 to 3 resulting to 8
        int z = 5;
        z *= 3;
        System.out.println(z);//This results to 15
        int a = 5;
        a /= 3;
        System.out.println(a);//this outputs the value 1.66667
        int b = 5;
        b &= 3;
        System.out.println(b);//This results to one
        int c = 5;
        c |= 3;
        System.out.println(c);//outputs 7
        int d = 5;
        d ^= 3;
        System.out.println(d);//outputs 6
        int e = 5;
        e >>= 3;
        System.out.println(e);//output is 0
        int f = 5;
        f <<= 3;
        System.out.println(f);//outputs 40
        //Java comparison operators
        //==equal to,!=not equal to,> greater than
        //<less than,>= grater than or equal to
        //>=less than or equal to

        //Java Logical operators
        //&& Logical AND returns true if both statemets are true
        int g = 5;
        System.out.println(g > 3 && g < 10); // returns true because 5 is greater than 3 AND 5 is less than 10
        //||Logical OR returns true if one of the statements is true
        int h = 5;
        System.out.println(h > 3 || h < 4); // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)
        //! Logical NOT reverses the results, returns false if the result is true
        int i = 5;
        System.out.println(!(i > 3 && i < 10)); // returns false because ! (not) is used to reverse the result


    }
}
