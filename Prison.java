class Prison {

    Criminal criminal;

    public void setDetails(Criminal criminal) {
        this.criminal = criminal;
    }

    public void getDetails() {
        System.out.println("id: " + criminal.id);
        System.out.println("name: " + criminal.name);
        System.out.println("crime: " + criminal.crime);
        System.out.println("sentenceYears: " + criminal.sentenceYears);
        System.out.println("fine: " + criminal.fine);
        System.out.println("----------------------");
    }

    Prison(Criminal criminal) { this.criminal = criminal; }

    Prison() {}
}
