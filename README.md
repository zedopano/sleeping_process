# Process Scheduler (Round-Robin Simulation)

**Authors:** Henrique França, Gabriel Menezes, Yuri Cavalcante

##  Overview
This project implements a **round-robin process scheduler** using a **circular linked list**.  
It simulates the execution of processes with a fixed **time quantum** and demonstrates how operating systems handle CPU scheduling in a fair, cyclic manner.

The program:
- Reads process information from a file (`entrada.txt`)
- Stores processes in a circular list
- Executes them in time slices (quantum)
- Marks processes as finished when their required cycles are consumed
- Displays execution order and final state

This is a didactic implementation intended for educational purposes in **Operating Systems** and **Software Engineering** courses.

---

##  Project Structure

| File               | Description |
|--------------------|-------------|
| **Main.java**      | Entry point of the application. Initializes the `Scheduler`, loads processes, displays them, and starts the simulation. |
| **Scheduler.java** | Core scheduling logic. Manages the process list, applies the round-robin algorithm, and controls execution using the defined quantum. |
| **ListaDeProcessos.java** | Wrapper for the `listaCircular` class, exposing high-level operations like adding, removing, and searching processes. |
| **listaCircular.java** | Implementation of the circular linked list. Stores processes and allows traversal in a continuous loop. |
| **Processo.java**  | Represents a process, including attributes such as `id`, `name`, `priority`, `required cycles`, and `resource`. Also holds a pointer to the next process. |
| **LerArquivo.java** | Utility class that reads process data from a file and populates a `ListaDeProcessos`. |
| **Node.java**      | Generic node implementation (not strictly required for the process list but available for future use). |

---

##  How It Works

1. **Load Processes**  
   The program reads the `entrada.txt` file, where each line contains process data such as ID, name, priority, cycles, and resource.

2. **Store in a Circular List**  
   The `listaCircular` class links all processes in a circular structure, allowing constant-time traversal without reaching a `null` endpoint.

3. **Apply Round-Robin Scheduling**
    - Each process runs for a fixed **quantum** (100 units by default).
    - After each quantum, the scheduler moves to the next process.
    - If a process has no remaining cycles, it is marked as **finished** and removed from the list.

4. **Display Execution Results**  
   The program prints process execution order and the final state of the queue.

---

##  How to Run

1. **Compile all files**
```bash
javac *.java
```

2. **Prepare input file**
   Create a file named `entrada.txt` with process data (one per line, e.g.):
```
1,P1,2,300,Printer
2,P2,1,500,Disk
3,P3,3,200,Network
```

3. **Run the program**
```bash
java Main
```

4. **Expected Output**
- List of loaded processes
- Step-by-step simulation of execution
- Final state after all processes are completed

---

##  Technologies Used
- **Java** (standard libraries only)
- **OOP concepts** (encapsulation, modular design)
- **Circular linked list** data structure
- **Round-robin scheduling algorithm**

---

##  Possible Improvements
- Add support for **dynamic quantum** (based on priority)
- Implement **I/O blocking simulation** (pause and resume processes)
- Add **GUI visualization** for process queue and execution timeline
- Save execution logs to a file for later analysis
