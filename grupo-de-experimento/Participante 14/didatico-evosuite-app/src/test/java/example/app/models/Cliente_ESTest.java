/*
 * This file was automatically generated by EvoSuite
 * Mon Sep 26 22:19:13 GMT 2022
 */

package example.app.models;

import org.junit.Test;
import static org.junit.Assert.*;
import example.app.models.Carteira;
import example.app.models.Cliente;
import example.app.models.Pessoa;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

// @RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Cliente_ESTest extends Cliente_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void getNomeTest() throws Throwable  {
      Pessoa pessoa0 = new Pessoa("", 20);
      String string0 = pessoa0.getNome();
      assertEquals("", string0);
  }
  
  @Test(timeout = 4000)
  public void setNomeTest()  throws Throwable  {
	  Pessoa pessoa0 = new Pessoa("", 20);
	  //String string0 = pessoa0.getNome();
	  pessoa0.setIdade(20);
	  assertEquals(20, pessoa0.getIdade());
  }

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Cliente cliente0 = new Cliente("0GhM*h<_L", (-158), "0GhM*h<_L", "V");
      cliente0.fone = "WEd";
      cliente0.fone = null;
      String string0 = cliente0.getFone();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Cliente cliente0 = new Cliente("", 0, "", "");
      String string0 = cliente0.getFone();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Cliente cliente0 = new Cliente("Cw$sYN93Xw\"Y'Z", (-1233), "", "d(43f!u\"iA>gw|dWeD");
      String string0 = cliente0.getEmail();
      assertEquals("", string0);
      assertEquals("d(43f!u\"iA>gw|dWeD", cliente0.getFone());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Cliente cliente0 = new Cliente("", 0, "", "");
      Carteira carteira0 = cliente0.getCarteira();
      assertNull(carteira0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Cliente cliente0 = new Cliente("example.app.models.Cliente", 2578, "n", "example.app.models.Cliente");
      Carteira carteira0 = new Carteira(0.0, (-1.0), 2578);
      cliente0.carteira = carteira0;
      Carteira carteira1 = new Carteira(2578, 2578, 2578);
      cliente0.carteira = carteira1;
      cliente0.getCarteira();
      assertEquals("n", cliente0.getEmail());
      assertEquals("example.app.models.Cliente", cliente0.getFone());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Carteira carteira0 = new Carteira((-1), (-1), (-2515.202332146312));
      Cliente cliente0 = new Cliente("X`pJIm%lP4 7c<I", (-1), "X`pJIm%lP4 7c<I", "example.app.models.Cliente", carteira0);
      Carteira carteira1 = cliente0.getCarteira();
      assertEquals("example.app.models.Cliente", cliente0.getFone());
      assertNotNull(carteira1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Carteira carteira0 = new Carteira(0, 0, 0);
      Cliente cliente0 = new Cliente("oYj*=lxw<*", 0, "Saldo insuficiente", "c9FBDOj26e9", carteira0);
      cliente0.setCarteira(carteira0);
      assertEquals("c9FBDOj26e9", cliente0.getFone());
      assertEquals("Saldo insuficiente", cliente0.getEmail());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Carteira carteira0 = new Carteira(0, 0, 0);
      Cliente cliente0 = new Cliente("oYj*=lxw<*", 0, "Saldo insuficiente", "c9FBDOj26e9", carteira0);
      assertEquals("c9FBDOj26e9", cliente0.getFone());
      
      cliente0.setFone("sgH,,");
      assertEquals("sgH,,", cliente0.getFone());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Carteira carteira0 = new Carteira(0, 0, 0);
      Cliente cliente0 = new Cliente("oYj*=lxw<*", 0, "Saldo insuficiente", "c9FBDOj26e9", carteira0);
      Carteira carteira1 = cliente0.getCarteira();
      assertNotNull(carteira1);
      assertEquals("Saldo insuficiente", cliente0.getEmail());
      assertEquals("c9FBDOj26e9", cliente0.getFone());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Cliente cliente0 = new Cliente((String) null, (-1), "", "");
      Carteira carteira0 = new Carteira(0.0, (-1), 191.0);
      cliente0.setCarteira(carteira0);
      assertEquals((-1), cliente0.getIdade());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Carteira carteira0 = new Carteira(0, 0, 0);
      Cliente cliente0 = new Cliente("oYj*=lxw<*", 0, "Saldo insuficiente", "c9FBDOj26e9", carteira0);
      String string0 = cliente0.getEmail();
      assertEquals("Saldo insuficiente", string0);
      assertNotNull(string0);
      assertEquals("c9FBDOj26e9", cliente0.getFone());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Carteira carteira0 = new Carteira(0, 0, 0);
      Cliente cliente0 = new Cliente("oYj*=lxw<*", 0, "Saldo insuficiente", "c9FBDOj26e9", carteira0);
      String string0 = cliente0.getFone();
      assertNotNull(string0);
      assertEquals("c9FBDOj26e9", string0);
      assertEquals("Saldo insuficiente", cliente0.getEmail());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Carteira carteira0 = new Carteira(0, 0, 0);
      Cliente cliente0 = new Cliente("oYj*=lxw<*", 0, "Saldo insuficiente", "c9FBDOj26e9", carteira0);
      assertEquals("Saldo insuficiente", cliente0.getEmail());
      
      cliente0.setEmail("sgH,,");
      cliente0.getEmail();
      assertEquals("c9FBDOj26e9", cliente0.getFone());
  }
}
