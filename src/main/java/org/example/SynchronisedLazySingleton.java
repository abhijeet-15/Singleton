package org.example;

public class SynchronisedLazySingleton {

    private static SynchronisedLazySingleton instance;

    private SynchronisedLazySingleton(){

    }

    public static synchronized SynchronisedLazySingleton getInstance() {
        if(instance == null) {
            instance = new SynchronisedLazySingleton();
        }
        return instance;
    }

}
