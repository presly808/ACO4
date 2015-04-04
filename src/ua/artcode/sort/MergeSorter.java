package ua.artcode.sort;

/**
 * Created by serhii on 29.03.15.
 */
public class MergeSorter {

    //
    private int[] buff;

    public MergeSorter() {
    }

    public void sort(int[] mas){
        buff = new int[mas.length];
        sort(mas,0,mas.length - 1);

    }

    private void sort(int[] mas, int start, int end){
        if(start >= end){
            return;
        }

        int mid = start + (end - start) / 2;

        sort(mas,start,mid);
        sort(mas,mid + 1,end);
        merge(mas, start,end,mid);
    }

    private void merge(int[] mas, int start, int end, int mid){
        for(int k = start; k <= end; k++){
            buff[k] = mas[k];
        }

        int i = start;
        int j = mid + 1;

        for(int k = start; k <= end; k++){
            if(j > end){
                mas[k] = buff[i++];
            } else if(i > mid){
                mas[k] = buff[j++];
            } else if(buff[i] < buff[j]){
                mas[k] = buff[i++];
            } else {
                mas[k] = buff[j++];
            }

        }


    }

}
