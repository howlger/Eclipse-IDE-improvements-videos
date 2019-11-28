package generated;

public final class Reg {

    Peripheral_TIMER0 peripheral_Timer0 = new Peripheral_TIMER0();

    public static final class Peripheral_TIMER0 extends Peripheral {

        public Peripheral_TIMER0() {
            super("TIMER0", "1.0", "desc", "groupName", 0, 32);
        }

        public Reg_CR regCR = new Reg_CR();

        public static final class Reg_CR extends Register {
            public Reg_CR() {
                super("CR", "", 0, 32, AccessType.readWrite, 0xf, 0x0);
            }

            // fields of CR
            public Field_EN fieldEn = new Field_EN();

            public static final class Field_EN extends Field {
                public Field_EN() {
                    super("EN", "description", 0, AccessType.readWrite);
                }
            }

            public Field_RST fieldRST = new Field_RST();

            public static final class Field_RST extends Field {
                public Field_RST() {
                    super("RST", "description", 1, AccessType.readWrite);
                }
            }
        }
    }

    public static void main(String[] args) {
        Reg reg = new Reg();

        System.out.println(reg.peripheral_Timer0.regCR.name + ": " + reg.peripheral_Timer0.regCR.resetValue);
        System.out.println(reg.peripheral_Timer0.regCR.fieldEn.name + ": " + reg.peripheral_Timer0.regCR.fieldEn.bitRange);
    }
}

