import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        ArrayList<String> nama = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean selesai = false;
        while(!selesai) {
            boolean valid = false;
            while(!valid) {
                try {
                    System.out.print("Masukan Nama :");
                    String temp = input.nextLine();
                    valid = validate(temp);
                    if(temp.equalsIgnoreCase("selesai")){
                        selesai = true;
                    }else{
                        nama.add(temp);
                    }
                } catch (errmassage e) {
                    System.err.println(e.getMessage());
                }
            }
        }
        System.out.println("Daftar Nama Mahasiswa :");
        for (int i = 0; i < nama.size(); i++) {
            System.out.println(nama.get(i));
        }
        input.close();
    }

    public static boolean validate(String nama) throws errmassage{
        if (nama.isEmpty()) {
            throw new errmassage("Nama Tidak Boleh Kosong");
        }
        return true;
    }
}
