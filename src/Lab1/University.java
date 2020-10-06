package Lab1;

public class University {

    String name;
    int foundationYear;

    public University(String name, int foundationYear) {
        this.name = name;
        this.foundationYear = foundationYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

}

