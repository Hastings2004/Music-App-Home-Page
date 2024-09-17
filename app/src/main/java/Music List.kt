package com.example.musicapp



data class MusicList(
    var artistName: String,
    var songTitle: String,
    var songArtwork: Int
)


fun getAllMusicList(): List<MusicList>{
    return listOf(
        MusicList("You", "", R.drawable.add),
        MusicList("Dax", "Dear alcohol", R.drawable.dear_alcohol_alt),
        MusicList("Dax", "Dear alcohol", R.drawable.music_artwork),
        MusicList("Dax", "Dear alcohol", R.drawable.dear_alcohol_alt),
        MusicList("Dax", "Dear alcohol", R.drawable.music_artwork),
        MusicList("Dax", "Dear alcohol", R.drawable.dear_alcohol_alt),
        MusicList("Dax", "Dear alcohol", R.drawable.dear_alcohol_alt),


    )
}
data class TodayHit(
    var artistName: String,
    var songArtwork: Int
)
fun getAllTodayHit() : List<TodayHit>{
    return listOf(
        TodayHit("Vybz",R.drawable.movie),
        TodayHit("Lexnour",R.drawable.i_hate),
        TodayHit("Dax",R.drawable.dear),
        TodayHit("Justin",R.drawable.real_man),
        TodayHit("Lexnour",R.drawable.i_hate),
        TodayHit("Dax",R.drawable.dear),
        TodayHit("Justin",R.drawable.real_man),
    )
}

