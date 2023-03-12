import java.util.*

fun main() {

    println("Masukan Nama Player 1?")
    val namaPlayer1 = readlnOrNull()
    println("Hi, $namaPlayer1 !! Selamat datang...")
    println("Masukan Antara (Gunting,Batu, Kertas) ")
    print("Masukan Pilihan : ")
    val Pplayer1 = readlnOrNull()

    println("Masukan Nama Player 2?")
    val namaPlayer2 = readlnOrNull()
    println("Hi, $namaPlayer2 !! Selamat datang...")
    println("Masukan Antara (Gunting,Batu, Kertas) ")
    print("Masukan Pilihan : ")
    val Pplayer2 = readlnOrNull()

    val status: Boolean

    if (Pplayer1!!.lowercase(Locale.getDefault()).equals(Pplayer2?.lowercase(Locale.getDefault()))) {
        println("Seri $namaPlayer1 dengan $namaPlayer1")
        }
    else if (Pplayer1.lowercase(Locale.getDefault()).equals("batu")) {
        if(Pplayer2?.lowercase(Locale.getDefault()).equals("gunting")){
            status = true
            hasil(status, namaPlayer1.toString(), namaPlayer2.toString())
        }else{
            status = false
            hasil(status,namaPlayer1.toString(),namaPlayer2.toString())
        }
    }
    else if (Pplayer1.lowercase(Locale.getDefault()).equals("gunting")) {
        if (Pplayer2?.lowercase(Locale.getDefault()).equals("kertas")) {
            status = true
            hasil(status,namaPlayer1.toString(),namaPlayer2.toString())
        } else {
            status = false
            hasil(status,namaPlayer1.toString(),namaPlayer2.toString())
        }
    }
    else if (Pplayer1.lowercase(Locale.getDefault()).equals("kertas")) {
        if (Pplayer2?.lowercase(Locale.getDefault()).equals("batu")) {
            status = true
            hasil(status,namaPlayer1.toString(),namaPlayer2.toString())
        } else {
            status = false
            hasil(status,namaPlayer1.toString(),namaPlayer2.toString())
        }
    }
}
fun hasil(status: Boolean, p1: String, p2: String) {
    if (status) {
        println("Selamat!! $p1 mengalahkan $p2")
    } else {
        println("Selamat!! $p2 mengalahkan $p1")

    }
}