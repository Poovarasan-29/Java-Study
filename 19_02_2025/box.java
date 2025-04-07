public class box {
    String title;
    float prize;
    public box(){
     this.title = "java";
     this.prize = 100.0f;
     
    }
    void display(){
        System.out.println("booktitle = "+title);
        System.out.println("bookprize = "+prize);

    }
    public static void main(String args[]){
        box mybox = new box();
         mybox.display();

    }
}
