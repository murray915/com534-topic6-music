class Single(val aSide: Song, val bSide: Song) : Music {

    override fun getAllSongs(): List<String> {
        val songs = listOf(aSide.title, bSide.title)
        return songs
    }

    override fun getPlayingTime(): Double {
        var playTime: Double = 0.00

        playTime += aSide.playingTime
        playTime += bSide.playingTime

        return playTime
    }
}