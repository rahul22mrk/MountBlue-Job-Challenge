public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
        for(int i=0;i<grades.size();i++)
        {
            int temp=grades.get(i);
            if(temp>=38)
            {
                int r=temp%5;
                if(r>2)
                    grades.set(i,temp+5-r);
            }
        }
        return grades;

    }
