package org.example.efftive.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 文件描述
 *
 * @author Meng
 * @version 1.0
 * @date 2025-07-17 16:09:41
 */
public class Lazy {
    private static Lazy INSTANCE = new Lazy();
    private Lazy() {

    }
    public static Lazy getInstance() {
        return INSTANCE;
    }
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Lazy> constructor = Lazy.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Lazy fake = constructor.newInstance();
        System.out.println(fake == Lazy.getInstance()); // false ❌

    }
}
