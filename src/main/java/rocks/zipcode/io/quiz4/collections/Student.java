package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {

    Integer id;
    Double hoursLearnt;

    public Student(){
        this.id = null;
        this.hoursLearnt = 0.0;
    }

    public Student(Integer id){
        this.id = id;
        this.hoursLearnt = 0.0;
    }

    public void learn(Double amountOfHours) {
        this.hoursLearnt += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return this.hoursLearnt;
    }
}
