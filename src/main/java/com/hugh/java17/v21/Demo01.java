package com.hugh.java17.v21;

import java.lang.StringTemplate.*;
import java.util.Iterator;

public class Demo01 {
    public static void main(String[] args) {
        var INTER = StringTemplate.Processor.of((StringTemplate st) -> {
            StringBuilder sb = new StringBuilder();
            Iterator<String> fragIter = st.fragments().iterator();
            for (Object value : st.values()) {
                sb.append(fragIter.next());
                sb.append(value);
            }
            sb.append(fragIter.next());
            return sb.toString();
        });

        int x = 10, y = 20;
        String s = INTER."\{x} plus \{y} equals \{x + y}";

    }
}
