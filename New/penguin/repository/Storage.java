package penguin.repository;
import penguin.model.*;
public class Storage {
    Course [] courses;
    int count;
    public Storage(int size){
        courses = new Course[size];
        count = 0;
    }
    public void add(String courseName, String teacherName){
        Course newCourse = new Course(courseName, teacherName);
        courses[count++] = newCourse;
    }
    public void addRoutine(int courseIndex,int dayIndex,int hrIndex){
        Routine newRoutine = new Routine(dayIndex, hrIndex);
        courses[courseIndex].routine = newRoutine;
    }
    private Course content(int courseIndex){
        return courses[courseIndex];
    }

    public String getTeacher(int courseIndex){
        Course course= content(courseIndex);
        return course.teachersName;
    }

    public String getCourse(int courseIndex){
        Course course= content(courseIndex);
        return course.courseName;
    }

    public Routine getRoutine(int courseIndex){
        Course course= content(courseIndex);
        return course.routine;
    }
}
