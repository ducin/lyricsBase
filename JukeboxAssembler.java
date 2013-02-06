public class JukeboxAssembler {

    public static final void main (String[] args) {
        Jukebox jukebox = new ArrayListJukebox("Metal Jukebox");
        CommandLineView clv = new CommandLineView();
        clv.setJukebox(jukebox);
        clv.displayAllSongs();
    }

}

