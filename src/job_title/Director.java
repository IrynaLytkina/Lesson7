package job_title;

public class Director implements Employees {

    private String emp;

    Director(String emp) {
        this.emp = emp;
    }

    public void print() { System.out.println("Job title: " + emp); }
}
