package model;

public class Music {

    //Model Class

   private String musicName;

   private String musicPath;

   

   public Music(String musicName, String musicPath) {

       super();

       this.musicName = musicName;


       this.musicPath = musicPath;

   }

   public String getMusicName() {

       return musicName;

   }


   public String getMusicPath() {

       return musicPath;

   }
   
}
