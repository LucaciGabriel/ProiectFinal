package AutoVehiculPackage;

public class Motocicleta extends AutoVehicul{
    
    private String vitezamaxima;

    public Motocicleta()
    {
        super.setModel("");
        super.setModel("");
        super.setModel("");
        super.setModel("");
        this.vitezamaxima="";
    }

    public Motocicleta(String model,String proprietar,String pret,String an,String vitezamaxima)
    {
        super.setModel(model);
        super.setModel(proprietar);
        super.setModel(pret);
        super.setModel(an);
        this.vitezamaxima=vitezamaxima;
    }

    public String getvitezamaxima()
    {
        return vitezamaxima;
    }

    public void setvitezamaxima(String vitezamaxima)
    {
        this.vitezamaxima=vitezamaxima;
    }
    public String toString()
    {
        return super.getModel()+" "+ super.getProprietar()+ " "+super.getPret()+" "+super.getAn()+" "+this.vitezamaxima;
    }
}
