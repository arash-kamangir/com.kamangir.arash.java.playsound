package com.kamangir.arash.java.playsound;

import javazoom.jl.player.Player;

/**
 * Simple mp3 playing.
 *
 * @author <a href="https://stackoverflow.com/users/5266245/arash-kamangir">Arash Kamangir</a>,
 *         copied from <a href="https://stackoverflow.com/a/24337995/5266245">Stack Overflow</a>,
 *         written by <a href="https://stackoverflow.com/users/3762070/vlad">Vlad</a>
 */
public class PlaySound {

   public static void main(final String[] args) {
      try {
         // Files have to be placed in src/main/resources/<PATH_OF_THIS_CLASS>. Filename without suffix.
         final String filename = args[0];
         final Player player = new Player(PlaySound.class.getResourceAsStream(filename + ".mp3"));
         player.play();
      }
      catch (final Exception e) {
         e.printStackTrace();
      }
   }
}
