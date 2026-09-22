class Hello {
    public static void main(String[] args) {
        // A comment!
        // System.out.println("new dawn, new day!");

        boolean homework = false;
        boolean dueNextPeriod = false;

        if (homework && dueNextPeriod) {
            System.out.println("Homework is due next period, time to lock in!");
        } else if (homework && !dueNextPeriod){
            System.out.println("Homework isn't due right now ... I'll do it during 5th tomorrow.");
        } else {
            System.out.println("No homework due -- time to play Genshin!");
        }
    }
}