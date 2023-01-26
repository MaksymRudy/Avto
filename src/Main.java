public class Main {
    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari();
        MersedesS mersedesS = new MersedesS();
        JeepCheeroky jeepCheeroky = new JeepCheeroky();
        ToyotaLandCrueser toyotaLandCrueser = new ToyotaLandCrueser();
        WVTransporter wvTransporter = new WVTransporter();


        System.out.println("Ferrari - кількість колес: " + ferrari.getWheels());
        System.out.println("Ferrari - кількість водійських місць: " + ferrari.getSteeringWheel());
        System.out.println("Ferrari - Наявність рами: " + ferrari.frame  );
        System.out.println("Ferrari - загальна кількість місць " + ferrari.numbersOfSeats);
        System.out.println("Ferrari - потужність: " + ferrari.power);

        System.out.println("Mersedes S - кількість колес: " + mersedesS.getWheels());
        System.out.println("Mersedes S - кількість водійських місць: " + mersedesS.getSteeringWheel());
        System.out.println("Mersedes S - Наявність рами: " + mersedesS.frame  );
        System.out.println("Mersedes S - загальна кількість місць " + mersedesS.numbersOfSeats);
        System.out.println("Mersedes S - потужність: " + mersedesS.power);

        System.out.println("Jeep Cheeroky - кількість колес: " + jeepCheeroky.getWheels());
        System.out.println("Jeep Cheeroky - кількість водійських місць: " + jeepCheeroky.getSteeringWheel());
        System.out.println("Jeep Cheeroky - Наявність рами: " + jeepCheeroky.frame  );
        System.out.println("Jeep Cheeroky - загальна кількість місць " + jeepCheeroky.numbersOfSeats);
        System.out.println("Jeep Cheeroky - потужність: " + jeepCheeroky.power);

        System.out.println("Toyota Land Crueser - кількість колес: " + toyotaLandCrueser.getWheels());
        System.out.println("                    - кількість водійських місць: " + toyotaLandCrueser.getSteeringWheel());
        System.out.println("                    - Наявність рами: " + toyotaLandCrueser.frame  );
        System.out.println("                    - загальна кількість місць " + toyotaLandCrueser.numbersOfSeats);
        System.out.println("                    - потужність: " + toyotaLandCrueser.power);

        System.out.println("WV Transporter - кількість колес: " + wvTransporter.getWheels());
        System.out.println("---------------- кількість водійських місць: " + wvTransporter.getSteeringWheel());
        System.out.println("---------------- Наявність рами: " + wvTransporter.frame  );
        System.out.println("---------------- загальна кількість місць " + wvTransporter.numbersOfSeats);
        System.out.println("---------------- потужність: " + wvTransporter.power);


    }
}