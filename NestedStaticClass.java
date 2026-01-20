
class Library {

    static class Books {

        static class Games {

            void show() {
                System.out.println("Games");
            }

        }

        void show() {
            System.out.println("Books");
        }
    }

    void show() {
        System.out.println("Library");
    }

}

public class NestedStaticClass {

    public static void main(String[] args) {
        Library a = new Library();
        Library.Books b = new Library.Books();
        Library.Books.Games c = new Library.Books.Games();

        a.show();
        b.show();
        c.show();
    }

}
