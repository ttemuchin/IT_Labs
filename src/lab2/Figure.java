public abstract class Figure {
    private String type;
    private String color;
    private float[] measures;
    private float volume;
    static int Number_of_Fig = 0;
/*    {
        Number_of_Fig += 1; // инициализации
    }*/

    public Figure() {
        this.type = "3d";
        this.color = "Black";
        this.volume = 1;
        Number_of_Fig ++;
    }

    public Figure(String color, float volume) {
        this.type = "3d";
        this.color = color;
        this.volume = volume;
        Number_of_Fig ++;
    }

    public abstract void setMeasures(float[] measures);
    public String getColor(){
        return color;
    }
    public String getType(){
        return type;
    }
    public float[] getMeasures(){
        return measures;
    }
    public String getVolume() {
        return String.format("%.2f", volume);
    }
    public void setType(String type){
        this.type = type;
    }
    public void setType(int type){
        this.type = type + "d";
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setVolume(float vol){
        this.volume = vol;
    }
}
