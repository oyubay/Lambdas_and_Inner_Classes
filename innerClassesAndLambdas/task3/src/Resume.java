/* TODO */


import java.util.ArrayList;
import java.util.Comparator;
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
/* TODO */
    private Person per;

/* TODO */
//Create a List to hold values of type Education (exactly as in task 2)
    private List<Education> educations;

    /* TODO */
//Create a Priority Queue that holds values of type Experience.
    private PriorityQueue<Experience> experiences;
    public Resume(Person p){
        this.per = p;
        educations = new ArrayList<>();
        experiences = new PriorityQueue<>(new Comparator<Experience>() {
            @Override
            public int compare(Experience o1, Experience o2) {
                int compare =o2.toYear - o1.toYear;
                return compare;
            }
        });

///* TODO */
//Assign a value to the Person variable.
///* TODO */
//Initialize the List with Education objects.
///* TODO */
//Initialize the priority queue with a comparator defined in an anonymous inner class. Check the specs for the comparator.
    }

/* TODO */
//Add a standard getter for the experiences. getExperience. it should return a priority queue.
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
