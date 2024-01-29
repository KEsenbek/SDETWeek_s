package week10;

import java.util.List;

public class Class10_12_2_Movie_Night_Queue_Array_List {
    public static void main(String[] args) {
        List<String> movieList = List.of(new String[]{"Movie1", "Movie2", "Movie3", "Movie4", "Movie5"});
        int movieIndex = 3;
        getMovieTitle(movieList,movieIndex);
    }

    public static String getMovieTitle(List<String> movieList, int movieIndex) {

        if (movieIndex<0) {
            return "";
        }
        String answer = movieList.get(movieIndex);
        return answer;
    }
}
