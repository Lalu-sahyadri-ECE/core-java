class PrisonRunner2 {
    public static void main(String[] args) {

        Criminal obj = new Criminal();
        obj.id = 503;
        obj.name = "Arjun2";
        obj.crime = "Theft2";
        obj.sentenceYears = 5;
        obj.fine = 20002.0;

        Prison m = new Prison();
        m.setDetails(obj);

        m.getDetails();
    }
}
