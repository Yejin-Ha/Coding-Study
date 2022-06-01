public class Q1264 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
  
        ArrayList<String> as = new ArrayList<>();
        while(true) {
           String tmp = scan.nextLine();
           if(tmp.equals("#"))break;
           as.add(tmp);
        }
        
        for(int i=0; i<as.size(); i++) {
           int count=0;
           String s = as.get(i);
           for(int j=0; j<s.length(); j++) {
              if((s.charAt(j))=='a'||(s.charAt(j))=='A'
                    ||(s.charAt(j))=='e'||(s.charAt(j))=='E'
                    ||(s.charAt(j))=='i'||(s.charAt(j))=='I'
                    ||(s.charAt(j))=='o'||(s.charAt(j))=='O'
                    ||(s.charAt(j))=='u'||(s.charAt(j))=='U')count++;
           }
           System.out.println(count);
        }
        
        scan.close();
     }
  
}
