package inheritance;

public class Manager extends Employee{

    private int teamSize;
    public void setTeamSize(int teamSize){
        this.teamSize=teamSize;
    }
    public int getTeamSize(){
        return teamSize;
    }

    public static void main(String[] args) {
        Manager manager=new Manager();
        manager.setId(1);
        manager.setName("Rohan");
        manager.setSalary(34500.00);
        manager.setTeamSize(4);

        System.out.println(manager.getId());
        System.out.println(manager.getName());
        System.out.println(manager.getSalary());
        System.out.println(manager.getTeamSize());
    }
}
