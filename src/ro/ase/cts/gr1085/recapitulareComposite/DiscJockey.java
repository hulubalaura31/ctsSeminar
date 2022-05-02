package ro.ase.cts.gr1085.recapitulareComposite;

public class DiscJockey {
    SongComponent songList;

    public DiscJockey(SongComponent newSongList){
        songList = newSongList;
    }

    public void getSongList(){
        songList.displaySongInfo();
    }
}
