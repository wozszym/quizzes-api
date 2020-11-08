class Army {

    private static void CreateUnit(int n) {
        for (int i = 0; i < n; i++) {
            new Unit("a");
        }
    }

    private static void CreateKnight(int n) {
        for (int i = 0; i < n; i++) {
            new Knight("a");
        }
    }

    private static void CreateGeneral(int n) {
        for (int i = 0; i < n; i++) {
            new General("a");
        }
    }

    private static void CreateDoctor(int n) {
        for (int i = 0; i < n; i++) {
            new Doctor("a");
        }
    }

    public static void createArmy() {
        // Implement this method
        CreateUnit(5);
        CreateKnight(3);
        CreateGeneral(1);
        CreateDoctor(1);
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}