public class Main {
    public static void main(String[] args) {
        CarrotSeller1 carrotseller1 = new CarrotSeller1();

        carrotseller1.setName("Jan Honza");
        carrotseller1.setBirthDate(1999, 05, 24);
        carrotseller1.setConctratDone(95);
        carrotseller1.setCarrotSold(carrotseller1.setConctratDone()* 1.7);
        carrotseller1.setRegisterOfCar("4BE8723");
        carrotseller1.setConsumption(15);
        carrotseller1.setAdress("Mládí 38, Stodůlky, Praha, 150 00 ");

        CarrotSeller2 carrotSeller2 = new CarrotSeller2();
        carrotSeller2.setName("Filip Karel");
        carrotSeller2.setBirthdate(1985, 06, 11);
        carrotSeller2.setConctratDone(92);
        carrotSeller2.setCarrotSold(carrotSeller2.getConctratDone()* 2);
        carrotSeller2.setRegisterOfCar("A2P3964");
        carrotSeller2.setConsumption(13);
        carrotSeller2.setAdress("Jana Mrázka, 75/8, Horní Počernice, Praha, 187 52");

//        teď se vypíší jména obouch prodejcu viz: Prodavač č.1 se jmenuje:

        System.out.println("Prodavač č.1 se jmenuje: " + carrotseller1.getName());
        System.out.println("Prodavač č.2 se jmenuje: " + carrotSeller2.getName());
    }
}