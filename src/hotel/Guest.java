package hotel;

import java.time.LocalDate;

public class Guest {
    private String name;
    private String surname;
    private LocalDate birthday;

    public Guest(String name, String surname, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public int getAge(){
        return LocalDate.now().getYear()-birthday.getYear();
    }



    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
