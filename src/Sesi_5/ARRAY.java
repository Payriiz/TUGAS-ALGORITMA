package Sesi_5;

public class ARRAY {
    public static void main(String[] args) {
        //ARRAY SELALU MULAI DARI 0
        String mahasiswa [] = {
            "Upa","Aris","kacau","saha","nunanya","anjay"
        };

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println(mahasiswa[i]);
        }

        // for (String mhs: mahasiswa) {
        //     System.out.println(mhs);
        // }
    }
}
