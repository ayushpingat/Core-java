abstract class Vehicle {
    String vehicleno;
    String vehiclename;
    int rentperday;
    Vehicle(String vehicleno, String vehiclename, int rentperday){
        this.vehicleno=vehicleno;
        this.vehiclename=vehiclename;
        this.rentperday=rentperday;
    }
    abstract void calrent(int days);
    abstract void displaydetails();
}



