package com.blogspot.symfonyworld.lyricsbase.controller;

import java.util.Iterator;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import org.apache.tiles.preparer.ViewPreparer;
import org.apache.tiles.request.Request;
import org.apache.tiles.AttributeContext;
import org.apache.tiles.Attribute;

/*
http://www.ontruenorth.com/posts/44
http://deepeshdarshan.wordpress.com/2011/03/14/viewpreparer-with-tiles-definition/
http://richardbarabe.wordpress.com/2009/02/19/apache-tiles-2-viewpreparer-example/
http://tech.finn.no/2012/07/25/the-ultimate-view-tiles-3
*/

/**
 *
 * @author Tomasz Ducin <tomasz.ducin@gmail.com>
 */
public class TestViewPreparer implements ViewPreparer {

    public void execute(Request tilesContext, AttributeContext attributeContext)
    {
/*
        tilesContext.getApplicationContext().getApplicationScope();
        System.out.println(tilesContext.getAvailableScopes());
//        HttpServletRequest request = ServletActionContext.getRequest();
//        HttpSession session = request.getSession();

        Set set = attributeContext.getLocalAttributeNames();
//        Object[] tmp = tilesContext.getContext("request").keySet().toArray();
        Object[] tmp = tilesContext.getParam().keySet().toArray();
        for(Object o:tmp) {
            System.out.println(o);
        }
        System.out.println(tilesContext.getContext("request").get("message"));
        System.out.println(tilesContext.getContext("request").keySet().toArray().length);
        System.out.println(set);
        System.out.println(attributeContext.getCascadedAttributeNames());
        System.out.println(attributeContext.getTemplateAttribute());
	Iterator iterator = set.iterator();
	while (iterator.hasNext()) {
            String string = (String) iterator.next();
            System.out.println(string);
            System.out.println("> " + attributeContext.getLocalAttribute(string));
	}
*/
        attributeContext.putAttribute(
            "new_attribute",
            new Attribute("This is the value added by the ViewPreparer"));
    }
}
