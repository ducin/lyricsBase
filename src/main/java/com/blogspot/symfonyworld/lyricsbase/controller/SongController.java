package com.blogspot.symfonyworld.lyricsbase.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

import com.blogspot.symfonyworld.lyricsbase.bo.Jukebox;
import com.blogspot.symfonyworld.lyricsbase.model.Song;

/**
 *
 * @author Tomasz Ducin <tomasz.ducin@gmail.com>
 */
public class SongController extends MultiActionController {

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

    public ModelAndView display(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        if (request.getParameter("slug") == null) {
            throw new ResourceNotFoundException("No song chosen.");
        }
        Song song = facade.getSongBySlug(request.getParameter("slug"));
        if (song == null) {
            throw new ResourceNotFoundException("Song \"" + request.getParameter("slug") + "\"not found.");
        }
        HashMap model = new HashMap();
        model.put("jukebox", facade);
        model.put("song", song);
        return new ModelAndView("t.song", model);
    }

    public ModelAndView delete(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        if (request.getParameter("id") == null)
            throw new ResourceNotFoundException("No song chosen.");
        Song song = facade.getSongById(new Long(request.getParameter("id")));
        if (song == null) {
            throw new ResourceNotFoundException("Song \"" + request.getParameter("id") + "\"not found.");
        }
        facade.deleteSong(song);
        return new ModelAndView("redirect:/jukebox.html");
    }

    public ModelAndView edit(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        if (request.getParameter("id") == null)
            throw new ResourceNotFoundException("No song chosen.");
        Song song = facade.getSongById(new Long(request.getParameter("id")));
        if (song == null)
            throw new ResourceNotFoundException("Song \"" + request.getParameter("id") + "\"not found.");
        HashMap model = new HashMap();
        model.put("jukebox", facade);
        model.put("song", song);
        return new ModelAndView("t.edit", model);
    }
}
