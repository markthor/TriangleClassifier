package tests;

import logic.Classifier;
import logic.Type;

import org.testng.Assert;
import org.testng.annotations.Test;

import controller.Executor;

public class ExecutorTest {
  @Test
  public void testPositiveEquilateral() {
	  String[] args = new String[3];
	  args[0] = "1";
	  args[1] = "1.0";
	  args[2] = "1.000";
	  
	  Assert.assertEquals(Executor.validateAndClassify(args), Type.EQUILATERAL);
  }
  
  @Test
  public void testPositiveIsosceles() {
	  String[] args = new String[3];
	  args[0] = "1";
	  args[1] = "1.8";
	  args[2] = "1.000";
	  
	  Assert.assertEquals(Executor.validateAndClassify(args), Type.ISOSCELES);
  }
  
  @Test
  public void testPositiveScalene() {
	  String[] args = new String[3];
	  args[0] = "0.3";
	  args[1] = "2.8";
	  args[2] = "2.54";
	  
	  Assert.assertEquals(Executor.validateAndClassify(args), Type.SCALENE);
  }
  
  @Test
  public void testNegativeInputNotNumber() {
	  String[] args = new String[3];
	  args[0] = "1.5";
	  args[1] = "a";
	  args[2] = "2.54";
	  
	  Assert.assertFalse(Executor.isInputValid(args));
  }
  
  @Test
  public void testNegativeWrongNumberOfInputs() {
	  String[] args = new String[4];
	  args[0] = "%43";
	  args[1] = "2.8";
	  args[2] = "2.54";
	  args[3] = "2.54";
	  
	  Assert.assertFalse(Executor.isInputValid(args));
  }
}
