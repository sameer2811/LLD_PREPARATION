package IteratorDesignPattern.PlaylistIterator.src;

import IteratorDesignPattern.PlaylistIterator.interfaces.Iterator;
import IteratorDesignPattern.PlaylistIterator.models.Song;
import IteratorDesignPattern.PlaylistIterator.service.Playlist;

public class Main {

    public static void main(String[] args) {

        Playlist playlist = new Playlist();


        playlist.addSong(new Song("Song 1", "Artist 1", 180));
        playlist.addSong(new Song("Song 2", "Artist 2", 200));
        playlist.addSong(new Song("Song 3", "Artist 3", 220));

        Iterator<Song> iterator = playlist.createIterator();

        while (iterator.hasNext()) {
            Song song = iterator.getNext();
            System.out.println(song.getTitle() + " - " + song.getArtist() + " - " + song.getDuration());
        }
    }

}
