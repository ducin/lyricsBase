package com.blogspot.symfonyworld.lyricsbase;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JukeboxAssembler {

    public static final void main (String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Jukebox-context.xml");
        CommandLineView clv = (CommandLineView) ctx.getBean("CommandLineView");
        clv.displayAllSongs();
    }

}

