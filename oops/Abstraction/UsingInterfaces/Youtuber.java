package oops.Abstraction.UsingInterfaces;
// can extend multiple interfaces
public abstract interface Youtuber extends VideoEditor{
	abstract void makeVideo();
	
	// After Java 8 we can make default method with body---We can override this or not its your choice per need
	//Cons: It is now prone to Diamond problem
	default void uploadVideo() {
		System.out.println("Uplaod video");
	}

}
