import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException, InvalidCatalogException {
        Main app = new Main();
        app.testCreateSave();

    }

    private void testCreateSave() throws IOException, InvalidCatalogException {
        Catalog catalog = new Catalog("MyRefs");
        var book = new Item("knuth67","The Art of Computer Programming","d:/books/programming/tacp.ps","1967","Donald E. Knuth");
        var article = new Item("book1", "The Java Language Specification","https://docs.oracle.com/javase/specs/jls/se17/html/index.html","2021","James Gosling & others");
        catalog.add(book);
        catalog.add(article);

        CatalogUtil.save(catalog, "F:/Facultate/JAVA2022/json/test1.json" );
        CatalogUtil.load("F:/Facultate/JAVA2022/json/test.json");
    };



}
