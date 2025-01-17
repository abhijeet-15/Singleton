package org.example;

public class DoubleCheckedLocking {

    private static DoubleCheckedLocking instance;

    private DoubleCheckedLocking(){
    }

    public static DoubleCheckedLocking getInstance() {

        if(instance == null) {
            synchronized (DoubleCheckedLocking.class) {
                if(instance == null) {
                    instance = new DoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
