package com.blogspot.symfonyworld.lyricsbase.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Tomasz Ducin <tomasz.ducin@gmail.com>
 */
public class HomepageController implements Controller {

    private String message;

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public ModelAndView handleRequest(
            HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse) throws Exception {
        Map map = new HashMap();
        map.put("message", message);
        return new ModelAndView("t.homepage", map);
    }
}
