
package AutoVehiculPackage;

    public class AutoVehicul{
        private  String model;
        private String proprietar;
        private String pret;
        private String an;
        private static final String culoare = "Gri";

        public AutoVehicul()
        {
            this.model="";
            this.proprietar="";
            this.pret="";
            this.an="";
        }

        public AutoVehicul(String model,String proprietar,String pret,String an){
            this.model=model;
            this.proprietar=proprietar;
            this.pret=pret;
            this.an=an;

        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getProprietar() {
            return proprietar;
        }

        public void setProprietar(String proprietar) {
            this.proprietar = proprietar;
        }


        public String getPret() {
            return pret;
        }

        public void setPret(String pret) {
            this.pret = pret;
        }

        public String getAn() {
            return an;
        }

        public void setAn(String an) {
            this.an = an;
        }

        public String toString(){
            return model+" "+ proprietar+ " "+pret+" "+an;
        }
    }