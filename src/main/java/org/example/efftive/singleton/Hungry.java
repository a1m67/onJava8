package org.example.efftive.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 文件描述
 *
 * @author Meng
 * @version 1.0
 * @date 2025-07-17 16:08:39
 */
public class Hungry {
    public static final Hungry INSTANCE = new Hungry();
    private Hungry() {
        // 私有构造函数，防止外部实例化
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Hungry> constructor = Hungry.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Hungry fake = constructor.newInstance();
        System.out.println(fake == Hungry.INSTANCE); // false ❌
    }
}
