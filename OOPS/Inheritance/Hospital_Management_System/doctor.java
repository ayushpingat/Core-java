public class doctor extends human{
    String specialization;
    String experience;
    int doc_id;

    void info(){
        System.out.println("===========================================================");
        System.out.println("Doctor Information");
        System.out.println("name:"+ name);
        System.out.println("gender:"+ gender);
        System.out.println("age:" + age);
        System.out.println("phone no:" + phone_no);
        System.out.println("doc_id:"+ doc_id);
        System.out.println("specialization:"+ specialization);
        System.out.println(" ");
        System.out.println("===========================================================");
    }
}