package DEMO_LMHT;

public class Main {
    public static void main(String[] args) {
        Lucian lucian = new Lucian();
        Yasuo yasuo = new Yasuo();

        System.out.println("Lucian");
        lucian.setHair("Hair: Brown");
        System.out.println(lucian.getHair());
        lucian.setWeapon("Weapon: pistols");
        System.out.println(lucian.getWeapon());
        lucian.shoot();
        lucian.surf();

        System.out.println("Yasuo");
        yasuo.setHair("Hair: Black");
        System.out.println(yasuo.getHair());
        yasuo.setWeapon("Weapon: sword");
        System.out.println(yasuo.getWeapon());
        yasuo.surf();
    }
}
