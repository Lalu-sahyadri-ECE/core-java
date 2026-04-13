class PrisonRunner3 {
    public static void main(String[] args) {

        Criminal obj = new Criminal();
        obj.id = 504;
        obj.name = "Arjun3";
        obj.crime = "Theft3";
        obj.sentenceYears = 6;
        obj.fine = 20003.0;

        Prison m = new Prison(obj);

        m.getDetails();
    }
}
