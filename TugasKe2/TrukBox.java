/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasKe2;

/**
 *
 * @author MyBook Hype AMD
 */
public class TrukBox extends Truk {

    public static void main(String[] args) {

        TrukBox MustiBisa = new TrukBox();
        
        //Class kendaraan
        MustiBisa.setJenisKendaraan("Truk");
        MustiBisa.setMesin("4V21-2AT4");
        MustiBisa.setBbakar("Bensin");
        MustiBisa.setPenggerak("Roda Karet");
        
        //Class Truk
        MustiBisa.setJenisTruk("TrukBox");
        MustiBisa.setThTruk(1950);
        MustiBisa.setJumRoda(4);

        System.out.println("NAMA TRUK : MustiBisa ");
        System.out.println(" --Informasi dari CLASS kendaraan-- ");
        System.out.println("Jenis Kendaraan = " + MustiBisa.getJenisKendaraan());
        System.out.println("Jenis Mesin = " + MustiBisa.getMesin());
        System.out.println("Bahan Bakar = " + MustiBisa.getBbakar());
        System.out.println("Bahan Bakar = " + MustiBisa.getPenggerak());

        System.out.println("");
        System.out.println("--Informasi dari CLASS Truk--");
        System.out.println("jenis Truk ini adalah = " + MustiBisa.getJenisTruk());
        System.out.println("jenis Truk ini adalah = " + MustiBisa.getThTruk());
        System.out.println("jenis Truk ini adalah = " + MustiBisa.getJumRoda());

    }

}
