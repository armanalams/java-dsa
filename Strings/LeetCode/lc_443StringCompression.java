class Solution {
    public int compress(char[] chars) {
        int j=0;
        for(int i=0; i<chars.length;)
        {
            char curr=chars[i];
            int count=0;

            while(i < chars.length && curr == chars[i])
            {
                count ++;
                i++;
            }

            chars[j++]=curr;

            if(count>1)
            {
                
                String str= String.valueOf(count);
                for(int k=0; k<str.length(); k++)
                {
                    chars[j++]=str.charAt(k);
                }
                

            }
        }

        return j;
        
    }
}
