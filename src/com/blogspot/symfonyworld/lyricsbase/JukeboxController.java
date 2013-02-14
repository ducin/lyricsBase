package com.blogspot.symfonyworld.lyricsbase;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
