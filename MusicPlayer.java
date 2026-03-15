
import java.io.*;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class MusicPlayer {

    public static void main(String[] args) {
        String path = "music.wav";
        File file = new File(path);

        try (AudioInputStream as = AudioSystem.getAudioInputStream(file); Scanner sc = new Scanner(System.in)) {
            Clip clip = AudioSystem.getClip();
            clip.open(as);
            String res="";
        
            while(!res.equals("Q")){
                System.out.println("P - Play");
                System.out.println("S - Stop");
                System.out.println("R - Reset");
                System.out.println("Q - Quit");
                res=sc.next().toUpperCase();
                if(res.equals("P")){
                    clip.start();
                }
                else if(res.equals("S")){
                    clip.stop();
                }
                else if(res.equals("R")){
                    clip.setMicrosecondPosition(0);
                }
                else{
                    System.out.println("Incorrect Option!");
                }
            }

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
