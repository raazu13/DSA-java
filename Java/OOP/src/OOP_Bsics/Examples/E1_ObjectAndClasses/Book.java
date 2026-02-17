package OOP_Bsics.Examples.E1_ObjectAndClasses;

public class Book {
    int pages;
    String name;
    int edition;

    Book(String name){
        this.name=name;
    }

    Book(String name, int edition,int pages){
        this.name=name;
        this.edition=edition;
        this.pages=pages;
    }


    @Override
    public String toString(){
        return "Book{pages="+pages+" name="+name+" edition="+edition+"}";
    }

}
