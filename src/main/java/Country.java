import java.util.Objects;

public class Country {
    private String countryCode;
    private String countryName;
    long peopleNumber;

    public Country(String countryCode, String countryName, long peopleNumber) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.peopleNumber = peopleNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
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
        return peopleNumber == country.peopleNumber && Objects.equals(countryCode, country.countryCode) && Objects.equals(countryName, country.countryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryCode, countryName, peopleNumber);
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", peopleNumber=" + peopleNumber +
                '}';
    }
}
