class ReduceNumber {
    public int numberOfSteps(int num) {
        int step = 0; //steps taken
        while(num > 0){
            if(num % 2 == 0){
                num = num / 2; //reduce by 2
                step++;
            }
            else{
                num = num - 1; //reduce 1 to make division
                step++;
            }
        }
        return step; //return steps taken
    }
}