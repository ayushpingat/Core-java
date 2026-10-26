public class Main{
    public static void main(String[] args){
        doctor d=new doctor();
        d.name="Sujeet Jagtap";
        d.age=49;
        d.doc_id=5000;
        d.specialization="Orthopedic";
        d.info();

        patient p=new patient();
        p.name="Sujay";
        p.age=20;
        p.disease="hand fracture";
        p.symptoms="hand swollen";
        p.info();

    }

}
