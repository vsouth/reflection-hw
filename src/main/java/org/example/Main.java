package org.example;

import org.example.framework.Context;
import org.example.model.Engine;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        Context context = Context.load("org.example.model");
        System.out.println(context.getLoadedClasses());
        
        try {
            Engine engine = (Engine) context.get("Engine");
            engine.brr();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}