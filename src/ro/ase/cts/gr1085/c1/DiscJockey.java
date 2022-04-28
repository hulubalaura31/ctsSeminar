package ro.ase.cts.gr1085.c1;

public class DiscJockey {
    SongComponent songList;

    public DiscJockey(SongComponent newSongList){
        songList = newSongList;
    }

    public void getSongList(){
        songList.displaySongInfo();
    }
}
