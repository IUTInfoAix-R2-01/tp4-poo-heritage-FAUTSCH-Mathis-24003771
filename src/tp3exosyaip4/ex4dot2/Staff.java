package tp3exosyaip4.ex4dot2;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff [" + super.toString() + ", school=" + school + ", pay=" + pay + "]";
    }

    public static void main(String[] args) {
        Staff staff = new Staff("Jane", "456 Elm St", "High School", 2000);
        System.out.println(staff);

        staff.setSchool("Middle School");
        staff.setPay(3000);
        System.out.println(staff);
    }
}
