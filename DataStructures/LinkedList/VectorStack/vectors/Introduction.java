package DataStructures.LinkedList.VectorStack.vectors;
/* The Vector class is an implementation of the List interface that allows us to create resizable-arrays similar
 * to the ArrayList Class.
 * 
 * JAVA Vector vs ArrayList::
 * In Java, both ArrayList and Vector implements the List interface and provides the same functionalities.
 * However, there exist some differences between them. The vector class synchronizes each individual operation.This
 * means whenever we want to perform some operations on vectors, the Vector class automatically applies a lock to
 * that operation.However in ArrayLists methods are not synchronized.
 * 
 * NOTE:: It is recommended to use ArrayList in place of Vector because vectors are thread safe and are less
 * efficient.
 * 
 */
/*
 * In normal our machine takes 4 steps to calculate 2*7*3*6, but when we use synchronize keyword then our machine
 * execute it in 2 steps(2*7 in one slot and 3*6 in another slot)....So it becomes much faster. Samething is 
 * used in Gamings...So the graphic card is required.
 */
public class Introduction {
		//SYNCHRONIZED:::If 2 functions wants to take part simultaneously in an operation, then first function have
						//to wait and if 2nd does its job then first one again resumes its task.
	
	//Basically synchronize keyword locks that function and thread unlocks it.So it is thread safe.
	
	//Disadvantages:::::1>Time consuming.
//						2>ArrayList size increases 1.5Times but Vector size increase 2Times
}
