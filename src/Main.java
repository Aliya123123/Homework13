import java.util.Objects;

class Author {
    private String name;
    private String surname;
    public Author(String name,String surname) {
        this.name= name;
        this.surname = surname;
    }
    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public String toString() {
        return "Имя " + this.name + ", Фамилия " + this.surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}



class Book {
    private String nameBook;
    private Author authorBook;
    private int yearBook;
    public Book(String nameBook,Author authorBook, int yearBook) {
        this.nameBook= nameBook;
        this.authorBook = authorBook;
        this.yearBook = yearBook;

    }
    public String getNameBook() {
        return this.nameBook;
    }
    public Author getAuthorBook() {
        return this.authorBook;
    }
    public int getYearBook() {
        return this.yearBook;
    }
    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }
    public String toString() {
        return "Наименование " + this.nameBook + ", Автор " + this.authorBook + ", год выпуска " + this.yearBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearBook == book.yearBook && Objects.equals(nameBook, book.nameBook) && Objects.equals(authorBook, book.authorBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, authorBook, yearBook);
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        Author author1 = new Author("Кристиан ", "Ханс");
        Author author2 = new Author("Шарль ", "Перро");
        Book one = new Book ("Русалочка",author1, 2013);
        Book two  = new Book ("Золушка",author2,2020 );
        System.out.println(one);
        System.out.println(two);
        one.setYearBook(2016);
        System.out.println("YearBook = " + one.getYearBook());
        System.out.println(one.equals(two));
        System.out.println(author1.equals(author2));
        System.out.println(Objects.hash());
    }}

