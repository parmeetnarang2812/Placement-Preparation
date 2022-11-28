class Solution {

    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> Answer = new ArrayList<>();

        int[] onlyWin = new int[100001];

        int[] onlyloss = new int[100001];

        for (int i = 0; i < matches.length; i++) {
            onlyWin[matches[i][0]] += 1;

            onlyloss[matches[i][1]] += 1;
        }

        List<Integer> winner = new LinkedList<>();

        List<Integer> losser = new LinkedList<>();

        for (int i = 0; i < 100001; i++) {
            if (onlyWin[i] > 0 && onlyloss[i] <= 0) {
                winner.add(i);
            }

            if (onlyloss[i] == 1) {
                losser.add(i);
            }
        }

        Answer.add(winner);

        Answer.add(losser);

        return Answer;
    }
    
}
