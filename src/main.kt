fun main() {

    val onlySingleSoldAsDoubleForHalfPrice: Song = Song("Lads on tour","Kings of Leon", 3.30)

    val firstReleaseSecondAttemptVersion2Single: Single = Single(Song("Lads preparing for the tour","Kings of Leon", 3.00),
        Song("Lads very much on tour","Kings of Leon", 1.00))

    val firstPainfulAlbum: Album = Album(mutableListOf(
        Song("Lads on tour 2 - The Empire Strikes back","Kings of Leon", 4.30),
        Song("Lads on tour 3 - Jaws this time it's that guy from the first film with the chalk","Kings of Leon", 5.00),
        Song("Lads on tour - The re-release (Ryan Reyonds plays 'Lad 1', we're very proud)","Kings of Leon", 1.30)
    ))

    println(firstPainfulAlbum.getAllSongs())
    println(firstPainfulAlbum.getPlayingTime())

    println(firstReleaseSecondAttemptVersion2Single.getAllSongs())
    println(firstReleaseSecondAttemptVersion2Single.getPlayingTime())

    val musicList = listOf<Music>(firstReleaseSecondAttemptVersion2Single, firstPainfulAlbum)

    musicList.forEach {
        println(it.getPlayingTime())
        println(it.getAllSongs())
    }

}