package org.example.efftive.singleton;


/**
 * 文件描述
 *
 * @author Meng
 * @version 1.0
 * @date 2025-07-17 16:20:53
 */
public enum LogPrinter {
    INSTANCE;
    private void printLog(String message) {
        System.out.println("LogPrinter: " + message);
    }

    public static void main(String[] args) {
        LogPrinter.INSTANCE.printLog("hello world");
    }
}
