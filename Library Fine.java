public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
    // Write your code here
        
        //return 1- due 2
        int fine=0;
        if(y1<y2)
            return 0;
        else if(y1>y2)
            return 10000;
        else if(m1<m2)
        {
            return 0;
        }else if(m1>m2)
        {
            fine=500*(m1-m2);
        }else if(d1>d2)
        {
            fine=15*(d1-d2);
        }else{
            return 0;
        }
        return fine;
    }
