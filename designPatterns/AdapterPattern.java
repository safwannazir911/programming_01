package designPatterns;

public class AdapterPattern {
    static class OldCharger {
        void plugInRoundPin() {
            System.out.println("Charging using Old Charger");
        }
    }


    interface NewCharger {
        void connect();
    }

    static class ChargerAdapter implements NewCharger {
        private OldCharger charger;

        public ChargerAdapter(OldCharger charger) {
            this.charger = charger;
        }

        @Override
        public void connect() {
            // adapts round pin to square socket
            charger.plugInRoundPin();
        }
    }


    public static void main(String[] args) {
        OldCharger oldCharger = new OldCharger();

        NewCharger adapter = new ChargerAdapter(oldCharger);
        adapter.connect();  // Client uses adapter like a SquareSocket
    }
}
