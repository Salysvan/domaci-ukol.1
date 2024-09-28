import java.time.LocalDate;

public class CarrotSeller2 {
    private String name;
    private LocalDate birthdate;
    private int conctratDone;
    private double carrotSold;
    /*proč u CarrosSeller1 jsem musel přidávat
     * část kodu a u CarrotSeller2 nemusím
     */
    private String registerOfCar;
    private int consumption;
    private String adress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setBirthdate(int a, int a2, int a3) {
    }

    public int getConctratDone() {
        return conctratDone;
    }

    public void setConctratDone(int conctratDone) {
        this.conctratDone = conctratDone;
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

