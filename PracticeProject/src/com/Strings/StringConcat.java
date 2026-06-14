package com.Strings;

public class StringConcat {

    public static void main(String[] args) {
        String s="P   A   H   N\n" +
                "A P L S I I G\n" +
                "Y   I   R";

        System.out.println(s);


        System.out.println(convert(s,3));
    }

    public static  String convert(String s, int numRows) {

        String[] stringArray= s.split("\n");
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<numRows;i++)
        {
            sb.append(stringArray[i].replaceAll(" ",""));
        }

        return sb.toString();
    }
}
