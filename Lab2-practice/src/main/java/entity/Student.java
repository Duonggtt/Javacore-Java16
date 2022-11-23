
package main.java.entity;

public class Student {
    private int id;
    private String name;
    private float scoreMath;
    private float scorePysic;
    private float scoreChemistry;
    private float avgScore = 0;
    private String rank;

    public float getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(float avgScore) {
        this.avgScore = avgScore;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(float scoreMath) {
        this.scoreMath = scoreMath;
    }

    public float getScorePysic() {
        return scorePysic;
    }

    public void setScorePysic(float scorePysic) {
        this.scorePysic = scorePysic;
    }

    public float getScoreChemistry() {
        return scoreChemistry;
    }

    public void setScoreChemistry(float scoreChemistry) {
        this.scoreChemistry = scoreChemistry;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", scoreMath=" + scoreMath + ", scorePysic=" + scorePysic + ", scoreChemistry=" + scoreChemistry + '}';
    }

    
    
}
