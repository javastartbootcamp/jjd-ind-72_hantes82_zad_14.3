import java.util.Objects;

public class Country {
    private String code;
    private String name;
    private long peopleNumber;

    public Country(String code, String name, long peopleNumber) {
        this.code = code;
        this.name = name;
        this.peopleNumber = peopleNumber;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public long getPeopleNumber() {
        return peopleNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Country country)) {
            return false;
        }
        return peopleNumber == country.peopleNumber && Objects.equals(code, country.code) && Objects.equals(name, country.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, peopleNumber);
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryCode='" + code + '\'' +
                ", countryName='" + name + '\'' +
                ", peopleNumber=" + peopleNumber +
                '}';
    }
}
