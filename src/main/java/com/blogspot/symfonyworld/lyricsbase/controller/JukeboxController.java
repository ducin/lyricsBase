package com.blogspot.symfonyworld.lyricsbase.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.blogspot.symfonyworld.lyricsbase.bo.Jukebox;

/**
 *
 * @author Tomasz Ducin <tomasz.ducin@gmail.com>
 */
public class JukeboxController implements Controller {

    private Jukebox facade;
    
    public Jukebox getFacade() {
        return facade;
    }
    
    public void setFacade(Jukebox jukebox) {
        facade = jukebox;
    }
    
    @Override
    public ModelAndView handleRequest(
            HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse) throws Exception {
        return new ModelAndView("t.jukebox", "jukebox", facade);
    }
}
