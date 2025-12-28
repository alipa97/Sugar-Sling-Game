# Sugar Sling Game 🍬🚀

SugarSlingGame adalah permainan berbasis Java yang menggabungkan elemen aksi dan strategi. Project ini dibangun menggunakan konsep **Object-Oriented Programming (OOP)** dengan arsitektur **MVVM** untuk memisahkan logika bisnis, data, dan tampilan.

## 🎮 Fitur Utama
- **Gameplay Dinamis:** Mekanik menembak atau melontarkan objek (Sling) untuk mencapai target.
- **Sistem Skor:** Pencatatan skor secara real-time berdasarkan performa pemain.
- **Interaksi Objek:** Simulasi fisika sederhana untuk pergerakan bola (Ball) dan lasso.
- **Database Integration:** Fitur untuk menyimpan data permainan atau skor tertinggi (terlihat dari adanya `model/DB.java`).

## 📁 Struktur Project
Project ini diatur dengan rapi ke dalam beberapa package:
- `model/`: Berisi entitas data dan logika dasar (Ball, Player, Lasso, DB).
- `view/`: Berisi komponen antarmuka pengguna (MainMenu, GameWindow, GamePanel).
- `viewmodel/`: Berisi logika perantara yang menghubungkan model dengan tampilan.

## 🚀 Cara Menjalankan
1. Pastikan kamu sudah menginstal **Java Development Kit (JDK)** versi 8 atau yang lebih baru.
2. Clone repository ini:
   ```bash
   git clone [https://github.com/alipa97/Sugar-Sling-Game.git](https://github.com/alipa97/Sugar-Sling-Game.git)
