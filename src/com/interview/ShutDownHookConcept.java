package com.interview;

/*
 * Shutdown hooks are a special constructs that allows developers to plug in a piece of code to be executed,
 * while the JVM is shutting down
 * 
 * Common gotchas regarding shutdown hooks
 *  The first thing to keep in mind is that it is not guaranteed that 
 *  shutdown hooks will always run. If the JVM crashes due to some internal error,
 *  then it might crash down without having a chance to execute a single 
 *  instruction. 
 *  Also, if the O/S gives a SIGKILL (http://en.wikipedia.org/wiki/SIGKILL) 
 *  signal (kill -9 in Unix/Linux) or TerminateProcess (Windows), 
 *  then the application is required to terminate immediately without doing 
 *  even waiting for any cleanup activities. 
 *  In addition to the above, it is also possible to terminate the JVM 
 *  without allowing the shutdown hooks to run by calling Runtime.halt() method
 * 
 * 
 * Shutdown hooks are called when the application terminates normally 
 * (when all threads finish, or when System.exit(0) is called). 
 * Also, when the JVM is shutting down due to external causes such as a 
 * user requesting a termination (Ctrl+C), a SIGTERM being issued by O/S 
 * (normal kill command, without -9),
 * or when the operating system is shutting down
 * 
 * For more info 
 * https://practice.geeksforgeeks.org/tracks/module-1-basics-and-control-structures-java/?batchId=114#collapse5
 */

public class ShutDownHookConcept {

	public static void main(String[] args) {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				System.out.println("SHUT DOWN HOOK CALLED");
			}
		});
	}
}
