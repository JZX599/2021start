package 排序算法.快速排序;

/**
 * @title: main
 * @Auther: jzx
 * @Date: 2021/3/14 15:10
 */
public class main {

    public static void main(String[] args)
    {
        int[] arr={3,5,2,1,5,6,6,2,4,7,22,35,77,11,66,2,44,55,33,44,663,64363,235,234,66,25,67,235,6,25};
        quickSort(arr,0,arr.length-1);
        for(int a:arr)
            System.out.print(a+",");
    }

    public static void quickSort(int[] arr,int start,int end)
    {
        if(start>=end)
            return;

        //以最左边的数字为基准
        int keyValue = arr[start];
        int leftPtr = start;
        int rightPtr = end;

        while(leftPtr<rightPtr)
        {
            //从右往左扫描,当扫描到比基准值大的值，或者左边指针大于右边指针，
            while(rightPtr>leftPtr&&arr[rightPtr]<=keyValue)
                rightPtr--;

            //如果是因为扫描到比基准值大的数字而结束循环，则交换数字
            if(arr[rightPtr]>keyValue)
            {
                int temp = arr[rightPtr];
                arr[rightPtr] = keyValue;
                arr[leftPtr] = temp;
            }

            //从左向右扫描
            while(leftPtr<rightPtr&&arr[leftPtr]>=keyValue)
                leftPtr++;

            if(arr[leftPtr]<keyValue)
            {
                int temp = arr[leftPtr];
                arr[leftPtr] = keyValue;
                arr[rightPtr] = temp;
            }
        }
        quickSort(arr,start,leftPtr-1);
        quickSort(arr,rightPtr+1,end);
    }
}
