package IteratorDesignPattern.PlaylistIterator.iterators;

import IteratorDesignPattern.PlaylistIterator.interfaces.Iterator;
import IteratorDesignPattern.PlaylistIterator.models.Song;
import IteratorDesignPattern.PlaylistIterator.service.Playlist;

public class PlaylistIterator implements Iterator<Song>{

    private final Playlist playlist;
    int currentSongIndex  = 0;

    public PlaylistIterator(Playlist playlist) {
        this.playlist = playlist;
    }

    @Override
    public boolean hasNext() {
        return currentSongIndex < playlist.getSize();
    }

    @Override 
    public Song getNext() {
        if (hasNext()) {
            Song currentSong = playlist.getSong(currentSongIndex);
            currentSongIndex = currentSongIndex + 1;
            return currentSong;
        }
        return null;
    }
    
}
