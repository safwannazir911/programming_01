package designPatterns;

public class BuilderPattern {
    public static class Computer {
        private String CPU;
        private String RAM;
        private String storage;
        private boolean hasGraphicsCard;

        // Private constructor
        private Computer(Builder builder) {
            this.CPU = builder.CPU;
            this.RAM = builder.RAM;
            this.storage = builder.storage;
            this.hasGraphicsCard = builder.hasGraphicsCard;
        }

        public static class Builder {
            private String CPU;
            private String RAM;
            private String storage;
            private boolean hasGraphicsCard;

            public Builder setCPU(String CPU) {
                this.CPU = CPU;
                return this;
            }

            public Builder setRAM(String RAM) {
                this.RAM = RAM;
                return this;
            }

            public Builder setStorage(String storage) {
                this.storage = storage;
                return this;
            }

            public Builder setGraphicsCard(boolean hasGraphicsCard) {
                this.hasGraphicsCard = hasGraphicsCard;
                return this;
            }

            public Computer build() {
                return new Computer(this);
            }
        }

        @Override
        public String toString() {
            return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage + ", GraphicsCard=" + hasGraphicsCard + "]";
        }
    }


    public static void main(String[] args){


        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard(true)
                .build();

        System.out.println(gamingPC);


    }
}
