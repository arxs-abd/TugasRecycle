package com.example.tugasrycycle;

import android.content.res.Resources;

import java.util.ArrayList;

public class AnimalData {
    static Resources res = MainActivity.getResource();
    private static String name[] = {
        "Singa",
        "Harimau",
        "Semut",
        "Gajah",
        "Elang",
        "Paus Bungkuk",
        "Hiu",
        "Sapi",
        "Ayam",
        "Panda"
    };

//    private static String detailsx[] = {
//            res.getString(R.string.animal_singa),
//            res.getString(R.string.animal_harimau),
//            res.getString(R.string.animal_semut),
//            res.getString(R.string.animal_gajah),
//            res.getString(R.string.animal_elang),
//            res.getString(R.string.animal_pausBungkuk),
//            res.getString(R.string.animal_hiu),
//            res.getString(R.string.animal_sapi),
//            res.getString(R.string.animal_ayam),
//            res.getString(R.string.animal_panda),
//    };
    private static String details[] = {
            "Harimau dikenal sebagai kucing terbesar, harimau berukuran seperti singa tetapi sedikit lebih berat. Beda subspesies harimau memiliki karakteristik yang berbeda juga, pada umumnya harimau jantan memiliki berat antara 180 dan 320 kg dan betina berbobot antara 120 dan 180 kg. Panjang jantan antara 2,6 dan 3,3 meter, sedangkan betina antara 2,3 dan 2,75 meter. Di antara subspesies yang masih hidup, harimau sumatra adalah yang paling kecil dan harimau siberia yang paling besar.",
    "Singa (bahasa Sanskerta: Siṃha, atau nama ilmiahnya Panthera leo) adalah spesies hewan dari keluarga felidae atau jenis kucing. Singa merupakan hewan yang hidup berkelompok. Biasanya terdiri dari seekor jantan dan banyak betina. Kelompok ini menjaga daerah kekuasaannya. Umur singa antara 10 sampai 15 tahun di alam bebas, tetapi dalam penangkaran memungkinkan lebih dari 20 tahun.",
    "Semut adalah semua serangga anggota suku Formicidae, bangsa Hymenoptera. Semut memiliki lebih dari 12.500 jenis (spesies), yang sebagian besar hidup di kawasan tropika. Sebagian besar semut dikenal sebagai serangga sosial, dengan koloni dan sarang-sarangnya yang teratur beranggotakan ribuan semut per koloni. Anggota koloni terbagi menjadi semut pekerja, semut pejantan, dan ratu semut. Dimungkinkan pula terdapat kelompok semut penjaga. Satu koloni dapat menguasai daerah yang luas untuk mendukung kehidupan mereka. Koloni semut kadang kala disebut superorganisme karena koloni-koloni mereka yang membentuk sebuah kesatuan.",
    "Gajah adalah mamalia besar dari famili Elephantidae dan ordo Proboscidea. Secara tradisional, terdapat dua spesies yang diakui, yaitu gajah afrika (Loxodonta africana) dan gajah asia (Elephas maximus), walaupun beberapa bukti menunjukkan bahwa gajah semak afrika dan gajah hutan afrika merupakan spesies yang berbeda (L. africana dan L. cyclotis). Gajah tersebar di seluruh Afrika sub-Sahara, Asia Selatan, dan Asia Tenggara. Elephantidae adalah satu-satunya famili dari ordo Proboscidea yang masih ada; famili lain yang kini sudah punah termasuk mamut dan mastodon. Gajah afrika jantan merupakan hewan darat terbesar dengan tinggi hingga 4 m dan massa yang juga dapat mencapai 7.000 kg.",
    "Elang merupakan salah satu dari hewan yang terdapat di seluruh Indonesia. Dalam Bahasa inggris, eagle atau elang merujuk pada burung pemangsa berukuran besar dari suku Accipitridae terutama genus Aquila. Sementara itu burung-burung pemangsa yang lebih kecil dalam Daftar Burung Indonesia nomor 2 disebut Elang-alap (Hawk, genus Accipiter).",
    "Paus bungkuk (Megaptera novaeangliae) adalah paus balin, salah satu spesies rorqual terbesar, panjang paus bungkuk dewasa sebesar 12-16 meter dan memiliki berat 36.000 kilogram. Paus bungkuk memiliki bentuk tubuh yang istimewa, dengan sirip dada panjang dan kepala menonjol. Hewan ini adalah hewan akrobatik, sering muncul di permukaan air. Jantan mengeluarkan lagu yang terdengar selama 10 sampai 20 menit dan diulang untuk beberapa jam pada satu waktu. Peran lagu ini belum diketahui, walaupun sepertinya memiliki peran dalam berpasangan.",
    "Ikan Hiu adalah sekelompok (superordo Selachimorpha) ikan dengan kerangka tulang rawan yang lengkap dan tubuh yang ramping. Mereka bernapas dengan menggunakan lima liang insang (kadang-kadang enam atau tujuh, tergantung pada spesiesnya) di samping, atau dimulai sedikit di belakang, kepalanya. Hiu mempunyai tubuh yang dilapisi kulit dermal denticles untuk melindungi kulit mereka dari kerusakan, dari parasit, dan untuk menambah dinamika air. Mereka mempunyai beberapa deret gigi yang dapat digantikan.",
    "Sapi adalah hewan ternak anggota suku Bovidae dan anak suku Bovinae. Sapi yang telah dikebiri dan biasanya digunakan untuk membajak sawah dinamakan lembu. Sapi dipelihara terutama untuk dimanfaatkan susu dan dagingnya sebagai pangan manusia. Hasil sampingannya seperti kulit, jeroan, tanduk, dan kotorannya juga dimanfaatkan untuk berbagai keperluan manusia. Di sejumlah tempat, sapi juga dipakai sebagai penggerak alat transportasi, pengolahan lahan tanam (bajak), dan alat industri lain (seperti peremas tebu). Karena banyak kegunaan ini, sapi telah menjadi bagian dari berbagai kebudayaan manusia sejak lama.",
    "Ayam (Gallus gallus domesticus) adalah unggas yang biasa dipelihara orang untuk dimanfaatkan untuk keperluan hidup pemeliharanya. Ayam peliharaan (selanjutnya disingkat ayam saja) merupakan keturunan langsung dari salah satu subspesies ayam hutan yang dikenal sebagai ayam hutan merah (Gallus gallus) atau ayam bangkiwa (bankiva fowl). Semua ayam merupakan theropoda seperti tyrannosaurus. Kawin silang antarras ayam telah menghasilkan ratusan galur unggul atau galur murni dengan bermacam-macam fungsi; yang paling umum adalah ayam potong (untuk dipotong) dan ayam petelur (untuk diambil telurnya). Ayam biasa dapat pula dikawin silang dengan kerabat dekatnya, ayam hutan hijau, yang menghasilkan hibrida mandul yang jantannya dikenal sebagai ayam bekisar.",
    "Panda Raksasa (Ailuropoda melanoleuca, berarti Kaki-kucing hitam-putih; Hanzi sederhana: 大熊猫; Hanzi tradisional: 大熊貓; Pinyin: dà xióng māo; Jyutping: daai6 hung4 maau1, berarti kucing beruang besar) atau diringkas Panda, adalah seekor mamalia yang biasanya diklasifikasikan ke dalam keluarga beruang, Ursidae, yang merupakan hewan asli Tiongkok Tengah. Panda Raksasa tinggal di wilayah pegunungan, seperti Sichuan dan Tibet. Pada setengah abad ke-20 terakhir, panda menjadi semacam lambang negara Tiongkok, dan sekarang ditampilkan pada uang emas negara tersebut."

};

    private static int image[] = {
            R.drawable.singa,
            R.drawable.harimau,
            R.drawable.semut,
            R.drawable.gajah,
            R.drawable.elang,
            R.drawable.paus,
            R.drawable.hiu,
            R.drawable.sapi,
            R.drawable.ayam,
            R.drawable.panda,
    };

    static ArrayList<Animal> getListData() {
        ArrayList<Animal> list = new ArrayList<>();
        for (int position = 0; position < name.length; position++) {
            Animal anim = new Animal(name[position], details[position], image[position]);
            list.add(anim);
        }
        return list;
    }
}
