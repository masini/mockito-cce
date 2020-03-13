# mockito-cce project

This project demostrate an Exception using Mockito with Quarkus 1.3.0.

To replicate run:
```
./mvnw test
```

you will get:

```
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 2.177 s <<< FAILURE! - in net.lucamasini.testcase.ExampleResourceTest
[ERROR] testHelloEndpoint  Time elapsed: 0.677 s  <<< ERROR!
org.mockito.exceptions.base.MockitoException: 

ClassCastException occurred while creating the mockito mock :
  class to mock : 'javax.servlet.http.HttpServletRequest', loaded by classloader : 'jdk.internal.loader.ClassLoaders$AppClassLoader@6ff3c5b5'
  created class : 'org.mockito.codegen.HttpServletRequest$MockitoMock$188783148', loaded by classloader : 'net.bytebuddy.dynamic.loading.MultipleParentClassLoader@510689af'
  proxy instance class : 'org.mockito.codegen.HttpServletRequest$MockitoMock$188783148', loaded by classloader : 'net.bytebuddy.dynamic.loading.MultipleParentClassLoader@510689af'
  instance creation by : ObjenesisInstantiator

You might experience classloading issues, please ask the mockito mailing-list.

	at net.lucamasini.testcase.ExampleResourceTest.testHelloEndpoint(ExampleResourceTest.java:18)
Caused by: java.lang.ClassCastException: class org.mockito.codegen.HttpServletRequest$MockitoMock$188783148 cannot be cast to class org.mockito.internal.creation.bytebuddy.MockAccess (org.mockito.codegen.HttpServletRequest$MockitoMock$188783148 is in unnamed module of loader net.bytebuddy.dynamic.loading.MultipleParentClassLoader @510689af; org.mockito.internal.creation.bytebuddy.MockAccess is in unnamed module of loader io.quarkus.bootstrap.classloading.QuarkusClassLoader @65f095f8)
	at net.lucamasini.testcase.ExampleResourceTest.testHelloEndpoint(ExampleResourceTest.java:18)

2020-03-13 16:53:28,727 INFO  [io.quarkus] (main) Quarkus stopped in 0.024s
```
