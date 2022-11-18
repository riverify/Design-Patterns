package com.river.chain_of_responsibility;

/**
 * @Author River
 * @Date 2022/11/18 14:36
 **/

/**
 * SquadLeader(班长)
 */
public class SquadLeader extends Officer {

    /**
     * parameterized constructor
     */
    public SquadLeader(String name) {
        super(name);
    }

    /**
     * Handle Mission:
     * If the number of enemies is less than 10, the squad leader can handle it.
     * @param mission Mission
     */
    @Override
    public void handleMission(Mission mission) {
        // If the number of enemies is less than 10, the squad leader can handle it.
        if (mission.getEnemyNum() <= 10) {
            System.out.println("SquadLeader: " + getName() + " handle mission [" + mission.getName() + "]");
            // If the number of enemies is more than 10,
            // getNextOfficer() will be called
        } else {
            // if getNextOfficer() is not null, call getNextOfficer().handleMission(mission)
            if (getNextOfficer() != null) {
                getNextOfficer().handleMission(mission);
                // if current officer is the last one(getNextOfficer() == null), print the message
            } else {
                System.out.println("Mission " + mission.getName() + " can not be handled");
            }
        }
    }
}
