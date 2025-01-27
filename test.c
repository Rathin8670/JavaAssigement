#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>
#include <sys/wait.h>

int main() {
    pid_t child_pid;
    
    // Create a child process
    child_pid = fork();
    
    if (child_pid < 0) {
        // Fork failed
        perror("Fork failed");
        exit(1);
    }
    
    if (child_pid == 0) {
        // This is the child process
        printf("Child process created with PID: %d\n", getpid());
        printf("Child's parent PID: %d\n", getppid());
        
        // Child process exits immediately
        exit(0);
    } else {
        // This is the parent process
        printf("Parent process with PID: %d\n", getpid());
        printf("Created child PID: %d\n", child_pid);
        
        // Sleep for a while to ensure child becomes zombie
        printf("\nParent sleeping for 30 seconds. During this time:\n");
        printf("1. Run 'ps -l' in another terminal to see the zombie process\n");
        printf("2. Look for 'Z' in the STAT column\n\n");
        
        sleep(30);
        
        // Now we can wait for the child
        system("ps -l | grep 'Z'");
        
        // Finally, clean up the zombie
        wait(NULL);
        printf("\nChild has been reaped\n");
    }
    
    return 0;
}