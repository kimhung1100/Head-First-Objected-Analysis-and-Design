public class GuitarSpec {

    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    private int numStrings;
    public GuitarSpec(Builder builder, String model, Type type, int numStrings,
                      Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.numStrings = numStrings;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public GuitarSpec(GuitarSpec spec) {
        this.builder = spec.getBuilder();
        this.model = spec.getModel();
        this.type = spec.getType();
        this.backWood = spec.getBackWood();
        this.topWood = spec.getTopWood();
        this.numStrings = spec.getNumStrings();
    }
    public int getNumStrings() {
        return numStrings;
    }
    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public boolean matches(GuitarSpec searchSpec) {
        if (builder != searchSpec.builder)
            return false;
        if ((model != null) && (!model.equals("")) &&
                (!model.toLowerCase().equals(searchSpec.model.toLowerCase())))
            return false;
        if (type != searchSpec.type)
            return false;
        if (backWood != searchSpec.backWood)
            return false;
        if (topWood != searchSpec.topWood)
            return false;
        if (numStrings != searchSpec.numStrings)
            return false;
        return true;
    }
}