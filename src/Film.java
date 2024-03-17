public class Film extends Author {
    String name_movie;
    int year_movie;

    public void info() {
        System.out.println("Nazwa filmu to " + name_movie + " Rok produkcji filmu to " + year_movie + " Autorem jest " + this.getName_author() + " urodzony w " + this.getYear_author());
    }

}
