package tests;

import logic.Classifier;
import logic.Type;

import org.testng.Assert;
import org.testng.annotations.Test;

import controller.Executor;

public class ClassifierTest {
  @Test
  public void testNegativeIllegalTriangle1() {
	  double a = 3.44;
	  double b = 3.7;
	  double c = 0.1;
	  
	  Assert.assertFalse(Classifier.isLegalTriangle(a, b, c));
  }
  
  @Test
  public void testNegativeIllegalTriangle2() {
	  double a = -1.3;
	  double b = 2.3;
	  double c = 3.4;
	  
	  Assert.assertFalse(Classifier.isLegalTriangle(a, b, c));
  }
  
  @Test
  public void testNegativeIllegalTriangle3() {
	  double a = 0.5;
	  double b = 1;
	  double c = 2;
	  
	  Assert.assertFalse(Classifier.isLegalTriangle(a, b, c));
  }
}
