class Car extends Vehicle{
    int ans;

    Car(String vehicleno, String vehiclename, int rentperday){
        super(vehicleno,vehiclename,rentperday);
    }

    void calrent(int days){
        ans= rentperday* days;
    }

    void displaydetails(){
        System.out.println("Vehicle Number: " + vehicleno);
        System.out.println("Vehicle Name: " + vehiclename);
        System.out.println("Rent Per Day: " + rentperday);
        System.out.println("Your total rent is: " + ans);        
    }
}