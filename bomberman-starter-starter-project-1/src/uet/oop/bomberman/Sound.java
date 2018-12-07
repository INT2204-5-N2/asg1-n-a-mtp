/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uet.oop.bomberman;

import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;

/**
 *
 * @author Hoang Phi
 */
/*source : https://www.codota.com/code/java/methods/javax.sound.sampled.Clip/loop */
public class Sound {     
    private Clip clip;
    public Sound(String name){
        try {
            File file = new File(name);
            // Open an audio input stream. 
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(file);
             // Get a sound clip resource.
            clip = AudioSystem.getClip();
            // Open audio clip and load samples from the audio input stream.
            clip.open(audioIn);
          //  clip.loop(Clip.LOOP_CONTINUOUSLY);
         } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }
   public void playLoop(int loop){
        clip.setFramePosition(0);
        clip.loop(loop);
    }
}	

    
