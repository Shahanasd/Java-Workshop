class Student{
        String name;
        int regno;
        void getdata(String sname , int rno){
            name=sname;
            regno=rno;
        }
        void putdata(){
            System.out.println("Name:" +name);
            System.out.println("RegNo:" +regno);
        }
}
class mark extends Student{
    int m1,m2,m3;
    void getmarks(int mr1,int mr2,int mr3){
        m1=mr1;
        m2=mr2;
        m3=mr3;
    }
    void putmarks(){
        System.out.println("Mark 1=" +m1);
        System.out.println("Mark 2=" +m2);
        System.out.println("Mark 3=" +m3);
    }
}
interface S{
    int prac_mark=60;
}
class result extends mark implements S{
    int total;
    void display(){
        putdata();
        putmarks();
        System.out.println("practical mark=" +prac_mark);
        total=m1=m2=m3;
        System.out.println("Total Marks=" +total);
        if((m1>40) && (m2>40) && (m3>40) && (prac_mark>40)){
            System.out.println("Student pass");
        }else{
            System.out.println("Student fail");
        }
    }
}
public class StudentList{
    public static void main(String[] args) {
        result st=new result();
        st.getdata("Shahana", 24221316);
        st.getmarks(90, 98, 95);
        st.display();
    }
}