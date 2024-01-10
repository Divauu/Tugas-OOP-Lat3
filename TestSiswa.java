package ClassPBO.Enkapsulasi.Latihan3;

public class TestSiswa {
    public static void main(String[] args) {
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Agus");
        siswa.setAge(20);
        siswa.setAddress("Malang");

        System.out.println("Nama: "+siswa.getName() + " alamat "+siswa.getAddress() + " berumur "+siswa.getAge() + " tahun");
    }
}
