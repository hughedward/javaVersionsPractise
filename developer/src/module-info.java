module developer {
    exports com.hugh.dev1; // 使用时： 正常 + 反射
    opens com.hugh.dev2; // 使用时： 反射
}