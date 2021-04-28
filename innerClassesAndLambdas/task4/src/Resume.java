import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Resume {
/* TODO */
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
    private PriorityQueue<Experience> experiences;

    public Resume(Person p){
        this.per = p;
        educations = new ArrayList<>();
        experiences = new PriorityQueue<>((Experience o1, Experience o2) ->o2.toYear - o1.toYear);
/* TODO */

// /* TODO */

    }

    public PriorityQueue<Experience> getExperience(){return experiences;}

    /* TODO */
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


}
