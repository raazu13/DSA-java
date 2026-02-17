class Solution {

    int count=0;
    String answer="";

    public String getPermutation(int n, int k) {

        help(n,k, new StringBuilder (), new boolean[n+1]);

        return answer;

    }

    private void help(int n, int k, StringBuilder current, boolean[] used){

        if(!answer.isEmpty()) {
            return;
        }

        if(current.length()==n){

            count++;
            if(count == k){
                answer=current.toString();
            }
            return;

        }

        for(int i=1; i<=n; i++){
            if(used[i]) continue;

            used[i]=true;

            current.append(i);
            help(n,k,current,used);
            current.deleteCharAt(current.length()-1);

            used[i]=false;
        }

    }
}
