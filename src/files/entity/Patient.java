package files.entity;

public class Patient {

    private String name;
    private String lastVisitDate;
    private String nextVisitTime;

    public Patient(String name, String lastVisitDate, String nextVisitTime) {
        this.name = name;
        this.lastVisitDate = lastVisitDate;
        this.nextVisitTime = nextVisitTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastVisitDate() {
        return lastVisitDate;
    }

    public void setLastVisitDate(String lastVisitDate) {
        this.lastVisitDate = lastVisitDate;
    }

    public String getNextVisitTime() {
        return nextVisitTime;
    }

    public void setNextVisitTime(String nextVisitTime) {
        this.nextVisitTime = nextVisitTime;
    }

    @Override
    public String toString() {
        return name + "," + lastVisitDate + "," + nextVisitTime + '\n';
    }
}
