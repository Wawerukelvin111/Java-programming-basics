public class datatypes {
    public static void main(String[] args){
        System.out.println("Learn about java data types");
        // Primitive data types - includes byte, short, int, long, float, double, boolean and char
        // Non-primitive data types - such as String, Arrays and Classes
        /*byte - 1 byte- stores whole numbers from -128 to 127
         * short - 2 bytes- stores hole numbers from -32,768 to 32,767
         * int - 4 bytes- stores whole numbers from - -2,147,483,648 to 2,147,483,647
         * long - 8 bytes- stores whole numbers from --9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
         * float - 4 bytes- stores ractional numbers .sufficient for storing 6-7 decimal digits
         * double - 8 bytes- sufficient for storing 6-7 decimal digits
         * boolean - 1 bit- stores true or false vaues 
         * char - 2 bytes- stores a single character/letter or ASCII values 
         * int myNum = 5;               // Integer (whole number)
         * float myFloatNum = 5.99f;    // Floating point number
         * char myLetter = 'D';         // Character
         * boolean myBool = true;       // Boolean
         * String myText = "Hello";     // String
         */
        //PRIMITIVE DATA TYPES
        //numbers
        byte mynum1=100;
        System.out.println(mynum1);
        short mynum2=5000;
        System.out.println(mynum2);
        int mynum3=100000;
        System.out.println(mynum3);
        long mynum4=1300000000;
        System.out.println(mynum4);
        //note the you should add d for double and f for float
        float mynum5=7.89f;
        System.out.println(mynum5);
        double mynum6=17.4547d;
        System.out.println(mynum6);
        //for scientific numbers say "e"
        float f1=35e3f;
        double d1=12E4d;
        System.out.println(f1);
        System.out.println(d1);
        //bools
        boolean isJavaFun=true;
        boolean JavaisHard=false;
        System.out.println(isJavaFun);
        System.out.println(JavaisHard);
        //characters single quotes
        char myGrade='A';
        System.out.println(myGrade);
        //Displaying characters using ASCII values
        char myVar1=65, myVar2=66, myVar3=67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
        //strings double quotes
        String greetings="Hi Friend";
        System.out.println(greetings);
        //Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
        // Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
        // A primitive type has always a value, while non-primitive types can be null.
        // A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
        // The size of a primitive type depends on the data type, while non-primitive types have all the same size.

    }
}
