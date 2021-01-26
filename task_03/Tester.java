import java.util.*;
public class Tester {
    public static void main(String [] args) {
        Scanner sks = new Scanner(System.in);
        Courses courses = new Courses();
        courses.addCourse("English Grammar", "John Smith");
        courses.addCourse("Mathematics", "Lara Gilbert");
        courses.addCourse("Physics", "Johanna Kabir");
        courses.addCourse("Chemistry", "Danniel Robertson");
        courses.addCourse("Biology", "Larry Cooper");
        showMainMenu();
        char input = sks.next().charAt(0);
        sks.nextLine();
        if(input=='A' || input=='a' ){
            courses.listCourses();
            while(true){
                String inputs = sks.nextLine();
                if(inputs.equals("")){
                    break;
                }
                int dayInd = Integer.parseInt(inputs.split(" ")[0]);
                int hrInd = Integer.parseInt(inputs.split(" ")[1]);
                int courseInd = Integer.parseInt(inputs.split(" ")[2]);
                courses.createRoutine(dayInd,hrInd,courseInd);
            }
            showMainMenu();
            input = sks.next().charAt(0);
            sks.nextLine();
        }

        if(input=='B' || input=='b' ){
            courses.showRoutine();
        }

        if(input=='C' || input=='c'  ){
            courses.showListWithTeachers();
        }
    }

    public static void showMainMenu(){
        System.out.println("A. Create Routine\nB. Show Routine\nC. List Courses with Teachers Name");
    }

}
