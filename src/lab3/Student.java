public class Student {
    private String name;
    private String surname;
    private int age;
    private float averageScore;


    public Student(String name, String surname, int age, float averageScore) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageScore = averageScore;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getAll() {
        return name+ " " + surname + " " + age + " " + averageScore;
    }
    public int getAge() {
        return age;
    }
    public float getAverageScore() {
        return averageScore;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAverageScore(float averageScore) {
        if (averageScore > 0)
            this.averageScore = averageScore;
        else System.out.println("Value error");
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
        else System.out.println("Value error");
    }
}
