package com.izzed.ndelokmovie.data

import com.izzed.ndelokmovie.R

object MoviesData {
    private val movieNames = arrayOf(
        "Avatar: The Way of Water",
        "Black Panther: Wakanda Forever",
        "Horizon Line",
        "Qorin",
        "Cek Toko Sebelah 2"
    )

    private val movieDetails = arrayOf(
        "Film garapan sutradara James Cameron ini adalah kelanjutan dari cerita dari Film Avatar sebelumnya yang dirilis tahun 2009. Di film keduanya ini bercerita tentang Jake Sully dan Ney'tiri yang telah membentuk sebuah keluarga dan melakukan segalanya untuk tetap bersama. Namun, mereka harus meninggalkan rumah dan menjelajahi wilayah Pandora. Ketika ancaman kuno muncul kembali, Jake harus berperang melawan manusia.",
        "Kerajaan Wakanda tengah dilanda suasana duka usai kehilangan sosok raja mereka yaitu T'Challa (Chadwick Boseman). Momen duka tersebut justru berusaha dimanfaatkan oleh negara-negara lain yang ingin mencampuri urusan Wakanda. Ratu Ramonda (Angela Bassett), Shuri (Letitia Wright), M'Baku (Winston Duke), Okoye (Danai Gurira), dan para rakyat Wakanda kemudian harus bekerja keras untuk menyatukan seisi Wakanda demi melindungi negara mereka. Film ini amat dinanti-nantikan banyak orang, terutama penggila Marvel Cinematic Universe (MCU) usai pemeran utama film ini, Chadwick Boseman meninggal dunia pada Agustus 2020 silam. Lantas, bagaimana Marvel meracik film ini tanpa Chadwick Boseman?",
        "Sara berniat datang ke pernikahan sahabatnya di pulau Mauritius dengan menggunakan pesawat kecil. Dalam pesawat itu, Sara ditemani pilot Freddy dan Jackson. Petaka tiba ketika Freddy mengalami serangan jantung dan meninggal dunia. Sara dan Jackson harus menyelamatkan pesawat yang ditinggalkan dalam mode auto pilot tersebut. Mampukah mereka selamat dan tiba di pernikahan sahabatnya?",
        "Zahra Qurotun Aini adalah seorang siswi tingkat 3 Madrasah Aliyah atau setara SMA di asrama Rodiatul Jannah. Sudah hampir 6 tahun Zahra tinggal di asrama khusus putri, dan selalu menjadi siswi teladan yang memiliki segudang prestasi di sekolah. Zahra menjadi ambisius, dia rela menuruti apapun perintah Ustad Jaelani gurunya, demi mendapatkan nilai. Termasuk tugas untuk menjaga seorang siswi baru yang terkenal nakal bernama Yolanda, dan tugas untuk mengajak para siswi melakukan ritual Qorin. Sementara itu, Umi Hana, yang adalah istri Ustad Jaelani, menemukan keanehan-keanehan pada gelagat dan benda-benda yang disimpan oleh suaminya. Zahra tidak menyangka setelah menjalani kedua tugas itu, Zahra mulai mendapatkan terror dan sering terjadi hal-hal mistis di sekolah. Zahra dan para siswi lainnya yang melakukan ritual memanggil Qorin, mulai dihantui oleh sosok jin yang menyerupai diri mereka masing-masing. Bukan hanya itu saja, kedatangan jin Qorin membuat mereka melakukan hal-hal dosa yang tak terbayangkan, dan kehidupan mereka pun mulai diambil alih oleh sosok Jin Qorin. Bersama teman-temannya, Umi Hana, dan Umi yana, Zahra harus berjuang melawan Jin Qorin dan juga melawan dirinya sendiri.",
        "Melanjutkan film pertamanya, Cek Toko Sebelah 2 ini menceritakan tentang perjuangan Erwin melamar sang kekasih, Natalie. Erwin terus berusaha untuk meluluhkan hati Natalie terlebih calon mertuanya menuntut banyak permintaan pada Erwin. Calon mertua Erwin alias orang tua Natalie yang bernama Agnes digambarkan sebagai sosok yang keras.",
    )

    private val moviePosters = intArrayOf(
        R.drawable.poster1,
        R.drawable.poster2,
        R.drawable.poster3,
        R.drawable.poster5,
        R.drawable.poster4
    )

    val listData : ArrayList<Movie> get() {
        val list = arrayListOf<Movie>()
        for (position in movieNames.indices) {
            val movie = Movie()
            movie.name = movieNames[position]
            movie.detail = movieDetails[position]
            movie.poster = moviePosters[position]
            list.add(movie)
        }
        return list
    }
}