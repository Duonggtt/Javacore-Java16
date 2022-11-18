package DEMO_LMHT;

public class Yasuo implements CanSurf{

    private String hair;
    private String weapon;

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void surf() {
        System.out.println("Co the luot");
    }
}
