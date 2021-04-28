/* TODO */
import java.time.LocalDate;
import java.time.Period;


public class Person{
    private String name;
    private LocalDate birthDate;

    private class Position{
        String name;
        double salary;

        public Position(String position, double salary) {
            this.name = position;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return name+":"+salary;
        }
    }
    private Position position;
    public Person(String name, String birthDate){
        this.name = name;
        this.birthDate =  LocalDate.parse(birthDate);
    }
    public int getAge(){
        return -1* Period.between(LocalDate.now(), this.birthDate).getYears();
    }

    public void setPosition(String position, double salary) {
        this.position = new Position(position, salary);
    }

    public Position getPosition() {
        return position;
    }
    public String toString(){
        return name + getAge() + getPosition();
    }
}