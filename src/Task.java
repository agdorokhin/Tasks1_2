public class Task implements Comparable<Task>{
    private String name;
    private Priority priority;
    private Complexity complexity;


    public Task(String name, String priority, String complexity){
        this.name = name;
        this.priority = Priority.valueOf(priority);
        this.complexity = Complexity.valueOf(complexity);
        }

        public String getName(){
            return name;
        }
        public Priority getPriority() {
            return priority;
        }
        public Complexity getComplexity() {
            return complexity;
        }

        public String toString() {
            return name + " (Priority: " + priority + ", Complexity: " + complexity + ")";
        }

        @Override
        public int compareTo(Task task1) {
            return task1.getPriority().compareTo(this.getPriority());
        }

}
