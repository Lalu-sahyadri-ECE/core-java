class GithubRunner3 {
    public static void main(String[] args) {

        Repository obj = new Repository();
        obj.id = 204;
        obj.repoName = "AI_Project3";
        obj.owner = "Spoorthi3";
        obj.stars = 1503;
        obj.size = 5.5;

        Github m = new Github(obj);

        m.getDetails();
    }
}
