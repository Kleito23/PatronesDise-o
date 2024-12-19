public class Song implements Playable {
    private String songTitle;
    private String songArtist;
    private String songLength;
    private String filePath;
    private String mp3File;
    private double frameRatePerMilliseconds;
    
    public Song(){
        //logica para crear la cancion
    }
    
    @Override
    public void play(){
        System.out.println("Playing song :" + songTitle);
        // logica para reproducir la cancion
    }
}
