import java.util.ArrayList;
import java.util.Scanner;

public class Person {

    private String name;
    private String age;
    private String jobTitle;

    Person (String staffName, String staffAge, String staffTitle){
        name = staffName;
        age = staffAge;
        jobTitle = staffTitle;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}

