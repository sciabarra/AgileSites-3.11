package starter.model.page;

import agilesites.annotations.*;
import starter.model.Page;

@FindStartMenu("Find HomePage")
@NewStartMenu("New HomePage")
@ContentDefinition(flexAttribute = "PageAttribute",
        flexContent = "PageDefinition")
public class StHome extends Page {

    @Attribute(description="Title")
    @Required
    private String StTitle;
    
    @Attribute(description="Subtitle")
    private String StSubTitle;
    

    @Attribute(description="Text", editor = "StRichTextEditor")
    private String StText;

}
