import org.junit.jupiter.api.Assertions;import org.junit.jupiter.api.Test;
class SimpleTaskTest {
    @Test
    public void testSimpleMatch(){        SimpleTask simpleTask = new SimpleTask(5, "Написать дневной отчет");
        boolean expected = true;
        boolean actual = simpleTask.matches("Написать");       Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSimpleNoMatch() {        SimpleTask simpleTask = new SimpleTask(5, "Написать дневной отчет");
        boolean expected = false;
        boolean actual = simpleTask.matches("Отдохнуть");        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGet() {        SimpleTask simpleTask = new SimpleTask(5, "Написать дневной отчет");

        String expected = "Написать дневной отчет";
        String actual = simpleTask.getTitle();
    }
}
