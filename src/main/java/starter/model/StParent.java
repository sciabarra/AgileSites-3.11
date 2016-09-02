package starter.model;

import agilesites.annotations.Type;
import agilesitesng.api.ASAsset;

@Type
public class StParent<S> extends ASAsset {
    S definition;
    public StParent() { }
    public StParent(S definition) { this.definition = definition; }
    public S getDefinition()  { return definition; }
    public S get() { return definition; }
}