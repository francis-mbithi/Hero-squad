import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HeroTest {
    @Test
    public void Hero_instantiateCorrectly_true(){
        Hero hero = new Hero("","","","");
        assertTrue(hero instanceof Hero);
    }

    @Test
    public void Hero_instantiatesWithName_String() {
        Hero hero = new Hero("Frank","7","rush","light");
        assertEquals("Frank", hero.getName());
    }
    @Test
    public void Hero_instantiatesWithAge_int() {
        Hero hero = new Hero("Frank","8","rush","light");
        assertEquals("8", hero.getAge());
    }
    @Test
    public void Hero_instantiatesWithPower_String() {
        Hero hero = new Hero("Frank","8","rush","light");
        assertEquals("rush", hero.getPower());
    }
//    @Test
//    public void Hero_instantiatesWithPower_String() {
//        Hero hero = new Hero("Jon","8","sleep","light");
//        assertEquals("sleep", hero.getPower());
//    }
    @Test
    public void Hero_instantiatesWithWeakness_String() {
        Hero hero = new Hero("Jon","8","sleep","light");
        assertEquals("light", hero.getWeakness());
    }
    @Test
    public void all_returnsAllInstancesOfHero_true(){
        Hero heroOne = new Hero("Yani","9","laziness", "weights");
        Hero heroTwo = new Hero("Juan","10","speed", "faster bird");
        assertTrue(Hero.all().contains(heroOne));
        assertTrue(Hero.all().contains(heroTwo));
    }
    @Test
    public void clear_emptiesAllHeroesFromArrayList_0() {
        Hero hero = new Hero("Juan","8","speed", "faster bird");
        Hero.clear();
        assertEquals(Hero.all().size(), 0);
    }
    @Test
    public void getId_heroesInitiateWithAnID_1(){
        Hero.clear();
        Hero hero = new Hero("Juan","9","speed", "faster bird");
        assertEquals(1, hero.getId());
    }
    @Test
    public void find_returnsHeroWithSameId_heroTwo() {
        Hero hero = new Hero("Juan","9","speed", "faster bird");
        Hero heroTwo = new Hero("Juanita","19","sleep", "light");
        assertEquals(Hero.find(heroTwo.getId()), heroTwo);
    }


}
