/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasKe3;

/**
 *
 * @author MyBook Hype AMD
 */
public class PesawatTempur extends Pesawat {

    public static void main(String[] args) {

        PesawatTempur Tempur = new PesawatTempur();

        //Class Transportasi
        Tempur.setNama("B2-Spirit");
        Tempur.setJenisTrans("Pesawat");
        Tempur.setBhBakar("JP-8");

        //Class Pesawat
        Tempur.setJenisPesawat("PesawatTempur");
        Tempur.setDiBidang("Pertahanan dan Penyerangan");
        Tempur.setKecepatan("900 km/jam");
        Tempur.setAmunisi("B83 nuclear bomb");

        System.out.println("--Dari CLASS Transportasi--");
        System.out.println("PESAWAT : " + Tempur.getNama());
        System.out.println(Tempur.getNama() + "Adalah transportasi udara milik USA  yaitu sebagai = " + Tempur.getJenisTrans());
        System.out.println("Bahan bakar yang digunakan pesawat " + Tempur.getNama() + " adalah = " + Tempur.getBhBakar());
        System.out.println(Tempur.getNama() + " transportasi udara milik USA  yaitu sebagai = " + Tempur.getBhBakar());

        System.out.println("");
        System.out.println("--Dari CLASS Pesawat--");
        System.out.println(Tempur.getNama() + " Adalah pesawat dengan jenis = " + Tempur.getJenisPesawat());
        System.out.println(Tempur.getNama() + " Pesawat bergerak di bidang = " + Tempur.getDiBidang());
        System.out.println(Tempur.getNama() + "Memiliki kecepatan hingga = " + Tempur.getKecepatan());
        System.out.println("Salah satu amunisi yang bisa dibawa = " + Tempur.getAmunisi());
    }

}
