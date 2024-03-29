package com.itheima.test1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    //attack
    public void attack(Role role) {
        Random r = new Random ();
        int hurt = r.nextInt (20) + 1;
        int remainBlood = role.getBlood () - hurt;
        role.setBlood(remainBlood < 0 ? 0 : remainBlood);

        System.out.println (this.getName () + "举起拳头，打了" + role.getName () + "一拳，造成了" +
                hurt + "点伤害，" + role.getName () + "还剩" + role.getBlood () + "点血");
    }
}
