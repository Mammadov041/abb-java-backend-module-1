package org.abb_tech.lesson9.classes;

import java.io.Closeable;
import java.io.IOException;

public class Animal implements Closeable {
    public void jump(){
        System.out.println("Animal is jumping ");
    }

    @Override
    public void close() throws IOException {
        System.out.println("Animal close method");
    }
}
