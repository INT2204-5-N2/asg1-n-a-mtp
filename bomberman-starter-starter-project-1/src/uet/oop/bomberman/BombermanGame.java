package uet.oop.bomberman;

import java.io.File;
import uet.oop.bomberman.gui.Frame;

public class BombermanGame {
	
	public static void main(String[] args) {
            
                String path = new File("").getAbsolutePath() + "\\res\\sound\\playgame.mid";
                Sound sound = new Sound(path);
		sound.playLoop(-1); 
                
		new Frame();
	}
}
