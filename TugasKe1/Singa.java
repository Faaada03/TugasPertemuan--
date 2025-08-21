/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasKe1;

public class Singa extends Mamalia {

    public static void main(String[] args) {
        Singa singa = new Singa();


        singa.setBernafas("Paru-paru");
        singa.setBergerak("4 kaki");
        singa.setMakan("Daging / Karnivora");
        singa.setNama("Singa ");
        

        singa.setBerkemebangBiak("Beranak");
        singa.setIndraPendengar("2 Telinga");
        singa.setSuara("RAWWWWWWRRRR");

        
        System.out.println("(--dari CLASS Hewan--)");
        System.out.println(singa.getNama() + "Bernafas dengan = " + singa.getBernafas());
        System.out.println(singa.getNama() + "Bergerak dengan = " + singa.getBergerak());
        System.out.println(singa.getNama() + "Termasuk hewan pemakan = " + singa.getMakan());

        System.out.println("");
        System.out.println("(--dari CLASS Mamalia--)");
        System.out.println(singa.getNama() + "Berkembang Biak dengan cara = " + singa.getBerkemebangBiak());
        System.out.println(singa.getNama() + "Mendengar dengan menggunakan = " + singa.getIndraPendengar());
        System.out.println(singa.getNama() + "Mengeluarkan suara dengan mengaung = " + singa.getSuara());

    }

}
