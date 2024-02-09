/*
 * Penulis : Nobby Dharma Khaulid
 * Tanggal : 09-02-2024
 * Tujuan  : Latihan soal praktikum 
 */

 public class Soal2 
 {
    public static void main (String[] args)
    {
        int i = 42;                                                     //Mendeklarasikan variabel i serta menginisialisasinya dengan nilai 42
        String s = (i<40)?"life":(i>50)?"universe":"everything";        //Mendeklarasikan string s dengan nilai variabel 1 serta terdapat kondisi dimana ketika variabel i bernilai kurang dari 40 maka akan diisi "life", ketika lebih dari 50 akan diisi "univere", jika tidak keduanya akan diisi "everything"
        System.out.println(s);                                          //Mencetak Isi dari variabel s
    }
 }