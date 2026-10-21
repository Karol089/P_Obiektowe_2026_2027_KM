package app;

import java.util.Arrays;

public class ExamResults {
    private int[] points;

    public ExamResults(int[] points) {
        this.points = Arrays.copyOf(points, points.length);
    }

    public ExamResults() {
        this(new int[0]);
    }

    public int[] getPoints() {
        return Arrays.copyOf(this.points, this.points.length);
    }
}
