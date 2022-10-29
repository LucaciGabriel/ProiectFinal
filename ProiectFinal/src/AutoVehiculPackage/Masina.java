package AutoVehiculPackage;

public class Masina extends AutoVehicul{

    private String numarlocuri;

    public Masina()
    {
        super.setModel("");
        super.setModel("");
        super.setModel("");
        super.setModel("");
        this.numarlocuri="";
    }

    public Masina(String model,String proprietar,String pret,String an,String numarlocuri)
    {
        super.setModel(model);
        super.setModel(proprietar);
        super.setModel(pret);
        super.setModel(an);
        this.numarlocuri=numarlocuri;
    }

    public String getNumarlocuri()
    {
        return numarlocuri;
    }

    public void setNumarLocuri(String numarlocuri)
    {
        this.numarlocuri=numarlocuri;
    }
    public String toString()
    {
        return super.getModel()+" "+ super.getProprietar()+ " "+super.getPret()+" "+super.getAn()+" "+this.numarlocuri;
    }
}
