package IteratorDesignPattern.PlaylistIterator.service;
import java.util.List;
import java.util.ArrayList;
import IteratorDesignPattern.PlaylistIterator.models.Song;
import IteratorDesignPattern.PlaylistIterator.interfaces.IterableCollection;
import IteratorDesignPattern.PlaylistIterator.interfaces.Iterator;
import IteratorDesignPattern.PlaylistIterator.iterators.PlaylistIterator;


public class Playlist implements IterableCollection<Song> {

    private List<Song> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }

    public Song getSong(int index) {
        return this.songs.get(index);
    }

    public int getSize() {
        return this.songs.size();
    }

    @Override
    public Iterator<Song> createIterator() {
        return new PlaylistIterator(this);
    }
}
