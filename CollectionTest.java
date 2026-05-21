// Mengimpor semua alat (List, ArrayList, Map, dll) dari folder util

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionTest {
    public static void main(String[] args) {
        
        System.out.println("Sistem Siap! Mari kita panggil Collections!");
        // Ketik kodenya di halaman selanjutnya di dalam main() ini!

         // 1. DEKLARASI ARRAYLIST (Upcasting ke List)
        // <String> memastikan tas ini cuma bisa diisi String.
        List<String> tas = new ArrayList<>();

        // 2. MENAMBAH DATA (.add)
        tas.add("Pedang Emas");
        tas.add("Ramuan Darah");
        tas.add("Pedang Emas"); // Item kembar? ArrayList nggak peduli! Lanjut!

        System.out.println("--- ISI ARRAYLIST ---");

         // 3. MENGAKSES DAN MELOOPING (.size & .get)
        for (int i = 0; i < tas.size(); i++) {
            System.out.println("Slot " + i + ": " + tas.get(i));
        }
        // 4. MEMBUANG DATA (.remove)
        tas.remove("Ramuan Darah"); // Langsung hilang dari memori!

        System.out.println("--- ISI ARRAYLIST setelah dihapus ---");
        for (int i = 0; i < tas.size(); i++) {
            System.out.println("Slot " + i + ": " + tas.get(i));
        }

         // 1. DEKLARASI HASHSET
        Set<String> daftarNik = new HashSet<>();
           // 2. MENGISI DATA UNIK
        daftarNik.add("USER-001");
        daftarNik.add("USER-002");
         // 3. UJI COBA HACKING (Memasukkan data kembar)
        daftarNik.add("USER-001"); // Sistem Set akan membanting pintu (Ditolak diam-diam!)
        
        System.out.println("\n--- ISI HASHSET ---");
        
        // 4. FOREACH LOOP (Karena Set tidak punya Index (i), harus pakai Foreach)
        // Cara baca: "Keluarkan setiap String 'nik' dari dalam kumpulan 'daftarNik'"
        for (String nik : daftarNik) {
            System.out.println("NIK Valid: " + nik);
        }
        // Cek outputmu nanti! Cuma akan ada dua NIK yang tercetak.

        // 1. DEKLARASI HASHMAP
        // Butuh 2 Generics: <TipeKey, TipeValue>. 
        // Ingat! Tidak boleh int, harus pakai Wrapper Class (Integer)
        Map<String, Integer> dataPemain = new HashMap<>();

        // 2. MEMASUKKAN DATA (Pakai .put, BUKAN .add)
        dataPemain.put("Ucok", 90); // Key: "Ucok", Value (Skor): 90
        dataPemain.put("Siti", 85);

        System.out.println("\n--- ISI HASHMAP ---");
        
        // 3. MENGAMBIL DATA SPESIFIK SECARA INSTAN (.get)
        // Gak perlu looping! Langsung panggil nama (Key)-nya.
        System.out.println("Skor si Ucok adalah: " + dataPemain.get("Ucok"));

        // 4. MENGGANTI DATA LAMA
        dataPemain.put("Ucok", 100); // Karena Key "Ucok" sudah ada, skor 90 DITIMPA jadi 100
        System.out.println("Skor Ucok setelah curang: " + dataPemain.get("Ucok"));

    }
}