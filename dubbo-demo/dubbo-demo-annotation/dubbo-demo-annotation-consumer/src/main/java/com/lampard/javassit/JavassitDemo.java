package com.lampard.javassit;

import javassist.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JavassitDemo {

    public static void main(String[] args) throws CannotCompileException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        // 初始化
        ClassPool classPool = ClassPool.getDefault();

        CtClass ctClass = classPool.makeClass("Hello World");

        CtMethod ctMethod = CtNewMethod.make("" +
                "public static void void test(){" +
                "        System.out.println(\"Hello World !!!\");" +
                "    }", ctClass);

        Class aClass = ctClass.toClass();

        Object object = aClass.newInstance();

        Method method = aClass.getDeclaredMethod("test", null);

        method.invoke(object, null);
    }


}
