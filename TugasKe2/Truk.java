/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasKe2;

/**
 *
 * @author MyBook Hype AMD
 */
public class Truk extends kendaraan {

    /**
     * @return the jenisTruk
     */
    protected String getJenisTruk() {
        return jenisTruk;
    }

    /**
     * @param jenisTruk the jenisTruk to set
     */
    protected void setJenisTruk(String jenisTruk) {
        this.jenisTruk = jenisTruk;
    }

    /**
     * @return the ThTruk
     */
    protected int getThTruk() {
        return ThTruk;
    }

    /**
     * @param ThTruk the ThTruk to set
     */
    protected void setThTruk(int ThTruk) {
        this.ThTruk = ThTruk;
    }

    /**
     * @return the JumRoda
     */
    protected int getJumRoda() {
        return JumRoda;
    }

    /**
     * @param JumRoda the JumRoda to set
     */
    protected void setJumRoda(int JumRoda) {
        this.JumRoda = JumRoda;
    }

    private String jenisTruk;
    private int ThTruk;
    private int JumRoda;

}
