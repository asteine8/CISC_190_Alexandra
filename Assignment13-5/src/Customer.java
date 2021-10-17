public class Customer {
    public long id;
    public String firstName;
    public String lastName;
    public double balanceOwed;

    public Customer(long _id, String _first, String _last, double _balanceOwed) {
        id = _id;
        firstName = _first;
        lastName = _last;
        balanceOwed = _balanceOwed;
    }

    public String toCSVLine() {
        return this.toCSV()+"\n";
    }

    public String toCSV() {
        return id+","+firstName+","+lastName+","+balanceOwed;
    }
}
