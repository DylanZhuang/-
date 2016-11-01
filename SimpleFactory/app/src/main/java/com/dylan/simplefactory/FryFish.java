package com.dylan.simplefactory;

import android.util.Log;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/10/19-下午9:16
 */

public class FryFish extends Fish {
    @Override
    public void cook() {
        Log.d(MainActivity.TAG, "油炸鱼");

    }
}
