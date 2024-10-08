package DP;

import java.util.Arrays;

public class JobSequecingProblem {
    class Job {
        int id, profit, deadline;
        Job(int x, int y, int z){
            this.id = x;
            this.deadline = y;
            this.profit = z;
        }
    }

    int[] JobScheduling(Job arr[], int n)
    {
        // Sort jobs by profit in descending order
        Arrays.sort(arr, (p1, p2) -> p2.profit - p1.profit);

        // Find maximum deadline to determine the size of the hash array
        int maxDeadline = 0;
        for (int i = 0; i < n; i++) {
            maxDeadline = Math.max(maxDeadline, arr[i].deadline);
        }

        // Initialize the hash array with each index pointing to itself
        int[] parent = new int[maxDeadline + 1];
        for (int i = 0; i <= maxDeadline; i++) {
            parent[i] = i;
        }

        int totalProfit = 0;
        int countJobs = 0;

        // Iterate over the sorted jobs
        for (int i = 0; i < n; i++) {
            // Find the latest available slot for this job
            if (countJobs==maxDeadline)
                break;
            int availableSlot = find(parent, arr[i].deadline);

            // If a valid slot is found, schedule the job
            if (availableSlot > 0) {
                parent[availableSlot] = find(parent, availableSlot - 1); // Union step
                totalProfit += arr[i].profit;
                countJobs++;
            }
        }

        return new int[]{countJobs, totalProfit};
    }

    // Find function with path compression
    int find(int[] parent, int i) {
        if (parent[i] == i)
            return i;
        return parent[i] = find(parent, parent[i]);
    }
}
