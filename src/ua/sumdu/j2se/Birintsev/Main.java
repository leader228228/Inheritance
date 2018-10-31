package ua.sumdu.j2se.Birintsev;

public class Main {

    public static void main(String[] args) {

        Hobby fishing = new Fishing();

        fishing.isRegular = true;

        fishing.hasAchievements = false;

        ((Fishing) fishing).setPersonalRecord(12.5f);

        ((Fishing) fishing).setHasBoat(false);

        Hobby football = new Football();

        football.isRegular = true;

        football.hasAchievements = true;

        ((Football) football).setTeam("Dynamo");

        ((Football) football).setTeamNumber((short)7);

        Hobby [] hobbyList = {fishing, football};

        for (Hobby current: hobbyList) {

            current.tellAboutHobby();

        }
        
    }
}
