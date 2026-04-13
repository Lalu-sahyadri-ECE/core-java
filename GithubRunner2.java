class GithubRunner2 {
    public static void main(String[] args) {

        Repository obj = new Repository();
        obj.id = 203;
        obj.repoName = "AI_Project2";
        obj.owner = "Spoorthi2";
        obj.stars = 1502;
        obj.size = 4.5;

        Github m = new Github();
        m.setDetails(obj);

        m.getDetails();
    }
}
