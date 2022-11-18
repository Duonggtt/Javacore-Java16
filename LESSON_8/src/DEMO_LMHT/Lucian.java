package DEMO_LMHT;

public class Lucian implements CanShoot,CanSurf{

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
    public void shoot() {
        System.out.println("Co the ban");
    }

    @Override
    public void surf() {
        System.out.println("Co the luot");
    }
}
