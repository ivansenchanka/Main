public class Student extends Human {

    private double point;

    public Student(String name, int age, double point){
        super(name, age);
        this.point = point;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }
}
