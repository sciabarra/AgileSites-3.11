package starter.element.page;

import wcs.api.Asset;
import wcs.api.Log;
import wcs.java.Element;
import wcs.api.Env;
import wcs.java.Picker;
import agilesites.annotations.Template;


@Template(forType = "Page", layout=true)
public class StHomeLayout extends Element {

    final static Log log = Log.getLog(StHomeLayout.class);

    @Override
    public String apply(Env e) {
        Asset a = e.getAsset();
        Picker html = Picker.load("/starter/template.html", "#content");
        html.replace("#title", a.editString("StTitle"));
        html.replace("#subtitle", a.editString("StSubTitle"));
        html.replace("#text", a.editText("StText", ""));
        return html.html();
    }
}
      