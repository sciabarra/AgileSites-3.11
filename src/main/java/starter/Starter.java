package starter;

import agilesites.annotations.AttributeEditor;
import agilesites.annotations.Site;
import agilesites.annotations.FlexFamily;
import agilesites.api.AgileSite;

@FlexFamily(
       flexAttribute = "StAttribute",
       flexParentDefinition = "StParentDef",
       flexContentDefinition = "StContentDef",
       flexFilter = "StFilter",
       flexContent = "StContent",
       flexParent = "StParent")
@Site(enabledTypes = {
       "StAttribute",
       "StParentDef",
       "StContentDef",
       "StContent:F",
       "StParent:F",
       "SitePlan",
       "Template",
       "CSElement",
       "SiteEntry",
       "PageAttribute",
       "PageDefinition",
       "Page:F"
        })
public class Starter extends AgileSite {
   @AttributeEditor
   private String StRichTextEditor = "<CKEDITOR/>";

}
        