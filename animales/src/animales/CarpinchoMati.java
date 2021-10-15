package animales;

public class CarpinchoMati
{
    public String szName;
    public int iCmsNepe;
    public String szSexo;
    public int iPeso;
    public boolean bHinchadeBoca;


    public CarpinchoMati(){

    }

    public CarpinchoMati( String name, int nepe, int peso, boolean boquita, String sexo )
    {
        szName = name; 
        iCmsNepe = nepe;
        iPeso = peso; 
        bHinchadeBoca = boquita;
        szSexo = sexo;
    }

    @Override
    public String toString() {
        return "CarpinchoMati [ Hincha de Boca = " + bHinchadeBoca + " | Cms del Nepe ="
                + iCmsNepe + " | Peso = " + iPeso + " | Nombre = " + szName + " |  Sexo = "
                + szSexo + " ]";
    }


 public String getSzName() {
        return szName;
    }

    public void setSzName(String szName) {
        this.szName = szName;
    }

    public int getiCmsNepe() {
        return iCmsNepe;
    }

    public void setiCmsNepe(int iCmsNepe) {
        this.iCmsNepe = iCmsNepe;
    }

    public String getSzSexo() {
        return szSexo;
    }

    public void setSzSexo(String szSexo) {
        this.szSexo = szSexo;
    }

    public int getiPeso() {
        return iPeso;
    }

    public void setiPeso(int iPeso) {
        this.iPeso = iPeso;
    }

    public boolean isbHinchadeBoca() {
        return bHinchadeBoca;
    }

    public void setbHinchadeBoca(boolean bHinchadeBoca) {
        this.bHinchadeBoca = bHinchadeBoca;
    }
  

    
}
