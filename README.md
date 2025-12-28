# Sugar Sling Game 🍬🚀

SugarSlingGame adalah permainan berbasis Java yang menggabungkan elemen aksi dan strategi. Project ini dibangun menggunakan konsep **Object-Oriented Programming (OOP)** dengan arsitektur **MVVM** untuk memisahkan logika bisnis, data, dan tampilan.

## 🎮 Fitur Utama
- **Gameplay Dinamis:** Mekanik menembak atau melontarkan lasson untuk menarik objek (Pokemon) untuk mendapatkan score sebanyak mungkin.
- **Sistem Skor:** Setiap objek/Pokemon memiliki nilai (value) yang berbeda-beda. Strategi sangat diperlukan untuk memilih target dengan skor tertinggi!
- **Mekanik Lasso:** Pemain menarik objek dengan cara mengklik target. Lasso akan menangkap dan menarik objek tersebut secara otomatis ke dalam keranjang.
- **Akumulasi Skor:** Skor akan terus dijumlahkan setiap kali objek berhasil masuk ke dalam keranjang.
- **Database Integration:** Fitur untuk menyimpan data permainan atau skor tertinggi.
- **Score Board:** Score para pemain dapat dilihat di score board sebelum permainan dimulai.

## ⚠️ Aturan Game Over
Permainan akan langsung berakhir jika:
1. **Kontak Langsung:** Karakter pemain bersentuhan dengan bom yang melintas.
2. **Kesalahan Lasso:** Lasso mengenai atau tidak sengaja menarik bom.
3. **Interupsi Tarikan:** Objek yang sedang ditarik mengenai bom sebelum sempat masuk ke dalam keranjang.

## 📁 Struktur Project
Project ini diatur dengan rapi ke dalam beberapa package:
- `model/`: Berisi entitas data dan logika dasar (Ball, Player, Lasso, DB).
- `view/`: Berisi komponen antarmuka pengguna (MainMenu, GameWindow, GamePanel).
- `viewmodel/`: Berisi logika perantara yang menghubungkan model dengan tampilan.
