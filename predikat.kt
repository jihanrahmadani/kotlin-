fun predikat(nilai: Int): String
{
    if(nilai >= 60 && nilai <= 74){
        return "Cukup"
    }
    else if(nilai >= 75 && nilai <= 84){
        return "Baik"
    }
    else if(nilai >= 85){
        return "Sangat Baik"
    }
    else{
        return "BURUK"
    }
    
}
fun kelulusan(nilai: Int): String
{
    if(nilai >= 60){
        return "lulus"
    }
    else{
        return "TIDAK LULUS"
    }
    
}
fun main() {
    val nama = "echan"
    val F = kelulusan(80)
    val FF = predikat(90)
    print("$nama, $F dengan Predikat $FF")
    
}
