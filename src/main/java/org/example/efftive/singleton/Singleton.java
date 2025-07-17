package org.example.efftive.singleton;

/**
 * 文件描述
 *
 * @author Meng
 * @version 1.0
 * @date 2025-07-17 16:16:12
 */
public enum Singleton {
    INSTANCE;
    public void sing() {
        System.out.println("Singleton instance method called.");
    }

    public static void main(String[] args) {
        Singleton.INSTANCE.sing();
    }
}
