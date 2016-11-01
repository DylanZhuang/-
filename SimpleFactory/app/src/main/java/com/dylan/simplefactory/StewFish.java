package com.dylan.simplefactory;

import android.util.Log;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/10/1-上午1:15
 */

public class StewFish extends Fish {
    @Override
    public void cook() {
        Log.d(MainActivity.TAG, "炖鱼");
    }
}
