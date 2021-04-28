public class Task {
    public static void main(String[] args){
        Person p = new Person("Kim Possible","2000-01-01");
        p.setPosition("Associate", 34000);
        Resume r = new Resume(p);
        Resume.Education ed = r.new Education("NEIU", "Computer Science");
        r.addEducation(ed);
        Resume.Experience ex = new Resume.Experience("Software", 2021, 2025);
        r.addExperience(ex);
        r.addExperience(new Resume.Experience("DB administrator", 2019, 2026));
        r.addExperience(new Resume.Experience("Internship", 2016, 2017));
        System.out.println(r);
    }
}