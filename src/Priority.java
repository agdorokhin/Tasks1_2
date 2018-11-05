public enum Priority {
        HIGH(1), MEDIUM(2), LOW(3);

        private final int pLevel; //Numeric representation of task priority
        Priority(int pLevel) {
                this.pLevel = pLevel;
        }

        public int getPriorityLevel() {
                return pLevel;
        }
}