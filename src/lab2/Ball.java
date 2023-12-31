public class Ball extends Figure{
    private String name_of_figure;
    private final String projection;

    @Override
    public void setMeasures(float[] Measures) {
        float r = Measures[0];
        this.setVolume(4f*3.14f*r*r*r/3f);
    }

    public void setName(String name) {
        this.name_of_figure = name;
    }
    public String getName() {
        return name_of_figure;
    }

/*    public void setProjection(String projection) {
        this.projection = projection;
    }*/
    public String getProjection() {
        return projection;
    }

    public Ball() {
        super();
        this.projection = "circle";
        this.name_of_figure = "Ball"+Figure.Number_of_Fig;
    }


}
