public class Author {
    private final String name;

    private String surname;


    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public boolean equals(Object obj) {
        Author ob = (Author) obj;
        if (this == obj) return true;
        else if (this.name == ob.getName() && (this.surname == ob.getSurname()))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.surname.hashCode();
    }

    @Override
    public String toString() {
        return "Имя " + this.name + "Фамилия " + this.surname;
    }
}
