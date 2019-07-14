public class Husband {

    String name;
    int iq;

    public Husband(String name, int iq) {
        this.name = name;
        this.iq = iq;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "name='" + name + '\'' +
                ", iq=" + iq +
                '}';
    }
}
