class PrisonRunner1 {
    public static void main(String[] args) {

        Criminal obj = new Criminal();
        obj.id = 502;
        obj.name = "Arjun1";
        obj.crime = "Theft1";
        obj.sentenceYears = 4;
        obj.fine = 20001.0;

        Prison m = new Prison();
        m.criminal = obj;

        m.getDetails();
    }
}
