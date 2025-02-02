public class SimpleTask extends Task {
    protected String title;

    public SimpleTask(int id, String title) {
        // вызов родительского конструктора
        super(id);
        this.title = title; // заполнение своих полей
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean matches(String query) {

        if (title.contains(query)) {
            return true;
        }
        return false;
    }
}



