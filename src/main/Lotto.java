package main;

public class Lotto {
    private int min = 1;
    private int max = 45;
    private int countOfNum = 6;

    public boolean isStop(String set)
    {
        if(set.equals("q") || set.equals("Q"))
            return true;

        return false;
    }

    public boolean isContinue(String set)
    {
        if(set.equals("s") || set.equals("S"))
            return true;

        return false;
    }

    public int[] getNum()
    {
        int []numbers = new int[countOfNum];
        int count =0;
        while (count< countOfNum) numbers[count++] = drawANum(numbers,count);
        return numbers;
    }

    private int drawANum(int [] nums, int count){
        while (true) {
            int number = getRandomNum();
            if(checkNotDuplicated(nums,count,number))
                return number;
        }
    }

    private int getRandomNum() {
        double num = Math.random();

        return (int)(num * 100 % max + min);
    }

    private boolean checkNotDuplicated(int [] nums, int count, int num){
        int c = 0;
        while (c < count) {
            if (num == nums[c++])
                return false;
        }

        return true;
    }

}
