package com.river.chain_of_responsibility;

/**
 * @Author River
 * @Date 2022/11/18 14:34
 **/
public abstract class Officer {
    /** Officer Name */
    private String name;

    /** Next Officer */
    private Officer nextOfficer;

    /**
     * parameterized constructor
     */
    public Officer(String name) {
        this.name = name;
    }

    /**
     * No parameter constructor
     */
    public Officer() {
    }

    /**
     * Get Officer Name
     * @return Officer Name
     */
    public String getName() {
        return name;
    }

    /**
     * Set Officer Name
     * @param name Officer Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get Next Officer
     * @return Next Officer
     */
    public Officer getNextOfficer() {
        return nextOfficer;
    }

    /**
     * Set Next Officer
     * @param nextOfficer Next Officer
     */
    public void setNextOfficer(Officer nextOfficer) {
        this.nextOfficer = nextOfficer;
    }

    /**
     * Handle Mission
     * @param mission Mission
     */
    public abstract void handleMission(Mission mission);
}
