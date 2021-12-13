package grade.nilai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author angga
 */
public class GradeNilai {
    
    static ArrayList<Siswa> students = new ArrayList<>();
    
    public static String menuUtama(){
        return new StringBuilder()
            .append("================= Menu =================")
            .append("\n 1. Tambah Siswa")
            .append("\n 2. Tampilkan Siswa")
            .append("\n 3. Tampilkan Berdasarkan Dengan Id Siswa")
            .append("\n 0. Keluar")
            .toString();   
    }
    
    public static int getRandom(){
        Random random = new Random();
        return random.nextInt(9999);
    }
    
    public static void getSiswa(){
        for(int i = 0; i < students.size(); i++){
            if(i == students.size()-1){
                System.out.print(students.get(i).getNama() + " (" + students.get(i).getId() + ")");
            } else {
                System.out.print(students.get(i).getNama() + " (" + students.get(i).getId() + "), ");
            }
        }
    }
    
    public static void getDetail(int id){
        students.forEach(value -> {
            if(value.getId() == id){
                value.getProfile();
            }
        });
    }

    public static String menuTampilkanSiswa(){
        return new StringBuilder()
            .append("================= Menu =================")
            .append("\n 1. Tampilkan Profile")
            .append("\n 2. Ubah Nama")
            .append("\n 3. Ubah NIM")
            .append("\n 4. Ubah Salah Satu Nilai")
            .append("\n 5. Ubah Seluruh Nilai")
            .append("\n 0. Kembali")
            .toString();   
    }    

    public static void tampilkanNilai(int id) {
        ArrayList<Integer> nilai = new ArrayList<>();
        for(Siswa student : students){
            if(student.getId() == id){
                nilai = student.getNilai();
                for(int i = 0; i <  nilai.size(); i++){
                    System.out.println(i+1 + ". " + nilai.get(i));
                }
            }
        }
    }
    
    public static void main(String[] args) {
        try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))){
            int opt, optSiswa;
            do{
                String nama;
                int nim, nilaiBaru;
                ArrayList<Integer> nilai = new ArrayList<>();
                System.out.println(menuUtama());
                System.out.print("Pilih Menu : "); opt = Integer.parseInt(input.readLine());
                switch(opt){
                    case 1:
                        System.out.print("Masukkan Nama Anda : "); nama = input.readLine();
                        System.out.print("Masukkan NIM Anda : "); nim = Integer.parseInt(input.readLine());
                        for(int i = 1; i <= 3; i++){
                            System.out.print("Masukkan nilai ke-" + i + " : ");
                            int temp = Integer.parseInt(input.readLine());
                            nilai.add(temp);
                        }
                        students.add(new Siswa(getRandom(), nama, nim, nilai));
                        System.out.println("\nData berhasil ditambahkan!");
                        break;
                    case 2:
                        getSiswa();
                        System.out.print("\n");
                        break;
                    case 3:
                        getSiswa();
                        System.out.print("\nMasukkan Id Siswa : "); int id = Integer.parseInt(input.readLine());
                        System.out.print("\n");
                        do {
                            System.out.println(menuTampilkanSiswa());
                            System.out.print("Pilih Menu : "); optSiswa = Integer.parseInt(input.readLine());
                            switch(optSiswa){
                                case 1:
                                    getDetail(id);                                
                                    break;
                                case 2:
                                    System.out.print("Masukkan Nama Baru : "); nama = input.readLine();
                                    for(Siswa student:students){
                                        if(student.getId() == id){
                                            student.setNama(nama);
                                        }
                                    }
                                    System.out.println("\nNama berhasil diperbaharui!");
                                    break;
                                case 3:
                                    System.out.print("Masukkan NIM Baru : "); nim = Integer.parseInt(input.readLine());
                                    for(Siswa student:students){
                                        if(student.getId() == id){
                                            student.setNim(nim);
                                        }
                                    }
                                    System.out.println("\nNIM berhasil diperbaharui!");
                                    break;
                                case 4:
                                    tampilkanNilai(id);
                                    System.out.print("Masukkan Nilai Keberapa Yang Akan Diubah : "); nim = Integer.parseInt(input.readLine());
                                    System.out.print("Nilai Terbaru : "); nilaiBaru = Integer.parseInt(input.readLine());
                                    for(Siswa student:students){
                                        if(student.getId() == id){
                                            student.setNilai(nim-1, nilaiBaru);
                                        }
                                    }
                                    System.out.println("\nNilai berhasil diperbaharui!");
                                    break;
                                case 5:
                                    tampilkanNilai(id);
                                    for(Siswa student:students){
                                        if(student.getId() == id){
                                            for(int i = 0; i < student.getNilai().size(); i++){
                                                System.out.print("Masukkan nilai ke-" + (i+1) + " : "); nilaiBaru = Integer.parseInt(input.readLine());
                                                student.setNilai(i, nilaiBaru);
                                            }
                                        }
                                    }
                                    System.out.println("\nSeluruh nilai berhasil diperbaharui!");
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.print("Menu tidak ditemukan!");
                                    break;
                            }
                            System.out.print("\n");
                        } while(optSiswa != 0);
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Menu tidak ditemukan!");
                        break;
                }
                System.out.print("\n");
            } while(opt != 0);
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
