package javaDay5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class MovieOperation {
    static ArrayList<MovieDTO> al = new ArrayList<>();
    static HashMap<String, MovieDTO> hm = new HashMap<>();

    public void input(String s) {
        StringTokenizer st = new StringTokenizer(s.replace(",",""));
        try {
            st.nextToken();
            String title = st.nextToken().replace("'", "");
            st.nextToken();
            String major = st.nextToken().replace("'", "");
            st.nextToken();
            Integer running = Integer.parseInt(st.nextToken());
            st.nextToken();
            Float rating = Float.parseFloat(st.nextToken());
            st.nextToken();
            Integer genre = Integer.parseInt(st.nextToken());
            if (genre != 1 && genre != 2 && genre != 3) {
                System.out.println("장르를 다시 입력해주세요");
                return;
            }
            MovieDTO movie = new MovieDTO(title, major, running, rating, genre);
            al.add(movie);
            hm.put(title, movie);
        } catch (Exception e) {
            System.out.println("입력이 잘못되었습니다");
        }
    }

    public void output() {
        if (al.size() == 0) System.out.println("데이터가 없습니다");
        else {
            Collections.sort(al, (s1, s2) -> (int) ((s2.getRating() * 100) - (s1.getRating() * 100)));
            for (MovieDTO movieDTO : al) {
                System.out.println(movieDTO.toString());
            }
            System.out.println();
        }
    }

    public void search(int s) {
        if (al.size() == 0) System.out.println("데이터가 없습니다");
        else {
            StringBuilder sb = new StringBuilder();
            for (MovieDTO movieDTO : al) {
                if (movieDTO.getGenre() == s) {
                    sb.append(movieDTO).append("\n");
                }
            }
            System.out.println(sb.length()==0?"영화가 없습니다":sb);
            System.out.println();
        }
    }
}
