import java.util.ArrayList;
public class Playlist implements Playable{
     private ArrayList<Playable> song;

     @Override
     public void play(){
         for(Playable s: song){
             s.play();
         }
     }
     public void add(Playable p){
         song.add(p);
     }
     public void remove(Playable p){
         song.remove(p);
     }
     public Playable getSong(){
         return song.get(1); //ejemplo para que compile
     }
}
