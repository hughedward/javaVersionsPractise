package com.hugh.java17.pJdk08Or9TryCatch;


public class DeprecatedDemo {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("");

        /**
         *  @Deprecated(since="9")
         *     public T newInstance()
         *
     *     Object:
         *       @Deprecated(since="9")
         *     protected void finalize() throws Throwable { }
         */
        Object o = aClass.newInstance();

    }
}
