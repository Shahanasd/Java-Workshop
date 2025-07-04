public class Employeearray {
    public static void main(String[] args) {
        Integer[][] Employee=new Integer[5][2];
        Employee[0][0]=1;
        Employee[0][1]=10000;
        Employee[1][0]=2;
        Employee[1][1]=15000;
        Employee[2][0]=3;
        Employee[2][1]=20000;
        Employee[3][0]=4;
        Employee[3][1]=25000;
        Employee[4][0]=5;
        Employee[4][1]=30000;
        System.out.println("Employee ID \t Salary");
        for(int i=0;i<Employee.length;i++){
            System.out.println(Employee[i][0] + "\t\t" + Employee[i][1]);
        }
    }
}
        

