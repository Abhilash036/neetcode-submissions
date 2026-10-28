class Solution {
    public boolean isPalindrome(String s) {
        boolean flag=true;
        int p1=0;
        char[] ch = s.toCharArray();
        String str="";
        for(char c:ch){
            if((c>='A' && c<='Z') || (c>='a' && c<='z') || (c>='0' && c<='9')){
                str+=c;
            }
        }
        int p2 = str.length()-1;
        while(p1<p2){
            if(Character.toUpperCase(str.charAt(p1))             !=Character.toUpperCase(str.charAt(p2))){
                flag=false;
            }
            p1++;
            p2--;
        }
        return flag;
    }
}
