package Basic_Questions;

public class ArrayWithObjects {
    public static void main(String[] args) {
        Student[] students=new Student[2];
        students[0] =new Student(1,"rohan");
        students[1]=new Student(2,"Rahul");

        for (Student student:students){
            System.out.println("Stud Id :"+student.getId()+" Name :"+student.getName());
        }
    }
}
//🧠 Hinglish Summary:
//Java mein hum array sirf primitive types ke nahi, objects ke bhi bana sakte hain.
//Har index par ek class ka object hota hai. Ye concept bahut
// useful hai jab multiple objects handle karne ho — jaise student list, product list, etc.