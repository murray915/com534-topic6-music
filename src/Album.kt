class Album (val songs: List<Song>): Music {

    fun getArtistSongs(artist: String): List<Song> {
        return songs.filter { it.artist.contains(artist) }
    }

    override fun getAllSongs(): List<String> {
        val songList = mutableListOf<String>()
        songs.forEach { songList.add(it.title) }
        return songList
    }

    override fun getPlayingTime(): Double {
        var playTime: Double = 0.00
        songs.forEach { playTime += it.playingTime }

        return playTime
    }

}