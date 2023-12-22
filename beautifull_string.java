 public static int beautifulBinaryString(String b) {
    // Write your code here
        int ans = 0;
        for(int i=0; i<=b.length()-3; i++){
            String sub = b.substring(i , i+3);
            if(sub.equals("010")){
                char bArr[] = b.toCharArray();
                bArr[i+2] = '1';
                b = String.valueOf(bArr);
                ans++;    
            }
        }
        return ans;

    }
