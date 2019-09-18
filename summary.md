1. What is the knowledge point of the test? Where is the official document to the knowledge point?
2. Why the test failed at first?
3. Why you corrected the test that way?
4. Do you have further questions on this knowledge point?

-- ExceptionTest --
-- Test1 should_customize_exception
1. How to create a customized exception https://www.codejava.net/java-core/exception/how-to-create-custom-exceptions-in-java
2. The test will throw error if run without code change. base from the given document link, i learned how to create my customized exception and run the test with no errors.
3. because i want to test new learning which is to create a customized exceptions
4. None

-- Test2 should_customize_exception_continued
1. How to create a customized exception with cause descriptions https://www.codejava.net/java-core/exception/how-to-create-custom-exceptions-in-java
2. The test will throw error if run without code change. base from the given document link, i learned how to create my customized exception with cause definition and run the test with no errors.
3. because i want to test new learning which is to create a customized exceptions with cause definition.
4. None

-- Test3 should_be_careful_of_the_order_of_finally_block
1. How to test try finally block
2. The test will throw error if run without code change. i read the code that call the method and write the expected result base from the code
3. i corrected the test that way to make the test success and base the result from the given line of code flow
4. None


-- Test4 should_use_the_try_pattern
1. Understanding try pattern https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
2. The test will throw error if run without code change. i read the document and find out that the try block automatically close the instantiated objects outside so when i changed the code without knowledge, i get test error at first and when i undertand the flow i change again and passed the test now
3. i corrected the test that way to make the test success and base the result from the given flow of logic
4. None

-- Test5 should_call_closing_even_if_exception_throws
1. Understanding close behaviour 
2. The test will throw error if run without code change. i dont know what happen in the flow test but from my understanding when try block is already ended it tried the close the last block of code which is ClosableWithException but exception happen and then try to close the upper code which ClosableWithoutException so my test failed at first and try again for second time and it failed again and after reading the overiding methods and flow of codes
3. i corrected the test that way to make the test success and base the result from the given flow of logic
4. None