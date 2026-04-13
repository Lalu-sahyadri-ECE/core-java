class Mortuary {

    Body body;

    public void setDetails(Body body) {
        this.body = body;
    }

    public void getDetails() {
        System.out.println("id: " + body.id);
        System.out.println("name: " + body.name);
        System.out.println("cause: " + body.cause);
        System.out.println("age: " + body.age);
        System.out.println("weight: " + body.weight);
        System.out.println("----------------------");
    }

    Mortuary(Body body) { this.body = body; }

    Mortuary() {}
}
