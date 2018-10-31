package ua.sumdu.j2se.Birintsev;

public abstract class Hobby {

    public abstract void tellAboutHobby();

    private boolean isRegular;

    private boolean hasAchievements;

    public void setRegular(boolean regular) {
        isRegular = regular;
    }

    public void setHasAchievements(boolean hasAchievements) {
        this.hasAchievements = hasAchievements;
    }
}
