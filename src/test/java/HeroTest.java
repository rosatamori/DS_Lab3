import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HeroTest {
	
	//variables -------------------------
	HeroInterface warrior;
	HeroInterface archer;
	HeroInterface mage;
	HeroInterface badRace;
	HeroInterface badJob;
	
	//setup -----------------------------
	@BeforeEach
	void setUp() throws Exception{
		warrior = HeroFactory.createHero("ELF", "WARRIOR");
		archer = HeroFactory.createHero("DWARF", "ARCHER");
		mage = HeroFactory.createHero("ROBOT", "MAGE");
		
		badRace = HeroFactory.createHero("CARROT", "WARRIOR");
		badJob = HeroFactory.createHero("ROBOT", "PLUMBER");
	}
	
	
	//tests -----------------------------

	@Test
	void testElfWarriorGetters() {
		//when Elf Warrior STR 20, DEX 25, INT  20
		
		assertEquals("ELF", warrior.getRaceName());
		assertEquals("WARRIOR", warrior.getJobName());
		
		assertEquals(20, warrior.getSTR());
		assertEquals(25, warrior.getDEX());
		assertEquals(20, warrior.getINT());
	}
	
	@Test
	void testDwarfArcherGetters() {
		
		assertEquals("DWARF", archer.getRaceName());
		assertEquals("ARCHER", archer.getJobName());
		
		assertEquals(25, archer.getSTR());
		assertEquals(20, archer.getDEX());
		assertEquals(20, archer.getINT());
	}
	
	@Test
	void testRobotMageGetters() {
		
		assertEquals("ROBOT", mage.getRaceName());
		assertEquals("MAGE", mage.getJobName());
		
		assertEquals(20, mage.getSTR());
		assertEquals(20, mage.getDEX());
		assertEquals(25, mage.getINT());
	}
	
	//when val is 10
	@Test
	void testAttackWarrior10() {
		assertEquals(225, warrior.attack(10));
	}
	
	@Test
	void testAttackArcher10() {
		assertEquals(300, archer.attack(10));
	}
	
	@Test
	void testAttackMage10() {
		assertEquals(270, mage.attack(10));
	}
	
	//when val is 1
	@Test
	void testAttackWarrior1() {
		assertEquals(45, warrior.attack(1));
	}
	
	@Test
	void testAttackArcher1() {
		assertEquals(30, archer.attack(1));
	}
	
	@Test
	void testAttackMage1() {
		assertEquals(45, mage.attack(1));
	}
	
	//what happens when bad input is thrown? -> return null
	@Test
	void testBadInputRace() {
		assertNull(badRace);
	}
	
	@Test
	void testBadInputJob() {
		assertNull(badJob);
	}
}
