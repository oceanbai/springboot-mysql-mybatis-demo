package com.example.demo.smm.cionfig;

/**
 * @author bby15929
 * @date 2020年07月16日13:11:03
 */
public class BaseManager {
    private static BaseManager instance;
    private BaseConfig baseConfig;

    public static BaseManager getInstance() {
        synchronized (BaseManager.class) {
            if (instance == null) {
                instance = new BaseManager();
            }
            return instance;
        }
    }
}
