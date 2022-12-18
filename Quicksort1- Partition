public static List<Integer> quickSort(List<Integer> arr) {
    // Write your code here
        int pivot=arr.get(0);
        int i=0;
        int j=arr.size();
        
        while(true)
        {
            do{
                i++;
            }while(arr.get(i)<pivot);
            
            do{
                j--;
            }while(arr.get(j)>pivot);
            
             if (i >= j) 
             {
                break;
            }
                
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            
            
        }
        
            arr.set(0,arr.get(j));
            arr.set(j,pivot);
        return arr;

    }
