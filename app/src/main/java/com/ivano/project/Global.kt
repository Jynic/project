package com.ivano.project

object Global {
    val komens = arrayListOf(
        Cerita(1, 1,"Ivano Zefanya", "Hari ini saya pergi dengan ibu saya ke pasar. Sewaktu di pasar saya bertemu dengan banyak teman baru. Mereka semua sangatlah ramah dengan ku. Aku sangat bahagia hari itu.", true),
        Cerita(2, 1, "Michael Fernando", "Hari ini saya mengerjakan banyak Tugas.Saya merasa sedikit kesulitan karena soal yang diberikan cukup sulit. Mungkin saya juga salah karena kurang memperlajari materi yang diberikan", false),
        Cerita(3, 2, "Farrel", "Hari ini saya mengerjakan banyak Tugas.Saya merasa sedikit kesulitan karena soal yang diberikan cukup sulit. Mungkin saya juga salah karena kurang memperlajari materi yang diberikan", true),
        Cerita(4, 3, "Arcie Oumatan", "Hari ini saya mengerjakan banyak Tugas.Saya merasa sedikit kesulitan karena soal yang diberikan cukup sulit. Mungkin saya juga salah karena kurang memperlajari materi yang diberikan", false),
        Cerita(5,3, "Satya Wigiyanto", "Hari ini saya mengerjakan banyak Tugas.Saya merasa sedikit kesulitan karena soal yang diberikan cukup sulit. Mungkin saya juga salah karena kurang memperlajari materi yang diberikan", true),
        
    )
    val cards = arrayListOf(
        Card(1,"Rahasia Terkunci di Perpustakaan Kuno", "NebulaNomad", "mengisahkan tentang seorang mahasiswa bernama alex yang secara tidak sengaja menemukan sebuah buku kuno yang misterius di perpustakaan universitasnya", "https://live.staticflickr.com/737/32640476365_906f64ce29_b.jpg"),
        Card(2,"Beli Indomie", "Ivano Zefanya", "Mengisahkan sebuah hari dimana saya membeli sebuah Indomie. Malam itu sangatlah dingin dan saya lapar sangat. Tetapi tidak terdapat Indomie.", "https://live.staticflickr.com/737/32640476365_906f64ce29_b.jpg"),
        Card(3,"Valorant", "SikiLala", "Mengisahkan sebuah permainan online yang dimainkan oleh banyak orang. Banyak orang sangat gemar bermain Valorant. Bahkan ada yang memiliki karir sebagai pro player Valorant.", "https://live.staticflickr.com/737/32640476365_906f64ce29_b.jpg")

    )

    val accounts = arrayListOf(
        Account("ivano","admin"),
        Account("michael","admin"),
        Account("vinsent","admin")
    )
    val genre = arrayOf(
        Genre(1, "Action"),
        Genre(2, "Anime"),
        Genre(3, "Comedy"),
        Genre(4, "Crime"),
        Genre(5, "Drama"),
        Genre(6, "History"),
        Genre(7, "Horror"),
        Genre(8, "Kids"),
        Genre(9, "Romance"),
        Genre(10, "Sci-Fi & Fantasy"),
        Genre(11, "Thriller")
    )
}