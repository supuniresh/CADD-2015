package mysample;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.CodeSignature;

public aspect GetInfo {

	@Pointcut("call (* com.se.sampleApp..*.*(..))")
	public void traceMethodsInDemoPackage() {
	}

	@Before("traceMethodsInDemoPackage()")
	public void beforeTraceMethods(JoinPoint joinPoint) {
		// trace logic ..
		System.out.println("Calling " + joinPoint.getClass() + " "
				+ joinPoint.getSignature());
		printParameters(joinPoint);

	}

	@After("traceMethodsInDemoPackage()")
	public void afterTraceMethods(JoinPoint joinPoint) {
		// trace logic ..
		System.out.println("Called " + joinPoint.getClass() + " "
				+ joinPoint.getSignature());
		if (joinPoint.getTarget().getClass().getPackage().getName().equals("com.se.sampleApp.domain"))

		{
			printToString(joinPoint.getTarget());
		}
	}

	static private void printToString(Object obj) {
		System.out.println("--------------------------- Object info = " + ReflectionToStringBuilder.toString(obj)+" --------------------------------");
	}

	static private void printParameters(JoinPoint jp) {

		Object[] args = jp.getArgs();
		String[] names = ((CodeSignature) jp.getSignature())
				.getParameterNames();
		Class[] types = ((CodeSignature) jp.getSignature()).getParameterTypes();
		for (int i = 0; i < args.length; i++) {
			System.out.println("  " + i + ". " + names[i] + " : "
					+ types[i].getName() + " = " + args[i]);
		}
	}

	void processArgs(Object[] args) {
		for (Object obj : args) {
			System.out.println("Argument/Arguments of this method - "
					+ obj.toString());
		}
	}
}
