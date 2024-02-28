public class strings {
    public static void main(String[] args) {
        //are used for storing text
        String greeting = "Hello";//creating a variable string and assigning it a value
        System.out.println(greeting);
        // A String in Java is actually an object, which contain methods that can perform certain operations on strings. For example, the length of a string can be found with the length() method:
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        //There are many string methods available, for example toUpperCase() and toLowerCase():

        String text = "Hello World";
        System.out.println(text.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(text.toLowerCase());   // Outputs "hello world"

        //The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
        String text2 = "Please locate where 'locate' occurs!";
        System.out.println(text2.indexOf("locate")); // Outputs 7
        //index starts from 0

        //STRING CONCATENATION
        // The + operator can be used between strings to combine them. This is called concatenation:
        String firstName = "Mind";
        String lastName = "Blower";
        System.out.println(firstName + " " + lastName);//that empty text does add a space between the names

        //You can also use the concat() method 
        String fname="Dolph";
        String sname="Lundgren";
        System.out.println(fname.concat(sname));

        //Java uses + operator to add numbers and concatenate strings
        //values of variables of type int are added
        int a=4;
        int b=5;
        int c=a+b;
        System.out.println(c);//output will be 9
        //values of variables of type string are concatenated
        String o="6";
        String p="9";
        String q=o+p;
        System.out.println(q);//outputs 69
        
        //adding a string and a number , the result will be a concatenation
        String t="20";
        int g=24;
        String z=t+g;
        System.out.println(z);//outputs
        
    }
}
