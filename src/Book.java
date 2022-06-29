public class Book {
    private final String bookName;
    private final Author author;
    int publicationYear;



    public Book (String bookName,Author author,int publicationYear){
        this.author=author;
        this.bookName=bookName;
        this.publicationYear=publicationYear;
    }

    public String getBookName(){
        return this.bookName;

    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int newYear) {
        this.publicationYear = newYear;}

    @Override
    public boolean equals(Object obj){
        Book ob = (Book) obj;
        if (this == obj) return true;
        else if (this.bookName == ob.getBookName() && (this.author == ob.getAuthor())&& this.publicationYear == ob.getPublicationYear())
            return true;
        else
            return false;
    }
    @Override
    public int hashCode() {
        return this.bookName.hashCode() + this.author.hashCode();
    }
    @Override
    public String toString() {
        return "Имя Книги "+ this.bookName + "Автор "+ this.author;
    }
}
