class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue_studens = new LinkedList<>();
        Queue<Integer> queue_sandwiches = new LinkedList<>();
        int rejected = 0;

        for (int student : students) {
            queue_studens.offer(student);
        }

        for (int sandwich : sandwiches)
            queue_sandwiches.offer(sandwich);

        while (!queue_studens.isEmpty() && rejected < queue_studens.size()) {
            if (queue_sandwiches.peek() == queue_studens.peek()) {
                queue_studens.poll();
                queue_sandwiches.poll();
                rejected = 0;
            }
            else {
                queue_studens.offer(queue_studens.poll());
                rejected++;
            }
        }

        return rejected;
    }
}