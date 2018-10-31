package ua.sumdu.j2se.Birintsev;

public class Football extends Hobby {

    static final String name = "Football";

    private String team;

    private short teamNumber;

    @Override
    public void tellAboutHobby() {

        System.out.println(name);

        if(team != null){

            System.out.println("This person is a member of a " + team + " team\nAnd his/her team number is " + teamNumber);


        }else{

            System.out.println("This person is not a team member");

        }

    }

    public Football() {

        super();

    }

    public static String getName() {

        return name;

    }

    public String getTeam() {

        return team;

    }

    public void setTeam(String team) {

        this.team = team;

    }

    public short getTeamNumber() {

        return teamNumber;

    }

    public void setTeamNumber(short teamNumber) {

        this.teamNumber = teamNumber;

    }
}
