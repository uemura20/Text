package test;
class Sample16 {
    public static void main(String args[]){
        Book book1 = new Book("本1", "著者1", "2020/03/23", 1, 1500);
        Book book2 = book1;

        System.out.println("book1の情報");
        book1.showBook();
        System.out.println("book2の情報");
        book2.showBook();

        book2.versionUp();
        System.out.println("book1の情報");
        book1.showBook();
        System.out.println("book2の情報");
        book2.showBook();
    }
}

class Book {
    String title;
    String author;
    String date;
    int version;
    int price;

    Book(String title, String author, String date, int version, int price){
        this.title = title;
        this.author = author;
        this.date = date;
        this.version = version;
        this.price = price;
    }

    void versionUp(){
        this.version++;
    }

    void showBook(){
        System.out.println(this.title + " : " + this.author + " : " + this.date + " : 第" + this.version + "版 : " + this.price + "円");
    }
}