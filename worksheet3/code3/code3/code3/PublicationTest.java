public class PublicationTest {

    public static void main(String[] args) {

        Publication publication = new Publication("Intro To Java", "James Waterloo", 112121, 526);

        Book book = new Book("Intro To Java", "James Benedict", 112121, 526, 25);

        MagazineArticle magazineArticle = new MagazineArticle("Intro To Java", "James Benedict", 112121, 526, "Vogue Tech", 2, 54, 54);

        PHDThesis PHDThesis = new PHDThesis("Intro To Java", "James Benedict", 112121, 526, 26, "University of Sheffield", "Haan Steve");


        System.out.println(publication.toString());
        System.out.println(book.toString());
        System.out.println(magazineArticle.toString());
        System.out.println(PHDThesis.toString());


    }
}
