package starter;

public class Config extends wcs.java.Config {
	public static final String site = "Starter";
	@Override
	public String getSite() {
		return site;
	}

	@Override
	public String getAttributeType(String type) {
		if (type == null)
			return null;
		if (type.equals("Page"))
			return "PageAttribute";
     		if (type.startsWith("St"))
			return "StAttribute";
		return null;
	}
}
        