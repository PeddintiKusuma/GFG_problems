class Solution {

    void mergeSort(int arr[], int l, int r) {
        if(l>=r)
            return;
        
        int m=l+(r-l)/2;
        mergeSort(arr,l,m);//left part
        mergeSort(arr,m+1,r);//right part split till single element
        merge(arr,l,m,r);//calling method 
        
    }
    
    void merge(int arr[],int l, int m, int r){
        int[] temp=new int[r-l+1];//original arr length
        //temp arr used to stored the merged arr elements
        int i=l;
        int j=m+1;
        int k=0;
        while(i<=m &&j<=r){//left subarray and right subarray
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //copy the remaining elements in the left sub array
        while(i<=m){
            temp[k]=arr[i];
            k++;
            i++;
        }
        //copy the remaining elements in the right sub array
        while(j<=r){
            temp[k++]=arr[j++];
        }
        //copy sorted elements back to the original array;
        for(int x=0;x<temp.length;x++){
            arr[l+x]=temp[x];
        }
        
    }
}