package AutoVehiculPackage;

public class Camion extends AutoVehicul{

    private String capacitate;

    public Camion()
    {
        super.setModel("");
        super.setModel("");
        super.setModel("");
        super.setModel("");
        this.capacitate="";
    }

    public Camion(String model,String proprietar,String pret,String an,String capacitate)
    {
        super.setModel(model);
        super.setModel(proprietar);
        super.setModel(pret);
        super.setModel(an);
        this.capacitate=capacitate;
    }

    public String getcapacitate()
    {
        return capacitate;
    }

    public void setcapacitate(String capacitate)
    {
        this.capacitate=capacitate;
    }
    public String toString()
    {
        return super.getModel()+" "+ super.getProprietar()+ " "+super.getPret()+" "+super.getAn()+" "+this.capacitate;
    }
}
