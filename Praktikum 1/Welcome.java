/**
2 * This program displays a greeting for the reader.
3 * @version 1.30 2014-02-27
4 * @author Cay Horstmann
5 */

public class Welcome
{
    public static void main(String[] args)
    {
        String greeting = "Welcome to Core Java!";          //Mendeklarasikan variabel greeting serta menginputnya dengan "Welcome to Core Java!"
        System.out.println(greeting);                       //Mencetak variabel greeting ke dalam Terminal
        for (int i = 0; i < greeting.length(); i++)         //Memulai iterasi(perulangan) pada isi dari variabel greeting
        System.out.print("=");                            //Mencetak = sebanyak iterasi yang dilakukan
        System.out.println();                               //Mencetak baris baru setelah iterasi
    }
}