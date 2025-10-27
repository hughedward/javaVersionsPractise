package com.hugh.java17.v13;

/**
 * 文本块
 */
public class Text {
    public static void main(String[] args) {
        String a = "床前明月光\n疑是地上霜";

        // 换行
        // 13
        String b = """
                床前明月光
                疑是地上霜
                举头望明月
                低头思故乡
                """;

        System.out.println(b);
    }
}
