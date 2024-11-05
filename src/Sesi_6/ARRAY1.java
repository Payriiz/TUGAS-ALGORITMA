package Sesi_6;

public class ARRAY1 {
    public static void main(String[] args) {
        String[][][] mahasiswa = {
                {
                        { "Putra", "Naban", "Regi", "Dwi" },
                        { "Zaim", "Null", "Robby", "Revan" }
                },

                {
                        { "Januar", "Naufal", "Gidzan", "Hamudi", "Ibnu" },
                        { "Deni", "Ilham", "Ade", "Teuing", "Ananda" }
                },

                {
                        { "Luqman", "Teuing", "Rizky", "Alex" },
                        { "Asril", "Saha", "Hafidz", "Mato" }
                },

                {
                        { "Salwa", "Jibril", "Esa", "Isti" },
                        { "Restu", "Rosya", "Naura", "Zaskia" }
                }
        };
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("BARIS " + (i + 1) + ":");
            for (int j = 0; j < mahasiswa[i].length; j++) {
                System.out.println("KELOMPOK " + (j + 1) + ":");
                for (int j2 = 0; j2 < mahasiswa[i][j].length; j2++) {
                    System.out.print(mahasiswa[i][j][j2] + " ");
                }
                System.out.println();
            }
        }
    }
}
