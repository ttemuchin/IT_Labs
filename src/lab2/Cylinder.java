public class Cylinder extends Figure{
    private String name_of_figure;
    private final String projection;
    @Override
    public void setMeasures(float[] Measures) {
        float r = Measures[0];
        float h = Measures[1];
        this.setVolume(3.14f*r*r*h);
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

    public Cylinder() {
        this.projection = "circle";
        this.name_of_figure = "Cylinder"+Figure.Number_of_Fig;
    }
    public Cylinder(String name_of_figure, String color, float volume) {
        super(color, volume);
        this.name_of_figure = name_of_figure;
        this.projection = "Cylinder"+Figure.Number_of_Fig;
    }

    public void amplifySound() {
        System.out.println("Sound was amplified in "+getVolume()+" times");
    }
}