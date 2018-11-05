public enum Complexity {
    COMPLEX(4), AVERAGE(2), SIMPLE(1);

    private final int hours; //How long each task takes to complete in hours
    Complexity(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

}