package main;/*
    TDD란 테스트 주도 개발: 테스트가 개발을 이끌어 나가는 것.
    개발이 우선이 아닌 테스트를 기준으로 개발을 한단계씩 해나가는 것
    테스트를 하고, 통과하면 한단계 나아가고, 하는 방식
 */

public class Lotto {
    private int min = 1;
    private int max = 45;
    private int numofLotto = 6;
    public boolean isStop(String set)
    {
        if(set.equals("q")) return true;
        if(set.equals("Q")) return true;
        return false;
    }
    public boolean isRight(String set)
    {
        if(set.equals("s")) return true;
        if(set.equals("S")) return true;
        return false;
    }
    public int[] getNum(){
        int []numbers = new int[numofLotto];
        int count =0;
        while (count<numofLotto) numbers[count++] = notDuplicateNum(numbers,count);
        return numbers;
    }

    private int getRandomNum() {
        double num=Math.random();
        int lottoNum = (int)(num*100%45+1);
        return lottoNum;
    }
    private int notDuplicateNum(int [] nums, int count){
        while (true) {
            int number = getRandomNum();
            if(checkDuplicateNum(nums,count,number))
                return number;
        }
    }
    private boolean checkDuplicateNum(int [] nums, int count, int num){
        int c = 0;
        while (c<count) if(num ==nums[c++]) return false;
        return true;
    }

}
