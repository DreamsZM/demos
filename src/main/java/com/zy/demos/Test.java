package com.zy.demos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("string1");
        strings.add("string1");
        strings.add("string1");

        String string = getResult(strings);
        System.out.println(string);

    }

    public static String getResult(List<String> stringList){
        if (stringList == null){
            return null;
        }

        StringBuilder stringBuilder = new StringBuilder();
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()){
            stringBuilder.append(iterator.next()).append(" ");
        }

        String result = stringBuilder.substring(0, stringBuilder.length()-1).toString();

        return result;

    }
}
