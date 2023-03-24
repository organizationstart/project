/*
 * This file was automatically generated by EvoSuite
 * Mon Sep 26 22:18:13 GMT 2022
 */

package example.app.models;

import org.junit.Test;
import static org.junit.Assert.*;
import example.app.models.Carteira;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Carteira_ESTest extends Carteira_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Carteira carteira0 = new Carteira((-650.538551823452), (-650.538551823452), 0.0);
      carteira0.compraNoDebito((-650.538551823452));
      assertEquals((-650.538551823452), carteira0.saldoTotal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Carteira carteira0 = new Carteira((-2355.999273853816), 1.0, (-2355.999273853816));
      carteira0.compraSaldo((-2355.999273853816));
      assertEquals((-4711.998547707632), carteira0.getSaldo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Carteira carteira0 = new Carteira(0.0, 0.0, 0.0);
      double double0 = carteira0.saldoTotal();
      assertEquals(0.0, carteira0.getLimiteDebito(), 0.01);
      assertEquals(0.0, carteira0.getSaldo(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, carteira0.getLimiteCredito(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Carteira carteira0 = new Carteira((-727.5563483680716), (-3650.3607966822), (-203.95121365749));
      double double0 = carteira0.saldoTotal();
      assertEquals((-4581.868358707762), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Carteira carteira0 = new Carteira(0.0, 1555.1866392665322, 417.7768413161);
      double double0 = carteira0.getSaldo();
      assertEquals(1972.9634805826322, carteira0.saldoTotal(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Carteira carteira0 = new Carteira(2324.018253662, (-2215.0), 2324.018253662);
      assertEquals(2324.018253662, carteira0.getSaldo(), 0.01);
      
      carteira0.adicionaSaldo((-2215.0));
      double double0 = carteira0.getSaldo();
      assertEquals((-2215.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Carteira carteira0 = new Carteira((-592.54), (-592.54), (-592.54));
      carteira0.combinaSaldo();
      double double0 = carteira0.getLimiteDebito();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Carteira carteira0 = new Carteira(648.0, 648.0, (-838.3974));
      double double0 = carteira0.getLimiteDebito();
      assertEquals((-838.3974), double0, 0.01);
      assertEquals(457.60260000000005, carteira0.saldoTotal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Carteira carteira0 = new Carteira(0.0, 0.0, 0.0);
      double double0 = carteira0.getLimiteCredito();
      assertEquals(0.0, carteira0.getSaldo(), 0.01);
      assertEquals(0.0, carteira0.getLimiteDebito(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Carteira carteira0 = new Carteira(6149.5508, 6149.5508, (-2952.19846496588));
      double double0 = carteira0.getLimiteCredito();
      assertEquals(6149.5508, double0, 0.01);
      assertEquals(9346.903135034121, carteira0.saldoTotal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Carteira carteira0 = new Carteira((-592.54), (-592.54), (-592.54));
      carteira0.setLimiteDebito((-1.0));
      assertEquals((-1.0), carteira0.getLimiteDebito(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Carteira carteira0 = new Carteira((-592.54), (-592.54), (-592.54));
      carteira0.compraNoDebito(0.0);
      assertEquals((-1777.62), carteira0.saldoTotal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Carteira carteira0 = new Carteira(2324.018253662, (-2215.0), 2324.018253662);
      carteira0.compraNoCredito((-2215.0));
      assertEquals(2433.036507324, carteira0.saldoTotal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Carteira carteira0 = new Carteira((-592.54), (-592.54), (-592.54));
      carteira0.compraNoCredito((-1.0));
      assertEquals((-1777.62), carteira0.saldoTotal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Carteira carteira0 = new Carteira(2324.018253662, (-2215.0), 2324.018253662);
      carteira0.compraSaldo((-922.6779147158));
      assertEquals(1401.3403389462, carteira0.getSaldo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Carteira carteira0 = new Carteira((-592.54), (-592.54), (-592.54));
      carteira0.compraSaldo(1.0);
      assertEquals((-1777.62), carteira0.saldoTotal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Carteira carteira0 = new Carteira(2324.018253662, (-2215.0), 2324.018253662);
      carteira0.setLimiteCredito((-736.0631747));
      carteira0.compraNoCredito((-2215.0));
      assertEquals((-2215.0), carteira0.getLimiteCredito(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Carteira carteira0 = new Carteira(2324.018253662, (-2215.0), 2324.018253662);
      double double0 = carteira0.getLimiteDebito();
      assertEquals(2324.018253662, double0, 0.01);
      assertEquals(2433.036507324, carteira0.saldoTotal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Carteira carteira0 = new Carteira(2324.018253662, (-2215.0), 2324.018253662);
      carteira0.combinaSaldo();
      carteira0.compraNoDebito(0.0);
      assertEquals(0.0, carteira0.getLimiteDebito(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Carteira carteira0 = new Carteira(2324.018253662, (-2215.0), 2324.018253662);
      carteira0.setSaldo((-736.0631747));
      assertEquals((-736.0631747), carteira0.getSaldo(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Carteira carteira0 = new Carteira(2324.018253662, (-2215.0), 2324.018253662);
      double double0 = carteira0.getSaldo();
      assertEquals(2324.018253662, double0, 0.01);
      assertEquals(2433.036507324, carteira0.saldoTotal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Carteira carteira0 = new Carteira(2324.018253662, (-2215.0), 2324.018253662);
      double double0 = carteira0.saldoTotal();
      assertEquals(2433.036507324, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Carteira carteira0 = new Carteira(2324.018253662, (-2215.0), 2324.018253662);
      double double0 = carteira0.getLimiteCredito();
      assertEquals((-2215.0), double0, 0.01);
      assertEquals(2433.036507324, carteira0.saldoTotal(), 0.01);
  }
}
