package id.ac.uniska;

import javax.swing.*;
import java.util.Scanner;

public class BelajarInput {
}
    public static void main(String[] args) {

    String namaLengkap; // null

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama Anda : ");
        namaLengkap = input.nextLine(); // string

        JOptionPane.showMessageDialog(
                null, "Hallo "+namaLengkap, "Informasi", JOptionPane.INFORMATION_MESSAGE);
        );
    }
}