package com.company.nexus.util;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by WolframAlpha on 23/10/2016.
 */
public class ReflectionFactory<T extends FactoryCreation> {

    private final String INVOCATION_METHOD_NAME = "getInstance";

    private Class<T> tClass;

    public ReflectionFactory(){}

    public void setClass(Class<T> tClass){
            this.tClass = tClass;
    }

    public T construct(Boolean singleton){
        try {
            Method method = tClass.getMethod(INVOCATION_METHOD_NAME, Boolean.class);
            return (T) method.invoke(null,singleton);
        }catch (NoSuchMethodException e) {
                e.printStackTrace();
        }catch (IllegalAccessException e) {
            e.printStackTrace();
        }catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
