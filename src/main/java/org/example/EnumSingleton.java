package org.example;

public enum EnumSingleton {

    INSTANCE;

    public void doSomething() {
        System.out.println("Doing something inside Enum Singleton");
    }
}
