package movies.lectures;

public class Projector implements Controllable, Navigatable{

    @Override
    public void powerOff() {
        System.out.printf("Picking on remote signal");
        System.out.println("Starting project sequence");
    }

    @Override
    public void powerOn() {
        System.out.printf("Picking on remote signal");
        System.out.println("Stopping project sequence");
    }

    @Override
    public void bringUpMenu() {
        System.out.println("Accessing menu view and displaying through projector");
    }

    @Override
    public void scrollUpMenu() {
        System.out.println("Scrolling up through the menu");
    }

    @Override
    public void scrollDownMenu() {
        System.out.println("Scrolling down through the menu");
    }

    public static void main(String[] args) {

        Controllable projector = new Projector();
        powerForTwelveHours(projector);

        String hello;

    }

    public static void powerForTwelveHours(Controllable c){
        c.powerOn();
        System.out.println("wait 12 hours");
        c.powerOff();
    }

}


