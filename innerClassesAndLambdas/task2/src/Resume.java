import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Resume {

    public class Education {
        String school;
        String major;

        public Education(String school, String major) {
            this.school = school;
            this.major = major;
        }

        public void setMajor(String major) {
            this.major = major;
        }

        public void setSchool(String name) {
            this.school = name;
        }

        public String getMajor() {
            return major;
        }

        public String getSchool() {
            return school;
        }

        @Override
        public String toString() {
            return major + " at " + school;
        }
    }

    public static class Experience{
        String title;
        int startYear;
        int toYear;
        public Experience(String title, int startYear, int endYear){
            this.title = title;
            this.startYear = startYear;
            this.toYear = endYear;
        }
        @Override
        public String toString() {
            return startYear + "-"+toYear+": "+title;
        }
    }

    private Person per;
    private List<Education> educations;
    private List<Experience>  experiences;



///* TODO */
//Create a public member inner class Education according to the specifications.

///* TODO */
//Create a public static inner class called Experience, according to the specifications.

///* TODO */
//Create the Person and List of Education and List of experience objects. They should be private.
    public Resume(Person p){
        this.per = p;
        educations = new ArrayList<>();
        experiences = new ArrayList<>();
///* TODO */
//This constructor should initialize the person and do all necessary initializations for the other methods to work.
    }
    public void addExperience(Experience ex){
        experiences.add(ex);
    }
    public void addEducation(Education ed){
        educations.add(ed);
    }

    @Override
    public String toString() {
        String s = per.toString();
        s+="\nExperience";
        for(Experience e : experiences)
            s+="\n"+e;
        s+="\nEducation";
        for(Education e: educations)
            s+="\n"+e;
        return s;
    }
    ///* TODO */
//Create the addEducation, addExperience and override the toString methods as specified.



}
