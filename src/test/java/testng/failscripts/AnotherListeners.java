package testng.failscripts;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnotherListeners implements IAnnotationTransformer {  //ctrl+left click

    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        annotation.setRetryAnalyzer(ReRunFailedTCAutomatically.class);
    }
    }
