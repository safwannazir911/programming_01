package solid;

public class DependencyInversion {
    public interface Switchable {
        void turnOn();
        void turnOff();
    }

    public static class LightBulb implements Switchable {
        @Override
        public void turnOn() {
            System.out.println("LightBulb: ON");
        }

        @Override
        public void turnOff() {
            System.out.println("LightBulb: OFF");
        }
    }
    public static class Fan implements Switchable {
        @Override
        public void turnOn() {
            System.out.println("Fan: Spinning");
        }

        @Override
        public void turnOff() {
            System.out.println("Fan: Stopped");
        }
    }

    public static class Switch {
        private final Switchable device;
        private boolean isOn = false;

        public Switch(Switchable device) {
            this.device = device;
        }

        public void press() {
            if (isOn) {
                device.turnOff();
                isOn = false;
            } else {
                device.turnOn();
                isOn = true;
            }
        }
    }

    public static void main(String[] args) {
        Switchable device = new LightBulb();
        Switch bulbSwitch = new Switch(device); //Switch depends only on Switchable (interface), not on LightBulb or Fan directly
        bulbSwitch.press(); // Turn ON
        bulbSwitch.press(); // Turn OFF

    }

}
