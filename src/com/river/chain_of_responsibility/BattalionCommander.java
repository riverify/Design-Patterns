package com.river.chain_of_responsibility;

/**
 * @Author River
 * @Date 2022/11/18 14:43
 *
 * BattalionCommander(连长)
 **/
public class BattalionCommander extends Officer {

    /**
     * parameterized constructor
     */
    public BattalionCommander(String name) {
        super(name);
    }

    /**
     * Handle Mission:
     * If the number of enemies is less than 200, the battalion commander can handle it.
     * @param mission Mission
     */
    @Override
    public void handleMission(Mission mission) {
        // If the number of enemies is less than 200, the battalion commander can handle it.
        if (mission.getEnemyNum() <= 200) {
            System.out.println("BattalionCommander: " + getName() + " handle mission [" + mission.getName() + "]");
            // If the number of enemies is more than 200,
        } else {
            // Battalion Commander has no next officer RIGHT NOW, so getNextOfficer() is always null
            if (getNextOfficer() != null) {
                getNextOfficer().handleMission(mission);
            } else {
                System.out.println("Mission '" + mission.getName() + "' can not be handled, please contact the headquarters");
            }
        }
    }
}
