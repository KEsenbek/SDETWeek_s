package week10;

import java.util.List;

public class Class10_12_3_Current_Song_Finder_Array_List {
    public static void main(String[] args) {
        List<String> songsPlaylist = List.of(new String[] {"Song1", "Song2", "Song3", "Song4", "Song5"});
        int currentSongIndex = 2;
        getCurrentSong(songsPlaylist,currentSongIndex);
    }

    public static String getCurrentSong(List<String> songsPlaylist, int currentSongIndex) {
        if (currentSongIndex<0) {
            return "-1";
        }

        String answer = songsPlaylist.get(currentSongIndex);
        return answer;
    }
}
