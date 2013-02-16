package com.blogspot.symfonyworld.lyricsbase.controller;

import com.blogspot.symfonyworld.lyricsbase.model.Jukebox;
import com.blogspot.symfonyworld.lyricsbase.model.Song;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 *
 * @author Tomasz Ducin <tomasz.ducin@gmail.com>
 */
public class SongController implements Controller {

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
    
    private Jukebox facade;
    
    public Jukebox getFacade() {
        return facade;
    }
    
    public void setFacade(Jukebox jukebox) {
        facade = jukebox;
    }
    
    @Override
    public ModelAndView handleRequest(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        if (request.getParameter("slug") == null)
            throw new ResourceNotFoundException("No song chosen.");
        Song song = facade.getSongBySlug(request.getParameter("slug"));
        if (song == null)
            throw new ResourceNotFoundException("Song \"" + request.getParameter("slug") + "\"not found.");
        HashMap model = new HashMap();
        model.put("jukebox", facade);
        model.put("song", song);
        return new ModelAndView("t.song", model);
    }
}
