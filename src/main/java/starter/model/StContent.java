package starter.model;

import agilesites.annotations.Type;
import agilesitesng.api.ASAsset;

@Type
public class StContent<S> extends ASAsset {
    S definition;
    public StContent() { }
    public StContent(S definition) { this.definition = definition; }
    public S getDefinition()  { return definition; }
    public S get() { return definition; }
}