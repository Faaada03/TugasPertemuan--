/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasKe3;

/**
 *
 * @author MyBook Hype AMD
 */
public class Pesawat extends Transportasi {

    /**
     * @return the JenisPesawat
     */
    protected String getJenisPesawat() {
        return JenisPesawat;
    }

    /**
     * @param JenisPesawat the JenisPesawat to set
     */
    protected void setJenisPesawat(String JenisPesawat) {
        this.JenisPesawat = JenisPesawat;
    }

    /**
     * @return the DiBidang
     */
    protected String getDiBidang() {
        return DiBidang;
    }

    /**
     * @param DiBidang the DiBidang to set
     */
    protected void setDiBidang(String DiBidang) {
        this.DiBidang = DiBidang;
    }

    /**
     * @return the Kecepatan
     */
    protected String getKecepatan() {
        return Kecepatan;
    }

    /**
     * @param Kecepatan the Kecepatan to set
     */
    protected void setKecepatan(String Kecepatan) {
        this.Kecepatan = Kecepatan;
    }

    /**
     * @return the Amunisi
     */
    protected String getAmunisi() {
        return Amunisi;
    }

    /**
     * @param Amunisi the Amunisi to set
     */
    protected void setAmunisi(String Amunisi) {
        this.Amunisi = Amunisi;
    }
    
    private String JenisPesawat;
    private String DiBidang;
    private String Kecepatan;
    private String Amunisi;
    
    
}
