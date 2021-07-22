package oops.ExceptionHandling;

/* Exception is an error event that can happen during the execution of a program and disrupts its normal flow.
 * 
 * Exceptions in java can arise from different kind of situations such as wrong data entered by user, hardware failure, network
 * connection failure, Database server down etc.
 * 
 * Java provides a robust and object oriented way to handle exceptions scenarios, known as JAVA EXCEPTION HANDLING
 *  
 */


/*  Java being OOP language, whenever an error occurs while executing statement, creates an "EXCEPTION OBJECT".The exception object
 * contains a lot of debugging information such as method hierarchy, line number where the exception occurred, type of exception etc.
 * 
 * The normal flow of the program halts and JRE tries to find someone that can handle the raised exception
 * 
 * When the exception occurs in the method, the process of creating the exception object and handing it over to runtime 
 * environment is called exception "THROWING THE EXCEPTION"
 * 
 */


/* Once runtime receives the exception object, it tries to find the handler for the exception.Exception Handler in a block of code
 * that can process the exception object.
 * 
 * The logic to find exception handler is simple -- Starting the search in the method where error occurred, if no appropriate handler
 * found, then move to the caller method and so on. So if method call stack is A->B->C and exception is raised in method C, then the
 * search for appropriate handler will move from C->B->A.
 * 
 * If appropriate exception Handler is found, exception object is passed to the handler to process it. The handler is said to be
 * "CATCHING THE EXCEPTION".
 */

/* Throw-- The throw keyword in java is used to explicitly throw an exception from a method or any block of code
 * 
 * The throws---Keyword in java is used in the signature of method to indicate that this method might throw one of the listed type 
 * exceptions.The caller to these methods has to handle the exception using try-catch block.
 * 
 */

public class intro {

}
