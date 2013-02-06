
import java.util.Iterator;

/**
 *
 * @author Tomasz Ducin <tomasz.ducin@gmail.com>
 */
public class CommandLineView {

    private Jukebox jukebox;
    
    public CommandLineView() {
        jukebox= new Jukebox("Metal Jukebox");
    }

    public void displayAllSongs() {
        System.out.println(jukebox.toString());
        Iterator it = jukebox.getSongs().iterator();
        while (it.hasNext()) {
            Song song = (Song) it.next();
            System.out.println(song.toString());
        }
    }

    public static void main(String[] args) {
        CommandLineView clv = new CommandLineView();
        clv.displayAllSongs();
    }
}
