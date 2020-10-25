public class ToStringOverrite {
    int nr;
    String name;
    String city;

    public ToStringOverrite(int nr, String name, String city) {
        this.nr = nr;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nr=" + nr +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
