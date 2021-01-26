import java.util.Arrays;

public class Courses {
    int count;
    Course [] courses;

    public Courses(){
        courses = new Course [5];
        count=0;
    }

    public void addCourse(String course, String teacher){
        Course newCourse = new Course(course, teacher);
        courses[count++]=newCourse;
    }

    public void listCourses() {
        for(int i = 0; i<count; i++){
            System.out.println((i+1)+" "+courses[i].courseName);
        }
    }

    public void showListWithTeachers(){
        for (int i =0; i<count;i++){
            System.out.println(courses[i].courseName+", "+courses[i].teachersName);
        }
    }

    public void createRoutine(int dayIndex, int hrIndex, int courseIndex){
        Routine newRoutine = new Routine(dayIndex, hrIndex);
        courses[courseIndex].routine = newRoutine;
    }

    public void showRoutine(){
        String [] courselist = sorting(courses);
        for(int i =0; i<count;i++){
            if(!courselist[i].equals("")) System.out.println(courselist[i]);
        }
    }
    
    public String [] sorting(Course[] courses){
        String [] courselist = new String[count];
        for(int i=0;i<count;i++){
            if(courses[i].routine==null) {
                courselist[i]="";
                continue;
            }
            String str = courses[i].routine.day+" "+courses[i].routine.hr+" "+courses[i].courseName;
            courselist[i] = str;
        }
        Arrays.sort(courselist);
        return courselist;
    }
}
