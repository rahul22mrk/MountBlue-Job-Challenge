public static int viralAdvertising(int n) {
        
        int shared=5;
        int like=0;
        for(int i=1;i<=n;i++)
        {
            like=like+shared/2;
            shared=(shared/2)*3;
        }
        return like;

    }
