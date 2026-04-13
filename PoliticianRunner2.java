class PoliticianRunner2 {
    public static void main(String[] args) {

        Voter obj = new Voter();
        obj.id = 303;
        obj.voterName = "Suresh";
        obj.age = 37;
        obj.constituency = "Bangalore South2";
        obj.income = 500002.0;

        Politician m = new Politician();
        m.setDetails(obj);

        m.getDetails();
    }
}
