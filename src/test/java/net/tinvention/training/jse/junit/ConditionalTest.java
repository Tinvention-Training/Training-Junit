package net.tinvention.training.jse.junit;

import static org.junit.jupiter.api.condition.OS.LINUX;
import static org.junit.jupiter.api.condition.OS.MAC;
import static org.junit.jupiter.api.condition.OS.WINDOWS;

import static org.junit.jupiter.api.condition.JRE.JAVA_9;
import static org.junit.jupiter.api.condition.JRE.JAVA_8;
import static org.junit.jupiter.api.condition.JRE.JAVA_10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;;

class ConditionalTest {

	@Test
	@EnabledOnOs(MAC)
	void onlyOnMacOs() { /* ..*/ }
	
	@Test
	@EnabledOnOs({ LINUX, MAC })
	void onLinuxOrMac() { /* ..*/ }

	@Test
	@DisabledOnOs(WINDOWS)
	void notOnWindows() { /* ..*/ }

	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	@Test
	@EnabledOnOs(MAC)
	@interface TestOnMac {	}	

	@TestOnMac
	void testOnMac() { /* ..*/ }
	
	@Test
	@EnabledOnJre(JAVA_8)
	void onlyOnJava8() { /* ..*/ }
	
	@Test
	@EnabledOnJre({ JAVA_9, JAVA_10 })
	void onJava9Or10() { /* ..*/ }
	
	@Test
	@DisabledOnJre(JAVA_9)
	void notOnJava9() { /* ..*/ }
	
	
	

}
