public class StudentToString {
    String name;
    int age;
    int rollnumber;
    String house;

    public StudentToString(String name, int age,int rollnumber,String house){
        this.name = name;
        this.age = age;
        this.rollnumber = rollnumber;
        this.house = house; 
    }
    @Override
    public String toString() {
        return "Student Details:{name:"+ name +", age : "+ age +", roll number: "+ rollnumber +", house:"+ house +" }" ;
    }
    public static void main(String[] args){
        StudentToString stu = new StudentToString("Siddhi", 20, 34, "Suyash");
        System.out.println(stu);
    }
}
