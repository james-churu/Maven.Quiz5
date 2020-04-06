package rocks.zipcode.io.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    HashMap<Student , Double> students;
    public ZipCodeWilmington(){
        students = new HashMap();
    }

    public void enroll(Student student) {
        students.put(student , 0.0);
    }

    public Boolean isEnrolled(Student student) {
        return students.containsKey(student);
    }

    public void lecture(double numberOfHours) {

        for(Student student : students.keySet()){
            student.learn(numberOfHours);
            students.put(student , student.getTotalStudyTime());
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map mappy = new HashMap();

        for(Student student : students.keySet()){
            mappy.put(student , student.getTotalStudyTime());
        }
        return mappy;
    }
}
