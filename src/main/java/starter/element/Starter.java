package starter.element;

import static wcs.Api.*;
import wcs.api.Env;
import wcs.api.Asset;
import wcs.api.Log;
import wcs.java.Element;
import wcs.java.Picker;
import agilesites.annotations.CSElement;
import agilesites.annotations.SiteEntry;

@SiteEntry(wrapper = true)
@CSElement
public class Starter extends Element {
    final static Log log = Log.getLog(Starter.class);
    @Override
    public String apply(Env e)
    {
        Picker html = Picker.load("/starter/template.html");
        // handle errors
        if (e.isVar("error"))
            return html.replace("#content",
                    e.call("StError", arg("error", e.getString("error"))))
                    .outerHtml(model(
                            arg("name", "Error"),
                            arg("description",e.getString("error"))
                            ));
        Asset a = e.getAsset();
        if (a == null)
            return html.replace("#content",
                    e.call("StError", arg("error", "Asset not found")))
                    .outerHtml();
        // render the asset using its default template
        html.replace("#content", a.call(a.getTemplate()));
        return html.outerHtml(model(
                                arg("name", a.getName()),
                                arg("description", a.getDescription())
                              ));
    }
}
