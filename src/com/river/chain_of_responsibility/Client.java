package com.river.chain_of_responsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author River
 * @Date 2022/11/18 14:45
 **/

/**
 * Client is the main class of the chain of responsibility pattern.
 * It is used to create a chain of officers and handle missions.
 * The client class is responsible for creating a chain of officers and handling missions.
 * The requirements of the mission are as follows:
 * If the number of enemies is less than 10, the squad leader can handle it.
 * If the number of enemies is less than 50, the platoon leader can handle it.
 * If the number of enemies is less than 200, the battalion commander can handle it.
 * If the number of enemies is more than 200, contact the headquarters.
 *
 * *************** To run this program, JDK 1.8 or higher is required ***************
 */
public class Client {
    public static void main(String[] args) {
        // Create officers
        Officer squadLeader = new SquadLeader("Jimmy");
        Officer platoonLeader = new PlatoonLeader("Tom");
        Officer battalionCommander = new BattalionCommander("River");

        // Set the next officer  (set the chain of responsibility)
        // [SquadLeader -> PlatoonLeader -> BattalionCommander]
        squadLeader.setNextOfficer(platoonLeader);
        platoonLeader.setNextOfficer(battalionCommander);

        // Create a mission list
        List<Mission> missions = new ArrayList<>();
        missions.add(new Mission("Attack", 3)); // SquadLeader can handle it
        missions.add(new Mission("Occupy", 15)); // SquadLeader can handle it
        missions.add(new Mission("Defend", 100)); // BattalionCommander can handle it
        missions.add(new Mission("Invasion", 300)); // BattalionCommander can handle it

        // Handle the mission
        for (Mission mission : missions) {
            squadLeader.handleMission(mission);
        }

        // Output:
        // SquadLeader: Jimmy handle mission [Attack]
        // SquadLeader: Jimmy handle mission [Occupy]
        // BattalionCommander: River handle mission [Defend]
        // Mission 'Invasion' can not be handled, please contact the headquarters

    }
}
