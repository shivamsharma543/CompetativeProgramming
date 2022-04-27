package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

    public static void main(String args[]) {
       String str2 = "my.name.shivam.sharma.test.10";
       String str1 = "my.name.shivam.20";
       String str3 = "my.name.shivam";
       List<String> ls = new ArrayList();
       ls.add(str1);
       ls.add(str2);
       System.out.println(ls.stream().map(str ->str.substring(0,str.lastIndexOf('.')))
                       .filter(str->str.equalsIgnoreCase("my.name.shivam"))
                       .collect(Collectors.toList()));

    }
}
