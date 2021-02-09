package penguin.service;
import penguin.repository.*;
import java.util.Arrays;
class Services {
    int count;
    Storage courses;
    public Services(){
        courses = new Storage(5);
        count=0;
    }
    public void addCourse(String course, String teacher){
        courses.add(course, teacher);
        count++;
    }

    public void listCourses() {
        for(int i = 0; i<count; i++){
            System.out.println((i+1)+" "+courses.getCourse(i));
        }
    }

     public void showListWithTeachers(){
         for (int i =0; i<count;i++){
             System.out.println(courses.getCourse(i)+", "+courses.getTeacher(i));
         }
     }

     public void createRoutine(int dayIndex, int hrIndex, int courseIndex){
         courses.addRoutine(courseIndex,dayIndex, hrIndex);
     }

     public void showRoutine(){
         String []  courselist = sorting();
         for(int i =0; i<count;i++){
             if(!courselist[i].equals("")) System.out.println(courselist[i]);
         }
     }
    
     public String [] sorting(){
         String [] courselist = new String[count];
         for(int i=0;i<count;i++){
             if(courses.getRoutine(i)==null) {
                 courselist[i]="";
                 continue;
             }
             String str = courses.getRoutine(i).day+" "+courses.getRoutine(i).hr+" "+courses.getCourse(i);
             courselist[i] = str;
         }
         Arrays.sort(courselist);
         return courselist;
     }
}
