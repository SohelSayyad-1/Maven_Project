package testng.failscripts;

import org.testng.Assert;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReRunFailedTCAutomatically implements IRetryAnalyzer {

    // code for run failed tests automatically
    // add this to every tests like this    @Test(retryAnalyzer = ReRunFailedTCAutomatically.class) but this is time consuming we avoid
    // instead of this we use -
   /* public class AnotherListeners implements IAnnotationTransformer {
        public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
            annotation.setRetryAnalyzer(ReRunFailedTCAutomatically.class);
        }
    }*/
    private int retryCount=0;
    private static final int maxRetryCount=3;  // its for how many times failed tests should run

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (retryCount < maxRetryCount) {
            retryCount ++;
            return true;
        }
        return false;
        }
}
