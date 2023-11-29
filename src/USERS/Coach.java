package USERS;

public class Coach extends USER {
    int workingHours;
    private static int counter=0;
    private int coachID;
    public Coach(String address, String email, String name, String pass, char gender, int phoneNO,int workingHours){
        super(address, email, name, pass, gender, phoneNO);
        counter++;
        coachID=counter;
        this.workingHours=workingHours;
    }

    public int getCoachID() {
        return coachID;
    }

    public void setCoachID(int coachID) {
        this.coachID = coachID;
    }

    public void displayInfo(int ID){
        System.out.println("Coach's ID: "+ getCoachID());
        System.out.println("Coach's address: "+ getAddress());
        System.out.println("Coach's email: "+ getEmail());
        System.out.println("Coach's name: "+ getName());
        System.out.println("Coach's password: "+ getPass());
        System.out.println("Coach's gender: "+ getGender());
        System.out.println("Coach's phone number: "+ getPhoneNO());
        System.out.println("Coach's working hours: "+workingHours);
    }

    //overridden login
    //method
    public  void login(String username, String password){

    }
}
