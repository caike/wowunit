package smallacts.wow.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CharacterTest {
	
	Character frodo;
	
	@Before
	public void setup(){
		frodo = new Character();
	}
	
	@Test
	public void newCharacterIsCreatedIdle(){
		assertEquals("idle", frodo.getMode());
	}
	
	@Test
	public void idleModeGetsAttacked(){
		frodo.getsAttacked("sword");
		assertEquals("combat", frodo.getMode());
	}

	@Test
	public void combatModeGetsAttacked(){
		frodo.setCombatMode();
		frodo.getsAttacked("sword");
		assertEquals("critical", frodo.getMode());
	}
	
	@Test
	public void idleModeGetsFooled(){
		frodo.getsAttacked("banana");
		assertEquals("idle", frodo.getMode());
	}
	
	
/*	
  	  As a wow Char
	  I want to get in combat mode when attacked with a sword
	  So that I can either kill my attacker or die with honor
	  
	  Scenario: Character is just created
	  	Given a character that does not exist
	  	When he is created
	  	Then he should be in idle mode

	  Scenario: Character in idle mode gets attacked
	    Given a character in idle mode
	    When he gets attacked with a sword
	    Then he should be in combat mode  
		And he should not be in idle mode
	  
	  Scenario: Character in combat mode gets attacked again
	    Given a character in combat mode
	    When he gets attacked with a sword
	    Then he should be in critical mode
		And he should not be in combat mode
		
	  
	  Scenario: Character in idle mode gets fooled
	    Given a character in idle mode
	    When he gets attacked with a banana
	    Then he should be in idle mode 
		And he should not be in combat mode
*/
	
	

}
