import org.junit.Test;
import static org.junit.Assert.*;


public class SquadTest {
    @Test
    public void squad_instantiatesCorrectly_true() {
        Squad squad = new Squad("Budaa", "chafua", "12");
        assertTrue(squad instanceof Squad);
    }
    @Test
    public void squad_instantiatesWithName_String() {
        Squad squad = new Squad("Budaa", "Chafuaa", "12");
        assertEquals("Budaa", squad.getName());
    }
    @Test
    public void squad_instantiatesWithCause_String() {
        Squad squad = new Squad("Budaa", "Chafua", "12");
        assertEquals("Chafua", squad.getCause());
    }
    @Test
    public void squad_instantiatesWithMaximum_String() {
        Squad squad = new Squad("Budaa", "Amua", "12");
        assertEquals("12", squad.getMax());
    }
    @Test
    public void all_returnsAllInstancesOfSquad_true() {
        Squad squad = new Squad("Budaa", "Amua na Uchafue", "12");
        Squad squadTwo = new Squad("Fiasco", "Save the people", "13");
        assertEquals(true, Squad.all().contains(squad));
        assertEquals(true, Squad.all().contains(squadTwo));
    }
    @Test
    public void clear_emptiesAllSquadsFromList_0() {
        Squad squadTwo = new Squad("Fiasco", "Amua", "13");
        Squad.clear();
        assertEquals(Squad.all().size(), 0);
    }
//    @Test
//    public void getId_squadsInstantiateWithAnId_6() {
//        Squad squad = new Squad("Fiasco", "Chafua", "13");
//        assertEquals(6, squad.getId());
//    }
    @Test
    public void find_returnsSquadWithSameId_secondSquad() {
        Squad.clear();
        Squad squad = new Squad("Fiasco", "Chafua", "12");
        Squad squadTwo = new Squad("Fiasco", "Amua", "13");
        assertEquals(Squad.find(squadTwo.getId()), squadTwo);
    }
    @Test
    public void getTasks_initiallyReturnsEmptyList_ArrayList() {
        Squad.clear();
        Squad squadTwo = new Squad("Fiasco", "chafua", "13");
        assertEquals(0, squadTwo.getHeroes().size());
    }
    @Test
    public void addTask_addsTaskToList_true() {
        Squad squadTwo = new Squad("Fiasco", "Amulia", "13");
        Hero hero = new Hero("Franko","8","flash", "flasher");
        squadTwo.addHero(hero);
        assertTrue(squadTwo.getHeroes().contains(hero));
    }

}

