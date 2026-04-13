class PoliticianRunner1 {
    public static void main(String[] args) {

        Voter obj = new Voter();
        obj.id = 302;
        obj.voterName = "Suresh";
        obj.age = 36;
        obj.constituency = "Bangalore South1";
        obj.income = 500001.0;

        Politician m = new Politician();
        m.voter = obj;

        m.getDetails();
    }
}
