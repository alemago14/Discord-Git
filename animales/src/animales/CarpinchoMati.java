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


    public String get__sz_name() {
        return szName;
    }

    public void set__sz_name(String szName) {
        this.szName = szName;
    }

    public int get__int_cms_nepe() {
        return iCmsNepe;
    }

    public void set__int_cms_nepe(int iCmsNepe) {
        this.iCmsNepe = iCmsNepe;
    }

    public String get__sz_sexo() {
        return szSexo;
    }

    public void set__sz_sexo(String szSexo) {
        this.szSexo = szSexo;
    }

    public int get__int_peso() {
        return iPeso;
    }

    public void set__int_peso(int iPeso) {
        this.iPeso = iPeso;
    }

    public boolean is__bool_hincha_de_boquita() {
        return bHinchadeBoca;
    }

    public void set__bool_hincha_de_boquita(boolean bHinchadeBoca) {
        this.bHinchadeBoca = bHinchadeBoca;
    }

  

    
}
