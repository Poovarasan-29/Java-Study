// public class cars {
//     String brand;
//     cars(){
//         this.brand = "unknown";
//         System.out.println("brandname " + brand);

//     }
//     void setchange(){
//         brand = "bmw";
//         System.out.println("brand name " + brand);

//     }
//     public static void main(String args[]){
//         cars mycars = new cars();
//         mycars.setchange();
//     }
// }


// public class counte{
//     static int count;
//     counte(){
//         count = count + 1;
//         System.out.println("object created correct count = " + count);

//     }
//     public static void main (String args[]){
//         new counte();
//         new counte();
//         new counte();
//         new counte();
//     }
// }
// public class counte{
//     String model;
//     counte(String name){
//         model = name;
      
//     }
//     void display(){
//         System.out.println("name of the car : " + model);

//     }
//     public static void main (String args[]){
//         counte car = new counte("toyota");
//         car.display();
        
//     }
// }
public class book{
    String title;
    String author;
    float prize;
    book(String title,String author,float prize){
        this.title = title;
        this.author = author;
        this.prize = prize;
    }
    void display(){
        System.out.println("book title :"+title);
        System.out.println("book author : "+author);
        System.out.println("book prize :" +prize);

    }
    public static void main(String args[]){
        book mybook = new book("the great communist","marx",200.0f);
        mybook.display();
    }
}
