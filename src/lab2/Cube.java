public class Cube extends Figure {
    private String name_of_figure;
    private final String projection;

    @Override
    public void setMeasures(float[] Measures) {
        float a = Measures[0];
        this.setVolume(a * a * a);//overloading
    }

    public void setName(String name) {
        this.name_of_figure = name;
    }

    public String getName() {
        return name_of_figure;
    }

    public String getProjection() {
        return projection;
    }

    public Cube() {
        super();
        //this(//////);
        this.projection = "square";
        this.name_of_figure = "Cube" + Figure.Number_of_Fig;
    }

    public Cube(String name_of_figure, String color, float volume) {
        super(color, volume);
        this.name_of_figure = name_of_figure;
        this.projection = "square";
        //this();
    }
}
