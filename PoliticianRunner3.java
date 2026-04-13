class PoliticianRunner3 {
    public static void main(String[] args) {

        Voter obj = new Voter();
        obj.id = 304;
        obj.voterName = "Suresh";
        obj.age = 38;
        obj.constituency = "Bangalore South3";
        obj.income = 500003.0;

        Politician m = new Politician(obj);

        m.getDetails();
    }
}
