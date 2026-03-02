package com.backendDevelopment.B$OperatorsIfElseAndNumberSystem;

public class OrderOfOperation {
    public static void main(String[] args) {
//        1. ()           → Parentheses
//        2. ++  --  !    → Unary operators
//        3. *  /  %      → Multiplication / Division / Modulus
//        4. +  -         → Addition / Subtraction
//        5. <<  >>  >>>  → Shift
//        6. <  >  <= >=  → Relational
//        7. ==  !=       → Equality
//        8. &            → Bitwise AND
//        9. ^            → Bitwise XOR
//        10. |           → Bitwise OR
//        11. &&          → Logical AND
//        12. ||          → Logical OR
//        13. ?:          → Ternary
//        14. =  += -=    → Assignment


        System.out.println(8-3*3);

        System.out.println(9/(3/3 + 2));

        int result = 5 + 3 * 2;
        System.out.println(result);

        int a = 2;
        int b = 3;
        int c = a + b * a++ - --b;
        System.out.println(c);

        int x = 5;
        int y = x++ + ++x;
        System.out.println(y);

        boolean res = true || false && false;
        System.out.println(res);

    }
}
