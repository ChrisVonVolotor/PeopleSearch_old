import javax.naming.directory.SearchControls;
import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorldInc {
    public static void main(String[] args) {

       Person Staff1 = new Person("Boris", "54", "Manager");
        Person Staff2 = new Person("Amanda", "29", "Head Mechanic");
        Person Staff3 = new Person("Mikel", "22", "Salesman");
        String searchPull;


        ArrayList<Person> StaffList = new ArrayList<Person>();

        StaffList.add(Staff1);
        StaffList.add(Staff2);
        StaffList.add(Staff3);

        for (Person Staff : StaffList) {
            System.out.println(Staff.getName());

        }

        searchPull = searchStaff(StaffList);
        System.out.println(searchPull);






    }

    private static String searchStaff(ArrayList<Person> StaffList) {
        Scanner sc = new Scanner(System.in);
        String search = "";
        String foundName = "";
        String foundAge = "";
        String foundJob = "";

        boolean found = false;
        boolean realSearch = false;

        while (found == false) {

            do {
                System.out.println("Please enter a member of staff");
                search = sc.nextLine();

                if (search == "") {
                    realSearch = false;
                } else {
                    realSearch = true;
                }

            } while (!realSearch);

            for (Person Staff : StaffList) {




                if (Staff.getName().equals(search)) {
                    found = true;

                    foundName = Staff.getName();
                    foundAge = Staff.getAge();
                    foundJob = Staff.getJobTitle();

                }

            }
        }

        sc.close();
        return "Our " + foundName + ", there " + foundAge + ", and they are our " + foundJob;
    }
}
