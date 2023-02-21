import java.io.FileNotFoundException;

public class CatApp {
    private CatForm catForm;
    private CatWriter catWriter;

    public CatApp() throws FileNotFoundException {
        catForm = new CatForm();
        catWriter = new CatWriter();
    }

    public void run() {
        catForm.showTitle();
        do {
            Cat cat = catForm.showForm();
            catWriter.write(cat);
        } while (catForm.showContinue());
        catForm.close();
        catWriter.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new CatApp().run();
    }
}