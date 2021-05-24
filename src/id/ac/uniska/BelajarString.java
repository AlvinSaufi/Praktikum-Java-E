package id.ac.uniska;

public class BelajarString {
    public static void main(String[] args) {
    char[] uniskaChar = {'U', 'N', 'I', 'S', 'K', 'A'};
    String uniskaString = new String(uniskaChar);
    System.out.println(uniskaString);


    //#############################################################################################

        String namaDepan         = "Alvin";
        String namaTengah        = "Saufi";
        String namaBelakang      = "Iskandar";

        String namaLengkap = namaDepan + " "+ namaTengah+ " "+ namaBelakang;

        System.out.println(namaLengkap.length()); // mengetahui panjang karakter
        System.out.println(namaBelakang.indexOf("NIS"));
        System.out.println(namaLengkap.substring(5)); // menghilangkan karakter dari depan sebanyak n
        System.out.println(namaLengkap.substring(5, 12)); // menghilangkan karakter dari depan dan belakang sebanyak n
        System.out.println(namaLengkap.replace("Saufi", "Yudhi")); // mereplace target dengan string yang diberikan
        System.out.println(namaLengkap.toUpperCase());
        System.out.println(namaLengkap.toLowerCase());
        System.out.println(namaLengkap.charAt(3));

        String[]namaArray = namaLengkap.split(" ");
        System.out.println(namaArray.length);
        for (String nama : namaArray)
        {
            System.out.println(nama);
        }
    }
}
