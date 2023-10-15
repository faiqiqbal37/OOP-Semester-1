public class PHDThesis extends Publication{
    private int numChapters;
    private String university;
    private String supervisor;

    public PHDThesis(int numChapters, String university, String supervisor) {
        this.numChapters = numChapters;
        this.university = university;
        this.supervisor = supervisor;
    }

    public PHDThesis(String t, String a, int i, int n, int numChapters, String university, String supervisor) {
        super(t, a, i, n);
        this.numChapters = numChapters;
        this.university = university;
        this.supervisor = supervisor;
    }

    public int getNumChapters() {
        return numChapters;
    }

    public void setNumChapters(int numChapters) {
        this.numChapters = numChapters;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
}
