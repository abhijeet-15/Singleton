package org.example;

public class StaticHolderSingleton  {

    private StaticHolderSingleton() {

    }

    private static class SingletonHelper {
        private static StaticHolderSingleton INSTANCE = new StaticHolderSingleton();
    }

    public static StaticHolderSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

}
