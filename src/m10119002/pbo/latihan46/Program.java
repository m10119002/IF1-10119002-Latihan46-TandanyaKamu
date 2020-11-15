/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan46;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program tandanya kamu
 * (OBJECT ORIENTED)
 * 
 */
public class Program {
    private static Scanner scanner = new Scanner(System.in);
    private static String input = new String();
    private static boolean status;
    private static Age age = new Age(Year.now().getValue());
	
    private static boolean cekParsing(String test) {
        try {
            Integer.parseInt(test);
            return true;
        } catch (NumberFormatException ex) {
            System.err.println("Pastikan tidak mengandung huruf atau simbol!");
            return false;
        } catch (Exception ex) {
            System.err.println("System error");
            return false;
        }
    }
    
    private static boolean masukkanTahunLahir() {
        System.out.print("Masukkan Tahun Lahir Anda : ");
        input = scanner.nextLine();
        return cekParsing(input);
    }
    
    private static void tampilHasilHitung() {
        System.out.println("======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : ".
                concat(Integer.toString(age.getYearBirth())));
        System.out.println("Hari ini tahun : ".
                concat(Integer.toString(age.getYearNow())));
        System.out.println("Umur kamu sampai hari ini adalah ".
                concat(Integer.toString(age.hitungUmur())).concat(" tahun"));
        System.out.println("Tandanya Kamu ".
                concat(age.tandanyaKamu(age.hitungUmur())));
    }
    
    public static void main(String[] args) {
        status = false;
        while(!status) status = masukkanTahunLahir();
        age.setYearBirth(Integer.parseInt(input));
        System.out.println("");
        tampilHasilHitung();
    }
}
