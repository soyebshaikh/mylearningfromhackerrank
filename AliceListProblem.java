/*Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.

The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).

The task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].
*/

//Always use get to get the value in the list

   public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        int alice = 0;
        int bob = 0;
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) alice++;
            if (a.get(i) < b.get(i)) bob++;
        }
        answer.add(0,alice);
        answer.add(1,bob);
        return answer;
    }
