package com.dylan.simplefactory;

/**
 * Description
 * author   Dylan.zhuang
 * Date:    16/10/1-下午9:19
 */

public class CookFishFactory {
    public static Fish createFish(String type) {
        Fish fish = null;
        if (type.equals("steam")) {
            fish = new SteamFish();
        } else if (type.equals("stew")) {
            fish = new StewFish();
        } else if (type.equals("fry")) {
            fish = new FryFish();
        }
        return fish;
    }
//    public static Fish createFish(String type) {
//        try {
//            Class fish = Class.forName(type);
//            return (Fish) fish.newInstance();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
}
