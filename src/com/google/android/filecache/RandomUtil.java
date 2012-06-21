
package com.google.android.filecache;

import java.util.Random;

public class RandomUtil {

    private static Random sRandom;

    public static Random getInstance() {
        if (sRandom == null) {
            sRandom = new Random(System.currentTimeMillis());
        }
        return sRandom;
    }

    private RandomUtil() {
    }

}
