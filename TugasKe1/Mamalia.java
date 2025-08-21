/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasKe1;

/**
 *
 * @author MyBook Hype AMD
 */
public class Mamalia extends Hewan {

    /**
     * @return the Nama
     */
    protected String getNama() {
        return Nama;
    }

    /**
     * @param Nama the Nama to set
     */
    protected void setNama(String Nama) {
        this.Nama = Nama;
    }

    /**
     * @return the BerkemebangBiak
     */
    protected String getBerkemebangBiak() {
        
        return BerkemebangBiak;
    }

    /**
     * @param BerkemebangBiak the BerkemebangBiak to set
     */
    protected void setBerkemebangBiak(String BerkemebangBiak) {
        this.BerkemebangBiak = BerkemebangBiak;
    }

    /**
     * @return the indraPendengar
     */
    protected String getIndraPendengar() {
       
        return indraPendengar;
    }

    /**
     * @param indraPendengar the indraPendengar to set
     */
    protected void setIndraPendengar(String indraPendengar) {
        this.indraPendengar = indraPendengar;
    }

    /**
     * @return the Suara
     */
    protected String getSuara() {
       
        return Suara;
    }

    /**
     * @param Suara the Suara to set
     */
    protected void setSuara(String Suara) {
        this.Suara = Suara;
    }
    private String Nama;
    private String BerkemebangBiak;
    private String indraPendengar;
    private String Suara;

}
