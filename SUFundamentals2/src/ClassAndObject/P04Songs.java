package ClassAndObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04Songs {

    public static class Song {
        String typeList;
        String name;
        String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;

            }
            public String getName(){
                return this.name;
            }

            public String getTypeList(){
            return this.typeList;
            }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Song> songsList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String inputLine = scanner.nextLine();
            String[] songsArr = inputLine.split("_");
            String typeList = songsArr[0];
            String name = songsArr[1];
            String time = songsArr[2];

            Song currSong = new Song(typeList,name,time);
            songsList.add(currSong);
        }

        String command = scanner.nextLine();
        if (command.equals("all")){
            for (Song song: songsList){
                System.out.println(song.getName());
            }
        }else {
            for (Song song: songsList){
                String currTypeList = song.getTypeList();
                if (currTypeList.equals(command)){
                    System.out.println(song.getName());
                }
            }
        }

    }
}
