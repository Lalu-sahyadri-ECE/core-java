class Github {

    Repository repository;

    public void setDetails(Repository repository) {
        this.repository = repository;
    }

    public void getDetails() {
        System.out.println("id: " + repository.id);
        System.out.println("repoName: " + repository.repoName);
        System.out.println("owner: " + repository.owner);
        System.out.println("stars: " + repository.stars);
        System.out.println("size: " + repository.size);
        System.out.println("----------------------");
    }

    Github(Repository repository) { this.repository = repository; }

    Github() {}
}
