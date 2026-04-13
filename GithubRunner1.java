class GithubRunner1 {
    public static void main(String[] args) {

        Repository obj = new Repository();
        obj.id = 202;
        obj.repoName = "AI_Project1";
        obj.owner = "Spoorthi1";
        obj.stars = 1501;
        obj.size = 3.5;

        Github m = new Github();
        m.repository = obj;

        m.getDetails();
    }
}
