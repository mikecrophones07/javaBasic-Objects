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

-- Test6 should_get_method_name_in_stack_frame
1. How to get method and class name using stacktrace https://stackoverflow.com/questions/442747/getting-the-name-of-the-currently-executing-method
2. The test will throw error if run without code change. this is the first time i encounter this one and by checking the by putting stacktrace you can get class and method name. At first try, the test failed because i want to test if my value constructions is correct and after 2nd-3rd try, it finally succeed.
3. i corrected the test that way to make the test success and base the result from the understanding i get from the document.
4. None


-- InheritanceTest --
-- Test1 should_be_derived_from_object_class
1. Understanding inheritance of the parent class of all class which is object http://journals.ecs.soton.ac.uk/java/tutorial/java/javaOO/subclasses.html
2. The test will throw error if run without code change. Basing from the understanding in the document all class are under Objects so just try it in 1st try and my understanding is correct.
3. i corrected the test that way to make the test success and base answer to the expected result
4. None

-- Test2 should_call_super_class_constructor
1. Understanding inheritance with initialization on constructor
2. The test will throw error if run without code change. This is a general knowledge so i just read the flow of the code and write the correct answer. Only the run test once and it passed.
3. i corrected the test that way to make the test success and base the answer to the flow of the program and whats inside the constructor
4. None

-- Test3 should_call_super_class_constructor_continued
1. Same answer with Test2 should_call_super_class_constructor
2. Same answer with Test2 should_call_super_class_constructor
3. Same answer with Test2 should_call_super_class_constructor
4. Same answer with Test2 should_call_super_class_constructor

-- Test4 should_call_super_class_constructor_more
1. Understanding inheritance with initialization on constructor and super class
2. The test will throw error if run without code change. This is a general knowledge so i just read the flow of the code and i also know super class constructor so answered the test base on what i understand and test success in first try
3. i corrected the test that way to make the test success and base the answer to the flow of the program and whats inside the constructor and super class
4. None

-- Test5 should_call_most_derived_methods
1. Understanding overiding methods
2. The test will throw error if run without code change. This is a general knowledge so i just read the flow of the code and i also know overiding methods so i just put the answer correctly on try.
3. i corrected the test that way to make the test success and base the answer to the flow of the program and whats inside the constructor and super class
4. None

-- Test6 should_call_super_class_methods
1. Same answer with Test5 should_call_most_derived_methods
2. Same answer with Test5 should_call_most_derived_methods
3. Same answer with Test5 should_call_most_derived_methods
4. Same answer with Test5 should_call_most_derived_methods

-- Test7 should_use_caution_when_dealing_with_array_type
1. Understanding array type casting
2. The test will throw error if run without code change. i dont really get the what happen in the test but i think because casting issue with null values but im not sure why it happens so i write my answer and it failed at first and at my second try it succeed.
3. i corrected the test base from the actual result
4. why exception happen in the try when the exception happens outside the class? is there any explanation why it exception occurs inside the try block.

Test8 should_not_make_you_confused
1. Understanding objects that inherits a class and initializing the objects to inherited class
2. The test will throw error if run without code change. this is general knowledge from inheritance, the result is like casting the child to the inherited class but will remain the class because the class is inheriting the parent class so as expected it will get the function from the main class and not the inherited class so i run the test once it succeed
3. i corrected the test base from what is expected and what is my understanding with inheritance
4. None

Test9 should_not_make_you_confused_2
1. Understanding objects that inherits a class 
2. The test will throw error if run without code change. this is general knowledge from inheritance, when it inherits the class, it gets the other method from the inherited the class so i write the answer and run the test once and it succeed.
3. i corrected the test base from what is expected and what is my understanding with inheritance
4. None

Test10 should_use_instance_of_to_determine_inheritance_relationship
1. Understanding instance of to determine inherited class https://www.armedia.com/blog/instanceof-avoid-in-code/
2. The test will throw error if run without code change. i base the knowledge from the document and what instance of describe is it identify the instance of specified of classes/interface/etc.. now basing from the inheritance we can actually tell that it can be instance to the class defined from the assert since the first class is inheriting the parent classes so i write the answers base from what i understand and run the test once and it succeed.
3. i corrected the test base from what is expected and what is my understanding with inheritance with instance of 
4. None

Test11 should_use_instance_of_only_in_inheritance_relationship
1. same with test10  
2. The test will throw error if run without code change. base from my understanding from test10 the only difference is that long and integer are not the same, they have the different bytes so the answer is clear. i run the test once and it succeed.
3. i corrected the test base from what is expected and what is my understanding with inheritance with instance of 
4. None

Test12 should_write_perfect_equals_1
1. creating an equal function that will check an object of an object
2. The test will throw error if run without code change. i set up a proper checking to check inside of an object and run the test and it succeed.
3. i corrected the test base from what is expected
4. None

Test13 should_write_perfect_equals_2
1. Same answer with test12
2. Same answer with test12
3. Same answer with test12
4. Same answer with test12

Test14 should_write_perfect_equals_3
1. Same answer with test12
2. Same answer with test12
3. Same answer with test12
4. Same answer with test12

Test15 should_write_perfect_equals_4
1. Same answer with test12
2. Same answer with test12
3. Same answer with test12
4. Same answer with test12

