import java.util.Arrays;
public class Absent {
    public static void main(String[] args) {
        String[][] students={{"01","John Doe"},{"02","Jane Smith"},{"03","Alice Johnson"}};
        System.out.println("Students list: "+Arrays.deepToString(students));
        String absentrollno="02";
        for(int i=0;i<students.length;i++){
            if(students[i][0].equals("02")){
                System.out.println("Absent student: "+students[i][1]);
            }
        }
    }
}
 