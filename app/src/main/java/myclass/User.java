package myclass;

public class User {
    private String name;
    private String score;
    private String category;
    private Integer selfie;

    public User(String name, String score, String category, Integer selfie) {
        this.name = name;
        this.score = score;
        this.category = category;
        this.selfie = selfie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getSelfie() {
        return selfie;
    }

    public void setSelfie(Integer selfie) {
        this.selfie = selfie;
    }
}