Test16 should_write_perfect_equals_5
1. Same answer with test12
2. Same answer with test12
3. Same answer with test12
4. Same answer with test12

Test17 should_write_perfect_equals_6
1. Same answer with test12
2. Same answer with test12
3. Same answer with test12
4. Same answer with test12

Test18 should_write_perfect_equals_7
1. understanding hashcode values https://www.baeldung.com/java-hashcode
2. The test will throw error if run without code change. by reading the documents, i learned that hashcode is the unique hashing algorithm that encrypt a specific value. i learned that every objects can use .hashcode so i used it directly with the property that the class has and test it once and passed.
3. to align and test the hashcode value of the value
4. none

--ObjectTest
Test1 should_point_to_the_same_object
1. understand objects reference/address passing
2. The test will throw error if run without code change. by checking on the code, it simply pass the object to object without initializations so we expect that they carry the same value so after writing the answer and test it, it succeed.
3. to align the expected result to the actual and to test whether they have same value or not 
4. none

Test2 should_point_to_different_object
1. understand pointing of different objects
2. The test will throw error if run without code change. by checking on the code, they initialize two different objects with same values so as expected if two objects are instantiate with same value, they differ in the address of the object so they are different so when i write the answer and run the test once, it succeed.
3. to align the expected result to the actual and to test whether they have same value or not 
4. none

Test3 should_initialized_to_default_value
1. understand initialized default value
2. The test will throw error if run without code change. by checking on the code, it seem that the class is initialized but value property was not set so the default value is null or 0 depending on the type so i set all values to null and 0 and test it once and it succeed.
3. to align the expected result to the actual and to test whether they have same value or not 
4. none

Test4 should_pass_by_value
1. understand methods with pass by value
2. The test will throw error if run without code change. by checking on the code, it simply pass the value on the method and doesn't return the value so as expected it will not return the final on the main method so the value will still remain so as i run the test onces, it succeed successfully.
3. to align the expected result to the actual and to test whether they have same value or not 
4. none

Test5 should_pass_by_value_continued
1. understand methods with pass by value with returning values
2. The test will throw error if run without code change. by checking on the code, it simply pass the value on the method and return the value so as expected it will return the final value on the main method so the value will be a new object so if you test it it will fail so i choose the other object that instantiate the same object value so i run the test with the same object value and it succeed.
3. to align the expected result to the actual and to test whether they have same value or not 
4. none

Test6 should_modify_internal_state
1. understand modify internal state
2. The test will throw error if run without code change. by checking on the code, the method pass object value that didn't return a value, as i understand, when you pass an object value to pass a value method, the object reference will change also but if primitive type objects like integer, string, long and etc. it will not affect the value thus will not change the value so when i run the test with change value once, it succeed 
3. to align the expected result to the actual and to test whether they have same value or not 
4. none

Test7 should_choose_method_at_compile_time
1. understand modify internal state
2. The test will throw error if run without code change. by checking on the code, it simply aligned the test parameter per method and will check what to pass back in main method, since object is passed then the return string should be the one in object type parameter pass by value with return so i test it once and it succeed.
3. to align the expected result to the actual and to test whether they have same value or not 
4. none


Test8 should_calling_another_constructor
1. understand constructor and calling another constructor in a constructor and initialization inside
2. The test will throw error if run without code change. by checking on the code, when the object was initialized, we saw that constructor is calling another constructor and setting the objects inside the constructor so as expected object that is initialized will be saved until the object in the main class is not initialized so it will return the value that was set in the constructor so when i run the test once, it succeed.
3. to align the expected result to the actual and to test whether they have same value or not 
4. none

Test9 should_calling_another_constructor
1. understand constructor and calling another constructor in a constructor and initialization inside
2. The test will throw error if run without code change. by checking on the code, when the object was initialized, we saw that constructor is calling another constructor and setting the objects inside the constructor so as expected object that is initialized will be saved until the object in the main class is not initialized so it will return the value that was set in the constructor so when i run the test once, it succeed.
3. to align the expected result to the actual and to test whether they have same value or not 
4. none

Test10 should_get_initialization_ordering
1. understand initialization ordering https://stackoverflow.com/questions/32558900/are-java-global-variables-guaranteed-to-initialize-first
2. The test will throw error if run without code change. by checking on the code, we can check that after initialization of object in the main method constructor was called and there is a global variable, as we saw in the document global variable are initialized first before constructor was being executed so we saw that 4 string are being get in the logs so in first try it failed because i taught constructor is the one who will be called when initialized so i try again base from the document that i read in it succeed in the second time.  
3. to align the expected result to the actual and to test whether they have same value or not 
4. none

Test11 should_get_message_of_var_length_parameters
1. to understand how parameter are being constructed by using the length of the parameters.
2. The test will throw error if run without code change. by checking on the code, it simply pass array of parameter and simply iterate the number of object and append each object to one message so i tried to put the answer once and it succeed.
3. to align the expected result to the actual and to test whether they have same value or not 
4. none

Test12 should_get_message_of_var_length_parameters_2
1. same answer with test11
2. same answer with test11
3. same answer with test11
4. same answer with test11