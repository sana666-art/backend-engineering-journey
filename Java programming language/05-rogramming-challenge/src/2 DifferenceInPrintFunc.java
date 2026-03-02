
class Subscribe {
    public static void main(String[] args) {

//        In Java, printing is mainly done using:
//
//        System.out.print()
//        System.out.println()
//        System.out.printf()
//        System.out.format()
//
//        All of them belong to: java.io.PrintStream

//        1. Print Funtion
//        The cursor stays on the same line.
        System.out.print("Hello ");
        System.out.print("World");

//        2. println()
//        After printing, it moves to next line.
        System.out.println("Hello");
        System.out.println("World");

//        3. printf()
//        Formatted printing (like C language)
//        Allows placeholders like:
//
//        Format	Meaning
//        %s	String
//        %d	Integer
//        %f	Float/Double
//        %c	Character
//        %b	Boolean
//        %.2f	2 decimal places

        String name = "John";
        int age = 25;
        double salary = 50000.5678;

        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Salary: %.2f%n", salary);

//        4. format()
//        Same as printf()
//        There is literally no difference in behavior.
//        Internally, printf() calls format().

        System.out.format("Hello %s%n", "World");

    }


}