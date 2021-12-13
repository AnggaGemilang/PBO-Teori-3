package enkapsulasi.dan.objek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author angga
 */
public class Main {
    
    static ArrayList<Siswa> students = new ArrayList<>();
    static ArrayList<Guru> teachers = new ArrayList<>();
    static ArrayList<MataPelajaran> subjects = new ArrayList<>();

    public static String menuUtama(){
        return new StringBuilder()
            .append("================= Menu =================")
            .append("\n 1. Kelola Siswa")
            .append("\n 2. Kelola Guru")
            .append("\n 3. Kelola Mata Pelajaran")
            .append("\n 0. Keluar")
            .toString();
    }

    public static String menuSiswa(){
        return new StringBuilder()
            .append("\n================= Menu =================")
            .append("\n 1. Tambah Siswa")
            .append("\n 2. Tampilkan Siswa")
            .append("\n 3. Tampilkan Berdasarkan Dengan Id Siswa")
            .append("\n 0. Kembali")
            .toString();   
    }
    
    public static String menuDetailSiswa(){
        return new StringBuilder()
            .append("\n================= Menu =================")
            .append("\n 1. Tampilkan Profile")
            .append("\n 2. Ubah Nama")
            .append("\n 3. Ubah NIM")
            .append("\n 4. Ubah Salah Satu Nilai")
            .append("\n 5. Ubah Seluruh Nilai")
            .append("\n 0. Kembali")
            .toString();   
    }

    public static String menuGuru(){
        return new StringBuilder()
            .append("\n================= Menu =================")
            .append("\n 1. Tambah Guru")
            .append("\n 2. Tampilkan Guru")
            .append("\n 3. Tampilkan Berdasarkan Dengan Id Guru")
            .append("\n 0. Kembali")
            .toString();   
    }
    
    public static String menuDetailGuru(){
        return new StringBuilder()
            .append("\n================= Menu =================")
            .append("\n 1. Tampilkan Profile")
            .append("\n 2. Ubah Nama")
            .append("\n 3. Ubah NIP")
            .append("\n 4. Ubah Mata Pelajaran")
            .append("\n 0. Kembali")
            .toString();   
    }
    
    public static String menuMataPelajaran(){
        return new StringBuilder()
            .append("\n================= Menu =================")
            .append("\n 1. Tambah Mata Pelajaran")
            .append("\n 2. Tampilkan Mata Pelajaran")
            .append("\n 3. Tampilkan Berdasarkan Dengan Id Mata Pelajaran")
            .append("\n 0. Kembali")
            .toString();   
    }
    
    public static String menuDetailMataPelajaran(){
        return new StringBuilder()
            .append("\n================= Menu =================")
            .append("\n 1. Tampilkan Profile")
            .append("\n 2. Ubah Nama")
            .append("\n 3. Ubah Tipe Pelajaran")
            .append("\n 4. Tambah Guru")
            .append("\n 5. Hapus Guru")
            .append("\n 0. Kembali")
            .toString();
    }
    
    public static int getRandom(){
        Random random = new Random();
        return random.nextInt(9999);
    }
    
