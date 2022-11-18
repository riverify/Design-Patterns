package com.river.chain_of_responsibility;

/**
 * @Author River
 * @Date 2022/11/18 14:23
 **/
public class Mission {
    /** Mission Name */
    private String name;

    /** Enemy Number */
    private int enemyNum;

    /**
     * parameterized constructor
     */
    public Mission(String name, int enemyNum) {
        this.name = name;
        this.enemyNum = enemyNum;
    }

    /**
     * No parameter constructor
     */
    public Mission() {
    }

    /**
     * Get Mission Name
     * @return Mission Name
     */
    public String getName() {
        return name;
    }

    /**
     * Set Mission Name
     * @param name Mission Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get Enemy Number
     * @return Enemy Number
     */
    public int getEnemyNum() {
        return enemyNum;
    }

}
