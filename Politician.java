class Politician {

    Voter voter;

    public void setDetails(Voter voter) {
        this.voter = voter;
    }

    public void getDetails() {
        System.out.println("id: " + voter.id);
        System.out.println("voterName: " + voter.voterName);
        System.out.println("age: " + voter.age);
        System.out.println("constituency: " + voter.constituency);
        System.out.println("income: " + voter.income);
        System.out.println("----------------------");
    }

    Politician(Voter voter) { this.voter = voter; }

    Politician() {}
}
