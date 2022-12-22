static String catAndMouse(int x, int y, int z) {
        int catb=(int )Math.abs(z-y);
        int cata=(int)Math.abs(z-x);
        if(cata==catb)
        {
            return "Mouse C";
        }else if(catb<cata)
        {
            return "Cat B";
        }else{
            return "Cat A";
        }


    }
