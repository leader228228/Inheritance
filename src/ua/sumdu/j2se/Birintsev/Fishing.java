package ua.sumdu.j2se.Birintsev;

public class Fishing extends Hobby {

    static final String name = "Fishing";

    private float personalRecord;

    boolean hasBoat;

    @Override
    public void tellAboutHobby() {

        System.out.println(name);

        System.out.println("Personal record is : " + personalRecord + "kgs");

        System.out.println("The person" + ((hasBoat) ? " has " : " does not have ") + "a boat" );

    }

    public Fishing() {

        super();

    }

    public float getPersonalRecord() {
        return personalRecord;
    }

    public void setPersonalRecord(float personalRecord) {
        this.personalRecord = personalRecord;
    }

    public boolean isHasBoat() {
        return hasBoat;
    }

    public void setHasBoat(boolean hasBoat) {
        this.hasBoat = hasBoat;
    }

    public static String getName() {
        return name;
    }
}
