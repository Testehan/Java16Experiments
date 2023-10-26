package com.testehan.instanceOfPatternMatching;

public class App 
{
    public static void main( String[] args )
    {
        Object obj = "abc";
        Object objNumber = 4;

        // before...ugly casting needed
        if (obj instanceof String) {
            String s = (String) obj;    // grr...
            System.out.println(s);
        }

        // after - improved..
        /*
            The instanceof operator
            matches the target obj to the type pattern as follows: If obj is an instance of String, then it is cast
            to String and the value is assigned to the variable s.
         */
        if (obj instanceof String s) {
            // Let pattern matching do the work!
            System.out.println(s);
        }

        if (obj instanceof String s && s.length()<100) {
            // extra condition if obj is string, and that string has less than 100 chars
            System.out.println(s);
        }

        if (objNumber instanceof String s) {
            // nothing will be printed because objNumber is not a String!
            System.out.println(s);
        }


    }
}