    public static void getDetail(String data, int id){
        switch(data){
            case "students":
                students.forEach(value -> {
                    if(value.getId() == id){
                        value.getProfile();
                    }
                });
                break;
            case "teachers":
                teachers.forEach(value -> {
                    if(value.getId() == id){
                        value.getProfile();
                    }
                });
                break;
            case "subjects":
                subjects.forEach(value -> {
                    if(value.getId() == id){
                        value.getProfile();
                    }
                });
                break;
        }
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

    public static void tampilkanGuru(int id) {
        for(MataPelajaran subject : subjects){
            if(subject.getId() == id){
                for(int i = 0; i < subject.getGuru().size(); i++){
                    System.out.println(i+1 + ". " + teachers.get(i).nama);
                }
            }
        }            
    }
    
    public static void getData(String data){
        switch(data){
            case "students" :
                if(!students.isEmpty()){
                    for(int i = 0; i < students.size(); i++){
                        if(i == students.size()-1){
                            System.out.print(students.get(i).getNama() + " (" + students.get(i).getId() + ")");
                        } else {
                            System.out.print(students.get(i).getNama() + " (" + students.get(i).getId() + "), ");
                        }
                    }       
                } else {
                    System.out.println("Data masih kosong");
                }
                break;
            case "teachers" :
                if(!teachers.isEmpty()){
                    for(int i = 0; i < teachers.size(); i++){
                        if(i == teachers.size()-1){
                            System.out.print(teachers.get(i).getNama() + " (" + teachers.get(i).getId() + ")");
                        } else {
                            System.out.print(teachers.get(i).getNama() + " (" + teachers.get(i).getId() + "), ");
                        }
                    }                        
                } else {
                    System.out.println("Data masih kosong");
                }
                break;
            case "subjects" :
                if(!subjects.isEmpty()){
                    for(int i = 0; i < subjects.size(); i++){
                        if(i == subjects.size()-1){
                            System.out.print(subjects.get(i).getNama() + " (" + subjects.get(i).getId() + ")");
                        } else {
                            System.out.print(subjects.get(i).getNama() + " (" + subjects.get(i).getId() + "), ");
                        }
                    }
                } else {
                    System.out.print("Data masih kosong");
                }            
                break;
        }
    }
    
    public static void main(String[] args) {
        try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))){
            int opt, opt2, opt3, in, in2, in3, in4, in5;
            String str, str2, str3, str4, str5, str6;
            do {
                ArrayList<Integer> nilai = new ArrayList<>();
                System.out.println(menuUtama());
                System.out.print("Pilih Menu : "); opt = Integer.parseInt(input.readLine());
                switch(opt){
                    case 1:
                        do{
                            System.out.println(menuSiswa());
                            System.out.print("Pilih Menu : "); opt2 = Integer.parseInt(input.readLine());
                            switch(opt2){
                                case 1:
                                    System.out.print("Masukkan Nama Anda : "); str = input.readLine();
                                    System.out.print("Masukkan Tempat Tanggal Lahir : "); str2 = input.readLine();
                                    System.out.print("Masukkan Alamat : "); str3 = input.readLine();
                                    System.out.print("Masukkan Nomor Telepon : "); str4 = input.readLine();
                                    System.out.print("Masukkan NIM Anda : "); in = Integer.parseInt(input.readLine());
                                    for(int i = 1; i <= 3; i++){
                                        System.out.print("Masukkan nilai ke-" + i + " : ");
                                        int temp = Integer.parseInt(input.readLine());
                                        nilai.add(temp);
                                    }
                                    students.add(new Siswa(getRandom(), str, str2, str3, str4, in, nilai));
                                    System.out.println("Data berhasil ditambahkan!");
                                    break;
                                case 2:
                                    getData("students");
                                    System.out.print("\n");
                                    break;
                                case 3:
                                    getData("students");
                                    System.out.print("\nMasukkan Id Siswa : "); int id = Integer.parseInt(input.readLine());
                                    do {
                                        System.out.println(menuDetailSiswa());
                                        System.out.print("Pilih Menu : "); opt3 = Integer.parseInt(input.readLine());
                                        switch(opt3){
                                            case 1:
                                                getDetail("students", id);                                
                                                break;
                                            case 2:
                                                System.out.print("Masukkan Nama Baru : "); str = input.readLine();
                                                for(Siswa student:students){
                                                    if(student.getId() == id){
                                                        student.setNama(str);
                                                    }
                                                }
                                                System.out.println("Nama berhasil diperbaharui!");
                                                break;
                                            case 3:
                                                System.out.print("Masukkan NIM Baru : "); in = Integer.parseInt(input.readLine());
                                                for(Siswa student:students){
                                                    if(student.getId() == id){
                                                        student.setNim(in);
                                                    }
                                                }
                                                System.out.println("NIM berhasil diperbaharui!");
                                                break;
                                            case 4:
                                                tampilkanNilai(id);
                                                System.out.print("Masukkan Nilai Keberapa Yang Akan Diubah : "); in = Integer.parseInt(input.readLine());
                                                System.out.print("Nilai Terbaru : "); in2 = Integer.parseInt(input.readLine());
                                                for(Siswa student:students){
                                                    if(student.getId() == id){
                                                        student.setNilai(in-1, in2);
                                                    }
                                                }
                                                System.out.println("Nilai berhasil diperbaharui!");
                                                break;
                                            case 5:
                                                tampilkanNilai(id);
                                                for(Siswa student:students){
                                                    if(student.getId() == id){
                                                        for(int i = 0; i < student.getNilai().size(); i++){
                                                            System.out.print("Masukkan nilai ke-" + (i+1) + " : "); in = Integer.parseInt(input.readLine());
                                                            student.setNilai(i, in);
                                                        }
                                                    }
                                                }
                                                System.out.println("Seluruh nilai berhasil diperbaharui!");
                                                break;
                                            case 0:
                                                break;
                                            default:
                                                System.out.print("Menu tidak ditemukan!");
                                                break;
                                        }
                                    } while(opt3 != 0);
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("Menu tidak ditemukan!");
                                    break;
                            }
                        }while(opt2 != 0);
                        break;
                    case 2:
                       do{
                            System.out.println(menuGuru());
                            System.out.print("Pilih Menu : "); opt2 = Integer.parseInt(input.readLine());
                            switch(opt2){
                                case 1:
                                    System.out.print("Masukkan Nama Anda : "); str = input.readLine();
                                    System.out.print("Masukkan Tempat Tanggal Lahir : "); str2 = input.readLine();
                                    System.out.print("Masukkan Alamat : "); str3 = input.readLine();
                                    System.out.print("Masukkan Nomor Telepon : "); str4 = input.readLine();
                                    System.out.print("Masukkan NIP Anda : "); in = Integer.parseInt(input.readLine());
                                    getData("subjects");
                                    System.out.print("\nMasukkan Id : "); in = Integer.parseInt(input.readLine());
                                    for(MataPelajaran subject : subjects){
                                        if(subject.getId() == in){
                                            teachers.add(new Guru(getRandom(), str, str2, str3, str4, in, subject));
                                        }
                                    }
                                    System.out.println("Data berhasil ditambahkan!");
                                    break;
                                case 2:
                                    getData("teachers");
                                    System.out.print("\n");
                                    break;
                                case 3:
                                    getData("teachers");
                                    System.out.print("\nMasukkan Id Guru : "); int id = Integer.parseInt(input.readLine());
                                    do {
                                        System.out.println(menuDetailGuru());
                                        System.out.print("Pilih Menu : "); opt3 = Integer.parseInt(input.readLine());
                                        switch(opt3){
                                            case 1:
                                                getDetail("teachers", id);                                
                                                break;
                                            case 2:
                                                System.out.print("Masukkan Nama Baru : "); str = input.readLine();
                                                for(Guru teacher : teachers){
                                                    if(teacher.getId() == id){
                                                        teacher.setNama(str);
                                                    }
                                                }
                                                System.out.println("Nama berhasil diperbaharui!");
                                                break;
                                            case 3:
                                                System.out.print("Masukkan NIP Baru : "); in = Integer.parseInt(input.readLine());
                                                for(Guru teacher : teachers){
                                                    if(teacher.getId() == id){
                                                        teacher.setNip(in);
                                                    }
                                                }
                                                System.out.println("NIP berhasil diperbaharui!");
                                                break;
                                            case 4:
                                                getData("subjects");
                                                System.out.print("\nMasukkan Id : "); in = Integer.parseInt(input.readLine());
                                                for(MataPelajaran subject : subjects){
                                                    if(subject.getId() == in){
                                                        for(Guru teacher : teachers){
                                                            if(teacher.getId() == id){
                                                                teacher.setMataPelajaran(subject);
                                                            }
                                                        }
                                                    }
                                                }
                                                System.out.println("Mata Pelajaran berhasil diperbaharui!");
                                                break;
                                            case 0:
                                                break;
                                            default:
                                                System.out.print("Menu tidak ditemukan!");
                                                break;
                                        }
                                    } while(opt3 != 0);
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("Menu tidak ditemukan!");
                                    break;
                            }
                        }while(opt2 != 0);
                        break;
                    case 3:
                        do{
                            System.out.println(menuMataPelajaran());
                            System.out.print("Pilih Menu : "); opt2 = Integer.parseInt(input.readLine());
                            switch(opt2){
                                case 1:
                                    System.out.print("Masukkan Nama Pelajaran : "); str = input.readLine();
                                    System.out.print("Masukkan Tipe Pelajaran : "); str2 = input.readLine();
                                    subjects.add(new MataPelajaran(getRandom(), str, str2));
                                    System.out.println("Data berhasil ditambahkan!");
                                    break;
                                case 2:
                                    getData("subjects");
                                    System.out.print("\n");
                                    break;
                                case 3:
                                    getData("subjects");
                                    System.out.print("\nMasukkan Id Mata Pelajaran : "); int id = Integer.parseInt(input.readLine());
                                    do {
                                        System.out.println(menuDetailMataPelajaran());
                                        System.out.print("Pilih Menu : "); opt3 = Integer.parseInt(input.readLine());
                                        switch(opt3){
                                            case 1:
                                                getDetail("subjects", id);                                
                                                break;
                                            case 2:
                                                System.out.print("Masukkan Nama Baru : "); str = input.readLine();
                                                for(MataPelajaran subject : subjects){
                                                    if(subject.getId() == id){
                                                        subject.setNama(str);
                                                    }
                                                }
                                                System.out.println("Nama berhasil diperbaharui!");
                                                break;
                                            case 3:
                                                System.out.print("Masukkan Tipe Pelajaran Baru : "); str = input.readLine();
                                                for(MataPelajaran subject : subjects){
                                                    if(subject.getId() == id){
                                                        subject.setTipePelajaran(str);
                                                    }
                                                }
                                                System.out.println("Tipe Pelajaran berhasil diperbaharui!");
                                                break;
                                            case 4:
                                                getData("teachers");
                                                System.out.print("\nMasukkan Id : "); in = Integer.parseInt(input.readLine());
                                                for(Guru teacher : teachers){
                                                    if(teacher.getId() == in){
                                                        for(MataPelajaran subject : subjects){
                                                            if(subject.getId() == id){
                                                                subject.setGuru(teacher);
                                                            }
                                                        }
                                                    }
                                                }
                                                System.out.println("Guru berhasil ditambah!");
                                                break;
                                            case 5:
                                                tampilkanGuru(id);
                                                System.out.print("\nPilih guru yang dihapus : "); in = Integer.parseInt(input.readLine());
                                                for(MataPelajaran subject : subjects){
                                                    if(subject.getId() == id){
                                                        subject.deleteGuru(in-1);
                                                    }
                                                }
                                                System.out.println("Guru berhasil dihapus!");
                                                break;
                                            case 0:
                                                break;
                                            default:
                                                System.out.print("Menu tidak ditemukan!");
                                                break;
                                        }
                                    } while(opt3 != 0);
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("Menu tidak ditemukan!");
                                    break;
                            }
                        }while(opt2 != 0);
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
            System.out.println(e.getMessage());
        }
    }
}
