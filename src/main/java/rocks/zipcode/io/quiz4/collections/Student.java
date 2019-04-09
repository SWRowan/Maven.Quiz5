package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    private Double totalStudyTime = 0.0;
    private Integer id;

    public Student() {
        this(null);
    }

    public Student(Integer id) {
        this.id = id;
    }

    public void learn(Double amountOfHours) {
        totalStudyTime+=amountOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
