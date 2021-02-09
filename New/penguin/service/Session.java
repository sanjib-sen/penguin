package penguin.service;
import java.util.Scanner;
public class Session{
    static Services service;

    public Session(){
        service = new Services();
        service.addCourse("English Grammar", "John Smith");
        service.addCourse("Mathematics", "Lara Gilbert");
        service.addCourse("Physics", "Johanna Kabir");
        service.addCourse("Chemistry", "Danniel Robertson");
        service.addCourse("Biology", "Larry Cooper");
        showMainMenu();
        Scanner sks = new Scanner(System.in);
        char input = sks.next().charAt(0);
        sks.nextLine();
        input(input);
    }

    public static void showMainMenu(){
        System.out.println("A. Create Routine\nB. Show Routine\nC. List service with Teachers Name");
    }

    public void input(char input){
        Scanner sks = new Scanner(System.in);
        if(input=='A' || input=='a' ){
            service.listCourses();
            while(true){
                String inputs = sks.nextLine();
                if(inputs.equals("")){
                    break;
                }
                int dayInd = Integer.parseInt(inputs.split(" ")[0]);
                int hrInd = Integer.parseInt(inputs.split(" ")[1]);
                int courseInd = Integer.parseInt(inputs.split(" ")[2]);
                service.createRoutine(dayInd,hrInd,courseInd);
            }
            showMainMenu();
            input = sks.next().charAt(0);
            sks.nextLine();
        }

        if(input=='B' || input=='b' ){
            service.showRoutine();
        }

        if(input=='C' || input=='c'  ){
            service.showListWithTeachers();
        }
    }
}