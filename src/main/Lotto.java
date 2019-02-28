package main;

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
        int lottoNum = (int)(num*100%max+min);
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
