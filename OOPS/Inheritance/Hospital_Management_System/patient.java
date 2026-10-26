public class patient extends human{
    String disease;
    String symptoms;

    void info(){
        System.out.println("===========================================================");
        System.out.println("Patient Information");
        System.out.println("name:"+ name);
        System.out.println("gender:"+ gender);
        System.out.println("age:" + age);
        System.out.println("phone no:" + phone_no);
        System.out.println("disease:" + disease);
        System.out.println("symptoms:" + symptoms);
        System.out.println("===========================================================");


    }
}