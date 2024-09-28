import java.time.LocalDate;

public class CarrotSeller1 {
    private String name;
    private LocalDate BirthDate;
    private int conctratDone;
    /* kdybych tady udělal "contractDone už jako "
     * double, znamenalo by to to, že bych nemusel
     * psát ten "public double?"
     */
    private double carrotSold;
    //*prodaná mrkev se váží v tunách

    private String registerOfCar;
    private int consumption;
    private String adress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(LocalDate birthdate) {
        this.BirthDate = birthdate;
    }

    public void setBirthDate(int i, int i1, int i2) {
    }

    public int getConctratDone() {
        return conctratDone;
    }

    public void setConctratDone(int conctratDone) {
        this.conctratDone = conctratDone;
    }

    public double setConctratDone() {
        return conctratDone;
    }

    public double getCarrotSold() {
        return carrotSold;
    }

    public void setCarrotSold(double carrotSold) {
        this.carrotSold = carrotSold;
    }

    public String getRegisterOfCar() {
        return registerOfCar;
    }

    public void setRegisterOfCar(String registerOfCar) {
        this.registerOfCar = registerOfCar;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
